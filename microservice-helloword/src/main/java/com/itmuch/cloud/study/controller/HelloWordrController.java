package com.itmuch.cloud.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.itmuch.cloud.study.feign.SayHelloFeignClient;
import com.itmuch.cloud.study.feign.SayWordFeignClient;

@RestController
public class HelloWordrController {
  @Value("${profile}")
  private String profile;
  @Autowired
  private SayHelloFeignClient sayHelloFeignClient;
  @Autowired
  private SayWordFeignClient sayWordFeignClient;
  
  @GetMapping("/helloword/{id}")
  public String findById(@PathVariable Long id) {
	  System.out.print("/helloword/"+id);
	  String findOne = this.sayHelloFeignClient.getSayHello(id)+","+sayWordFeignClient.getSayWord(id);
    return findOne;
  }
  
  @GetMapping("/profile")
  public String hello() {
    return this.profile;
  }
  
}
