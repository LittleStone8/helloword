package com.itmuch.cloud.study.controller.ex;

import com.alibaba.fastjson.JSON;

public class Util {
	public static  String beanToJson(Object o){
		return JSON.toJSONString(o);
	}
	//parse an object from 
	public static <T> T jsonToBean(String json,Class<T> cls){
		return JSON.parseObject(json, cls);
	} 
}
