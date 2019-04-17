package com.itmuch.cloud.study.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itmuch.cloud.study.entity.SayWord;
import com.itmuch.cloud.study.service.mapper.SayWordMapper;
@Service
public class SayWordServiceImpl {

    @Autowired
    private SayWordMapper sayWordMapper;
    
    public SayWord Sayword(Long id)
    {
    	return sayWordMapper.Sayword(id);
    }
    
}
