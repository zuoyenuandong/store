package com.kuang.common.exception;

public enum BaseCodeEnume {

    UNKNOW_EXCEPTION( 10000, "未知异常"),
    VAILD_EXCEPTION(10001,"参数格式校验失败");

    private int code;
    private String msg;

    BaseCodeEnume(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg(){
        return this.msg;
    }


}
