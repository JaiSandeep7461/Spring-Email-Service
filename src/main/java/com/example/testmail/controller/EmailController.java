package com.example.testmail.controller;

import com.example.testmail.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private SendEmailService sendEmailService;

    @GetMapping("sendMail")
    public  String sendMail(){
        sendEmailService.sendEmail("jaisandeep7461@gmail.com","Test Body","Test Subject");
        return "Sent Successfully";
    }
}
