package com.qf.rbac.common.exception;

import com.qf.rbac.common.result.ResponseEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppException extends RuntimeException{

    private String code;
    private String message;
    public AppException(ResponseEnum responseEnum){
        this.code=responseEnum.getCode();
        this.message=responseEnum.getMessage();
    }
}
