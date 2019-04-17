package com.itmuch.cloud.study.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itmuch.cloud.ribbonconfig.SayHelloRibbonConfiguration;


@FeignClient(name = "microservice-provider-sayhello",fallback = SayHelloFeignClientFallback.class,configuration = SayHelloRibbonConfiguration.class)
public interface SayHelloFeignClient {
  @RequestMapping(value = "/sayhello/{id}", method = RequestMethod.GET)
  public String getSayHello(@PathVariable("id") Long id);
}
@Component
class SayHelloFeignClientFallback implements SayHelloFeignClient {
  @Override
  public String getSayHello(Long id) {
    return "Fallback Hello";
  }
}
