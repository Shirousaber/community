package uyou.comm.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class helloController {
    @RequestMapping("/hello")
    public String hello(Model model)
    {
        model.addAttribute("hello","你好世界！");
        return "hi";
    }
}
