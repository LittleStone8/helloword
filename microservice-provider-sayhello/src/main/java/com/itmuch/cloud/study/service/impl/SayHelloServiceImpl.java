package com.itmuch.cloud.study.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itmuch.cloud.study.entity.SayHello;
import com.itmuch.cloud.study.service.mapper.SayHelloMapper;

@Service
public class SayHelloServiceImpl {

    @Autowired
    private SayHelloMapper SayHelloMapper;
    
    public SayHello Sayhello(Long id)
    {
    	return SayHelloMapper.Sayhello(id);
    }
    
}
