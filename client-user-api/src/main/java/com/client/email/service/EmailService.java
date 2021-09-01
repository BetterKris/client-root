package com.client.email.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("springboot-email-8082")
@RequestMapping("/email")
public interface EmailService {

    @GetMapping("/getEmailById/{id}")
    String getEmailById(@PathVariable("id") Integer id);

}
