package com.example.service2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping
    public String book() {
        System.out.println("调用到了服务2");
        try {
            Thread.sleep(222222l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "哈利波特与魔法石";
    }
}
