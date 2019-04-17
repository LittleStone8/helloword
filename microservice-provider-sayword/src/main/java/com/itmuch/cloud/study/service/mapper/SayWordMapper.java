package com.itmuch.cloud.study.service.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.itmuch.cloud.study.entity.SayWord;

@Mapper
public interface SayWordMapper {

	public SayWord Sayword(@Param("id") Long id);
	
}
