package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.ReceiveNameForm;

@Controller
@RequestMapping("/exam03")
public class ReceiveController {

    @ModelAttribute
    public ReceiveNameForm setUpForm() {
        return new ReceiveNameForm();
    }

    @RequestMapping("")
    public String Index() {
        return "name-form";
    }

    @RequestMapping("/name-receive")
    public String nameReceive(String name) {
        System.out.println("入力された値は" + name + "です。");
        return "finished";
    }

    @RequestMapping("/name-receive2")
    public String nameOutput(ReceiveNameForm receiveNameForm) {
        System.out.println("入力された値は" + receiveNameForm.getName() + "です。");
        return "finished";
    }
}
