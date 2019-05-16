package com.jesse.web;

import com.jesse.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;


@Component
@RequestMapping("/test")
public class AccountController {

    @Autowired
    public AccountService accountService;

    @GetMapping(value = "/transfer")
    public String transfer(String name, Integer age) {
        System.out.println(name + " " + age);
        accountService.transferMoney();
        return "success";
    }

    @RequestMapping("/upLoad")
    public String register() {
        return "upLoad";
    }

    @PostMapping("/register")
    public String upLoad(MultipartFile photo) {
        //the photo we have this is location somewhere in your temparary folder.
        //put it in D://
        File destination = new File("d://", photo.getOriginalFilename());
        try {
            photo.transferTo(destination); //after transfer to the destination, the temparary file will be deleted automatically.
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "success";
    }


}
