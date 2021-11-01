package com.atom.jobseeker.common.constant;

/**
 * @author wayan
 */
public enum ErrorEnum {
    JOB_PUSH_ERROR(501, "岗位推送出现异常"),
    JOB_DOWN_ERROR(502, "岗位下架出现异常");

    private int code;
    private String msg;

    ErrorEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}