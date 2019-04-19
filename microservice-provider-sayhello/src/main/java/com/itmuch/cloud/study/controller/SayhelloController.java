package com.itmuch.cloud.study.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.itmuch.cloud.study.beanUtil.RedisUtil;
import com.itmuch.cloud.study.entity.SayHello;
import com.itmuch.cloud.study.service.impl.SayHelloServiceImpl;

@RestController
public class SayhelloController {
  
  @Autowired
  private SayHelloServiceImpl sayHelloServiceImpl;
  
  @Autowired
  private RedisUtil redisUtils;
  
  @GetMapping("/sayhello/{id}")
  public String Sayword(@PathVariable Long id) {
	  System.out.print("/sayhello/"+id);

      redisUtils.set("123", "hello world");
      System.out.println("进入了方法");
      String string= redisUtils.get("123").toString();
      System.out.println(string);
	  SayHello hello = this.sayHelloServiceImpl.Sayhello(id);
    return hello.getSay();
  }
  
  
}
