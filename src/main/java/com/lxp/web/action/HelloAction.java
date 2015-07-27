package com.lxp.web.action;

import com.lxp.service.HelloService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @Package com.lxp.web.action
 * @Class com.lxp.web.action.HelloAction
 * @Description: TODO
 * @Author LiXiaoPeng
 * @Date 2015年7月27日 下午10:03:55
 * @Version V1.0
 * Copyright  Corporation 2015
 */
public class HelloAction extends ActionSupport {
	private HelloService helloService;
	
	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}



	private String message;
	
	public String getMessage() {
		return message;
	}



	public String hello() {
		message = helloService.sayHello();
		return SUCCESS;
	}
}
