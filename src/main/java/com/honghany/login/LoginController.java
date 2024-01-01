package com.honghany.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    // 첫페이지
    @GetMapping("/")
    public String loginPage(Model model){
        model.addAttribute("data", "hello!!");
        return "main";
    }
}
