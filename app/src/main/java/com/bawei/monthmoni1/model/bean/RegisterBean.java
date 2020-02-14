package com.bawei.monthmoni1.model.bean;

/**
 * 功能:  页面
 * 作者:  胡锦涛
 * 时间:  2020/2/13 0013 下午 3:40
 */
public class RegisterBean {

    /**
     * message : 该手机号已注册，不能重复注册！
     * status : 1001
     */

    private String message;
    private String status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
