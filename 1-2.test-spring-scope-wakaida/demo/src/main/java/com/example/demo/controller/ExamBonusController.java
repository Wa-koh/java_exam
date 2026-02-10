package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.User;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/exam03")
public class ExamBonusController {
    @Autowired
    private HttpSession session;

    @RequestMapping("")
    public String index() {
        return "exam-bonus-input";
    }

    @RequestMapping("/login")
    public String login(String email, String password, Model model) {
        if (email.equals("yamada@sample.com") && password.equals("yamayama")) {
            User user = new User();
            model.addAttribute("result", "成功");
            session.setAttribute("name", user.getName());
            session.setAttribute("email", user.getEmail());
            session.setAttribute("age", user.getAge());
            return "exam-bonus-result";
        } else {
            return "exam-bonus-input";
        }
    }
}
