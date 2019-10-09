package com.stackroute;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @PostMapping("/add")
    public ModelAndView add(HttpServletRequest req){
        String str =req.getParameter("t1");
        ModelAndView mv = new ModelAndView("display");
        mv.addObject("value",str);
        return mv;
    }
}
