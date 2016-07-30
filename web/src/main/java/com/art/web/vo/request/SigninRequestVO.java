/**
 * 
 */
package com.art.web.vo.request;

/**
 * 注册的请求的VO
 * 
 * @author fengjing.yfj
 *
 */
public class SigninRequestVO {

    /**
     * email地址
     */
    private String email;

    /**
     * 密码
     */
    private String password;

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
