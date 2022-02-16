package cn.hhb.springbootthymeleaftempaltedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping("/index")
    public String index(HttpServletRequest request, HttpServletResponse response) {
        return "index";
    }
}
