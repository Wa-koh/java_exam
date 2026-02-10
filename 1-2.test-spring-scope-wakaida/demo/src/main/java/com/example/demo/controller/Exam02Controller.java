package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.Exam02Form;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {
    @Autowired
    private HttpSession session;

    @ModelAttribute
    public Exam02Form setUpForm() {
        return new Exam02Form();
    }

    @RequestMapping("")
    public String index() {
        return "exam02";
    }

    @RequestMapping("/sumCalc")
    public String sumCalc(Exam02Form form) {
        int num1 = form.getNum1();
        session.setAttribute("num1", num1);
        int num2 = form.getNum2();
        session.setAttribute("num2", num2);
        int result = num1 + num2;
        session.setAttribute("result", result);
        return "exam02-result";
    }

    @RequestMapping("/result")
    public String result() {
        return "exam02-result";
    }

    @RequestMapping("/result2")
    public String result2() {
        return "exam02-result2";
    }
}
