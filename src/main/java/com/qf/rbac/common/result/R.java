package com.qf.rbac.common.result;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class R<T> {

    private String code;
    private String message;
    private T data;

    public R(ResponseEnum responseEnum,T data){
        this.code = responseEnum.getCode();
        this.message = responseEnum.getMessage();
        this.data = data;
    }
}
