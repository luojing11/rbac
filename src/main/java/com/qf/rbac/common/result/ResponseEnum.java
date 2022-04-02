package com.qf.rbac.common.result;

/**
 *  系统中可能出现所有的提示信息 都列举在此
 */
public enum ResponseEnum {
    // 通过构造方法 在内部把所用的情况都列举出来

    INSERT("203","添加成功"),
    UPDATE("201","修改成功"),
    SERVER_DO_ERROR("400","修改失败"),
    SUCCESS("200","成功"),
    USER_NOT_FOUND("301","用户不存在"),
    USERNAME_OR_PASSWORD_INVALIDATE("302","用户名或者密码错误"),
    MONEY_NOT_ENOUGH("303","余额不够"),
    ACCOUNT_EXCEPTION("304","账户有异常，请重试一下"),
    USER_IS_DELETE("305","账号已删除"),
    ROLE_NO_RIGHT("306","角色没有菜单权限"),
    NO_TOKEN("307","未登录，请登录"),
    TOKEN_INVALIDATE("308","令牌不匹配"),
    TOKEN_EXPIRED("309","登录超时，请重新登录"),
    HAS_NO_RIGHT("310","没有这个权限"),
    SMS_SEND_FAIL("311","短信发送失败，请重试"),
    SMS_SEND_ERROR_BUSINESS_LIMIT_CONTROL("312","短信发送过于频繁，请稍后再试"),
    NO_PHONE("313","手机号不存在"),
    CHECKCODE_ERROR("314","验证码错误，请重新输入"),
    ROLE_ALREADY_EXIST("315","角色已经存在，请重新输入"),
    NO_RIGHT("316","无菜单权限"),
    NOT_PRINT("317","未输入信息，如需创建角色请重新输入"),
    NO_QUERY_INFOMATION("318","未查询到相关信息"),
    SYSTEM_ERROR("500","账号或密码错误"),
    ;
    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    ResponseEnum(String s) {
    }

    ResponseEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
