package com.honghany.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class LoginController {

    // 첫페이지
    @GetMapping("/")
    public String loginPage(Model model){
        model.addAttribute("data", "hello!!");
        return "main";
    }

    @PostMapping(value = "/login.do")
    public String login(@RequestParam Map<String, String> paramMap, Model model){
        System.out.println("paramMap.id : " + paramMap.get("id"));
        System.out.println("paramMap.pass : " + paramMap.get("pass"));
        model.addAttribute("paramMap", paramMap);
        return "main2";
    }
}
