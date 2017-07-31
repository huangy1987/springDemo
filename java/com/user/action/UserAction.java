package com.user.action;

import org.springframework.stereotype.Controller;  
import org.springframework.ui.ModelMap;  
import org.springframework.web.bind.annotation.RequestMapping;  
  
@Controller  
//标明这是一个控制层类  
public class UserAction {  
    @RequestMapping(value = "/toLogin.do")  
    //响应index.jsp的登录请求  
    public String login(ModelMap map){    
        return "/login";  
    }  
    
    @RequestMapping(value = "/userLogin.do")  
    //响应index.jsp的登录请求  
    public String loginHandle(ModelMap map){    
        return "/index";  
    } 
    
}  