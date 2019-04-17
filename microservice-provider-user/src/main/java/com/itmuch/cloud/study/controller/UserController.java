package com.itmuch.cloud.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
  
//  @Autowired
//  private SayHelloServiceImpl sayHelloServiceImpl;

  @GetMapping("/{id}")
  public String findById(@PathVariable Long id) {
    //User findOne = this.sayHelloServiceImpl.findone(id);
    return null;
  }
  
  @GetMapping("/my/{id}")
  public String findById_(@PathVariable Long id) {
	System.out.println("sdasdsad");
    //User findOne = this.sayHelloServiceImpl.findone(id);
    return null;
  }
  
}
