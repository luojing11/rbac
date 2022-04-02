package com.qf.rbac.service;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.google.gson.Gson;
import com.qf.rbac.common.exception.AppException;
import com.qf.rbac.common.result.ResponseEnum;
import com.qf.rbac.config.SmsConfig;
import com.qf.rbac.entity.User;
import com.qf.rbac.entity.dto.LoginDTO;
import com.qf.rbac.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class SmsService {

    @Autowired
    private SmsConfig smsProperties;

    /**
     *  发验证码短信
     */
    public void sendCheckCode(String phone,String code){
        DefaultProfile profile = DefaultProfile.getProfile(smsProperties.getRegionId(),
                smsProperties.getAccessKeyId(), smsProperties.getAccessSecret());

        IAcsClient client = new DefaultAcsClient(profile);

        // 发短信的请求对象
        CommonRequest request = new CommonRequest();
        request.setSysMethod(MethodType.POST);
        request.setSysDomain("dysmsapi.aliyuncs.com");
        request.setSysVersion("2017-05-25");
        request.setSysAction("SendSms");
        request.putQueryParameter("RegionId", smsProperties.getRegionId());
        request.putQueryParameter("PhoneNumbers", phone);
        request.putQueryParameter("SignName", smsProperties.getSignName());
        request.putQueryParameter("TemplateCode", "SMS_150182900");

        Map<String,Object> map = new HashMap<>();
        map.put("code",code);  // fastjson  springmvc jackson  gson
        Gson gson = new Gson();
        request.putQueryParameter("TemplateParam", gson.toJson(map));

        // 发短信的响应对象
        CommonResponse response = null;
        try {
            response = client.getCommonResponse(request);
            System.out.println(response);
            System.out.println(response.getData());
        } catch (ClientException e) {
            throw new AppException(ResponseEnum.SMS_SEND_FAIL);
        }

        // 判断返回的code
        // 吧返回的json 字符串转成一个map
        Map<String,String> map1 = gson.fromJson(response.getData(),Map.class);
        System.out.println("返回的json 字符串转成一个map:"+map1);
        String code1 = map1.get("Code");

        if ("isv.BUSINESS_LIMIT_CONTROL".equals(code1)) {
            throw new AppException(ResponseEnum.SMS_SEND_ERROR_BUSINESS_LIMIT_CONTROL);
        }

        if (!"OK".equals(code1)) {
            throw new AppException(ResponseEnum.SMS_SEND_FAIL);
        }

    }

    @Autowired
    private UserMapper userMapper;

    /**
     * 手机号码登录
     * @param phone
     * @param code
     * @return
     */
    public LoginDTO tellogin(String phone, String code){
        LoginDTO loginDTO = userMapper.selectUserByPhone(Long.valueOf(phone));
        if (loginDTO==null){
            User user1 = User.builder()
                    .phone(Long.valueOf(phone))
                    .createTime(new Date())
                    .roleid(2)
                    .roles("user")
                    .isvip(false) //
                    .isDeleted((byte)1)
                    .build();
            // 将用户手机号码保存到数据库
            userMapper.insert(user1);
        }
        // 返回
        LoginDTO loginDTO1 = userMapper.selectUserByPhone(Long.valueOf(phone));
        return loginDTO1;
    }

}
