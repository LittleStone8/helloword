package com.itmuch.cloud.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.itmuch.cloud.study.entity.SayHello;
import com.itmuch.cloud.study.service.impl.SayHelloServiceImpl;

@RestController
public class SayhelloController {
  
  @Autowired
  private SayHelloServiceImpl sayHelloServiceImpl;
  @GetMapping("/sayhello/{id}")
  public String Sayword(@PathVariable Long id) {
	  System.out.print("/sayhello/"+id);
	  SayHello hello = this.sayHelloServiceImpl.Sayhello(id);
    return hello.getSay();
  }
  
  
}
