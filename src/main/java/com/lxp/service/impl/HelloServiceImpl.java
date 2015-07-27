package com.lxp.service.impl;

import com.lxp.service.HelloService;

/**
 * @Package com.lxp.service.impl
 * @Class com.lxp.service.impl.HelloServiceImpl
 * @Description: TODO
 * @Author LiXiaoPeng
 * @Date 2015年7月27日 下午10:10:03
 * @Version V1.0
 * Copyright  Corporation 2015
 */
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello() {
		return "你好，张三";
	}

}
