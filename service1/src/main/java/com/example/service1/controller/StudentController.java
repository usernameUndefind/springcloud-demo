package com.example.service1.controller;

import com.example.common.config.RemoteBook;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/student")
@RefreshScope
public class StudentController {


    @Autowired
    private RemoteBook remoteBook;

    @GetMapping
    public void student() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        try {
            remoteBook.test();
        } catch (Exception e) {
            stopWatch.stop();
            String s = stopWatch.prettyPrint();
            System.out.println(s);
            e.printStackTrace();
        }

    }
}
