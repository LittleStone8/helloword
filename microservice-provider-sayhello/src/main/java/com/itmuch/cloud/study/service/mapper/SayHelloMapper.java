package com.itmuch.cloud.study.service.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.itmuch.cloud.study.entity.SayHello;

@Mapper
public interface SayHelloMapper {

	public SayHello Sayhello(@Param("id") Long id);
	
}
