package com.itmuch.cloud.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.itmuch.cloud.study.entity.SayWord;
import com.itmuch.cloud.study.service.impl.SayWordServiceImpl;

@RestController
public class SaywordController {
  
  @Autowired
  private SayWordServiceImpl sayHelloServiceImpl;

  @GetMapping("/sayword/{id}")
  public String Sayword(@PathVariable Long id) {
    SayWord word = this.sayHelloServiceImpl.Sayword(id);
    return word.getSay();
  }
  
  
}
