/**
 * 
 */
package com.art.web.vo;

/**
 * 基础结果的VO
 * 
 * @author fengjing.yfj
 *
 */
public class BaseResultVO {
    /** 
     * 结果 
     */
    private boolean success = true;

    /**
     * 错误描述
     */
    private String  desc    = "";

    /**
     * @return the success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * @param success the success to set
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

}
