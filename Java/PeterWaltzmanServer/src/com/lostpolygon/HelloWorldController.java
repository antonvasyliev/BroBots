package com.lostpolygon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by anton on 03.12.2016.
 */
@Controller
public class HelloWorldController {

    @RequestMapping(
            value = "/hello.htm",
            method = RequestMethod.GET
    )
    public ModelAndView helloWorld() {

        ModelAndView modelAndView = new ModelAndView("HelloWorld");
        modelAndView.addObject("Title", "Hello world!");

        return modelAndView;
    }

}
