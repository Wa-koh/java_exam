package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.Exam01Form;

@Controller
@RequestMapping("/exam01")
public class Exam01Controller {
    @ModelAttribute
    public Exam01Form setUpForm() {
        return new Exam01Form();
    }

    @RequestMapping("")
    public String index() {
        return "exam01";
    }

    @RequestMapping("/login-result")
    public String login(Exam01Form form, Model model) {
        String email = form.getEmail();
        String password = form.getPassword();
        if (email.equals("yamada@sample.com") && password.equals("yamayama")) {
            model.addAttribute("result", "成功");
        } else {
            model.addAttribute("result", "失敗");
        }
        return "exam01-result";
    }
}
