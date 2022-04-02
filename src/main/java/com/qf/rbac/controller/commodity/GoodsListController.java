package com.qf.rbac.controller.commodity;

import com.qf.rbac.common.result.R;
import com.qf.rbac.common.result.ResponseEnum;
import com.qf.rbac.entity.SysUser;
import com.qf.rbac.entity.commodity.GoodsList;
import com.qf.rbac.entity.commodity.GoodsListBlobs;
import com.qf.rbac.entity.commodity.GoodsListBlobsImage;
import com.qf.rbac.entity.dto.GoodsListDTO;
import com.qf.rbac.mapper.SysUserMapper;
import com.qf.rbac.mapper.commodity.GoodsListMapper;
import com.qf.rbac.service.commodity.GoodsListService;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.MultipartConfigElement;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

@Slf4j
@RestController
@RequestMapping("/good")
public class GoodsListController {

    @Autowired
    public GoodsListService goodsListService;

    @Autowired
    public GoodsListMapper goodsListMapper;

//    @Autowired
//    private SysUserMapper sysUserMapper;


    //根据商户id查询对应的商品信息
    @GetMapping("/list")
    public R selectGoodsListDTO(HttpSession session){
//        String username=(String)session.getAttribute("username");
//        System.out.println(username);
//        SysUser sysUser=sysUserMapper.selectUser(username);
        List<GoodsListDTO> goodsListDTOS=goodsListService.selectGoodsListDTO(1);
//        List<GoodsListDTO> good=new ArrayList<GoodsListDTO>();
//        Map<List<GoodsListDTO>, List<GoodsListDTO>> map=new HashMap<>();
//        map.put(goodsListDTOS,good);
//        good.addAll(goodsListDTOS);
        return new R(ResponseEnum.SUCCESS,goodsListDTOS);
    }

    //根据条件查询对应的商品
    @PostMapping("/query")
    public R selectQuery(String goodsName,String goodsNumber,Integer putaway,Integer type){
        List<GoodsListDTO> selectQuery=goodsListService.selectQuery(goodsName,goodsNumber,putaway,type);
        return new R(ResponseEnum.SUCCESS,selectQuery);
    }

    //删除商品
    @PostMapping("/delect")
    public R delectGoos(Integer id){
      int a=goodsListService.deleteByPrimaryKey(id);
      return new R(ResponseEnum.SUCCESS,a);
    }

    //修改商品
    @PostMapping("/update")
    public R updateGoos(GoodsList goodsList,@RequestPart("file")MultipartFile[] file,@RequestPart("file1")MultipartFile file1,@RequestPart("file2")MultipartFile[] file2){
        if (file1!=null) {
            String name = file1.getOriginalFilename();
            try {
                // 存放在D盘
                String originalFilename = file1.getOriginalFilename();
                file1.transferTo(new File("D:\\file1\\" + originalFilename));
            }catch (IOException e){
                e.printStackTrace();

            }

        }
        if (file.length > 0) {
            for (MultipartFile multipartFile : file) {
                log.info(multipartFile.getOriginalFilename());
                try {
                    String originalFilename = multipartFile.getOriginalFilename();
                    multipartFile.transferTo(new File("D:\\file\\" + originalFilename));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        if (file2.length > 0) {
            for (MultipartFile multipartFile : file2) {
                log.info(multipartFile.getOriginalFilename());
                try {
                    String originalFilename = multipartFile.getOriginalFilename();
                    multipartFile.transferTo(new File("D:\\file2\\" + originalFilename));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        int u=goodsListService.updateByPrimaryKey(goodsList);
        return new R(ResponseEnum.SUCCESS,u);
    }


    @RequestMapping(value = "/insert",method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public R insertGoos(GoodsList goodsList,@RequestPart("file")MultipartFile[] file,@RequestPart("file1")MultipartFile file1,@RequestPart("file2")MultipartFile[] file2){
        if (goodsList !=null){
            if (file1!=null) {
                String name = file1.getOriginalFilename();
                try {
                    // 存放在D盘
                    String originalFilename = file1.getOriginalFilename();
                    file1.transferTo(new File("D:\\file1\\" + originalFilename));
                }catch (IOException e){
                    e.printStackTrace();

                }

            }
            if (file.length > 0) {
                for (MultipartFile multipartFile : file) {
                    log.info(multipartFile.getOriginalFilename());
                    try {
                        String originalFilename = multipartFile.getOriginalFilename();
                        multipartFile.transferTo(new File("D:\\file\\" + originalFilename));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (file2.length > 0) {
                for (MultipartFile multipartFile : file2) {
                    log.info(multipartFile.getOriginalFilename());
                    try {
                        String originalFilename = multipartFile.getOriginalFilename();
                        multipartFile.transferTo(new File("D:\\file2\\" + originalFilename));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            int u=goodsListService.insertSelective(goodsList);
            return new R(ResponseEnum.SUCCESS,u);
        }
        return new R(ResponseEnum.SERVER_DO_ERROR,0);
    }

    //根据id批量删除
    @PostMapping("/selectIds")
    public int deleteUserAllById(@ApiParam(name = "id",value = "用户id",required = true) @RequestParam(required = true) String id){
        List idList = new ArrayList();
        String[] strs = id.split(",");
        for (String str:strs){
            idList.add(str);
        }
        return goodsListService.deleteUserAllById(idList);
    }

    /**
     * 批量上下架商品
     * @return 结果
     */
    @PostMapping("/updateGoos")
    public R updateGoos(Integer putaway, String id)
    {
        Map<String, Object> map = new HashMap<>();
        List<String> idList= Arrays.asList(id.split(","));
        map.put("putaway",putaway);
        map.put("id",idList);

        return new R(ResponseEnum.SUCCESS, goodsListService.updateAppGoodsDetailsByIds(map));
    }

    //上传商品图片
    @PostMapping("/upload")
    public Object upload(MultipartFile file){
        // 将文件接收后，存放一个固定地方，然后将路径拿过来
        String name = file.getOriginalFilename();
        try {
            // 存放在D盘
            file.transferTo(new File("D://"+name));
        }catch (IOException e){
            e.printStackTrace();
            return "error";
        }
        return "OK";

    }

    @PostMapping("/load")
    public R insterCourse(@RequestParam(value = "courseUrl") MultipartFile courseUrl){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String date = df.format(new Date());
        String path = "E:/var/uploaded_files/"+date+"/";
        UUID uuid = UUID.randomUUID();
        String originalFilename = courseUrl.getOriginalFilename();
        String extendName = originalFilename.substring(originalFilename.lastIndexOf("."), originalFilename.length());
        String fileName = uuid.toString() + extendName;
        File dir = new File(path, fileName);
        File filepath = new File(path);
        if (!filepath.exists()){
            filepath.mkdirs();
        }
        try {
            courseUrl.transferTo(dir);
        }catch (Exception e){
            System.out.println(e);
        }
        return new R(ResponseEnum.SUCCESS,0);
    }

    @Bean
    MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setLocation("/var/tmp");
        return factory.createMultipartConfig();
    }


}
