/**
 * 
 */
package com.art.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author fengjing.yfj
 *
 */
@Controller
public class IndexController {

    @RequestMapping(value = { "/index", "/" }, method = { RequestMethod.GET })
    public ModelAndView index() {
        ModelAndView view = new ModelAndView("index");
        System.out.println("index");
        return view;
    }
}
