package com.xxxx.controller;

import com.xxxx.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HelloController {
    @RequestMapping("tt.do")
    public String sayHello(Model model){
        //存储数据
        model.addAttribute("msg","hello Model");
        //打印
        System.out.println("哈哈哈");
        return "abc";
    }
    @RequestMapping("abc")
    public String sayForward(Model model){
        //存储数据
        model.addAttribute("msg","hello Model");
        //打印
        System.out.println("哈哈哈");
        //转发
        return "forward:/WEB-INF/hello.jsp";
    }
    @RequestMapping("data")
    public String sayData(@RequestParam(name="uname") String name,
       @RequestParam(defaultValue = "666") String pwd,Double sal, Model model){
        //打印
        System.out.println(name+"---"+pwd+"--"+sal);
        //存储数据
        model.addAttribute("name",name);
        model.addAttribute("pwd",pwd);
        model.addAttribute("sal",sal);
        //转发
        return "abc";
    }
    @RequestMapping("dataUser")
    public String sayData(User user, Model model, HttpServletRequest request, HttpSession session){
        //打印
        System.out.println(user.getUname()+"---"+user.getPwd()+"--"+user.getSal());
        System.out.println(user);
        //存储数据
        session.setAttribute("user",user);
        //model.addAttribute("name",user.getUname());
        model.addAttribute("pwd",user.getPwd());
        model.addAttribute("sal",user.getSal());
        //转发
        return "forward:user.jsp";
    }
}
