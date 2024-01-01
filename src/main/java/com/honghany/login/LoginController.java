package com.honghany.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    // 첫페이지
    @GetMapping("/")
    public String loginPage(Model model){
        model.addAttribute("data", "hello!!");
        return "main";
    }

    @PostMapping(value = "/login.do")
    public String login(@RequestParam Map<String, String> paramMap, Model model){
        model.addAttribute("paramMap", paramMap);
        int testCnt = loginService.selectTest();
        System.out.println("testCnt : " + testCnt);

        return "main2";
    }
}
