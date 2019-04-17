package com.itmuch.cloud.study.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itmuch.cloud.ribbonconfig.SayWordRibbonConfiguration;

@FeignClient(name = "microservice-provider-sayword",fallback = SayWordFeignClientFallback.class,configuration = SayWordRibbonConfiguration.class)
public interface SayWordFeignClient {
  @RequestMapping(value = "/sayword/{id}", method = RequestMethod.GET)
  public String getSayWord(@PathVariable("id") Long id);
}
@Component
class SayWordFeignClientFallback implements SayWordFeignClient {
  @Override
  public String getSayWord(Long id) {
    return "Fallback Word";
  }
}
