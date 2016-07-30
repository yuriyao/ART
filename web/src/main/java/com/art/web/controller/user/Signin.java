/**
 * 
 */
package com.art.web.controller.user;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.art.web.vo.request.SigninRequestVO;

/**
 * @author fengjing.yfj
 *
 */
@Controller
public class Signin {

    /** 模板 */
    private static final String TEMPLATE = "{}";

    @RequestMapping(value = "/signin", method = { RequestMethod.POST })
    public void sign(SigninRequestVO signinRequestVO, HttpServletResponse response) {

    }

}
