package com.yunji.common;

/**
 * Create by matth on 2018/3/18
 */
public class ContractResponse {
    private String result;

    private String code;

    private String msg;

    private String download_url;

    private String viewpdf_url;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDownload_url() {
        return download_url;
    }

    public void setDownload_url(String download_url) {
        this.download_url = download_url;
    }

    public String getViewpdf_url() {
        return viewpdf_url;
    }

    public void setViewpdf_url(String viewpdf_url) {
        this.viewpdf_url = viewpdf_url;
    }
}
