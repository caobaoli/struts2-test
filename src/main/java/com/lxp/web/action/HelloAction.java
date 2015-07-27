package com.lxp.web.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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
@Controller
@ParentPackage(value="struts-default")
public class HelloAction extends ActionSupport {
	@Autowired
	private HelloService helloService;
	
	private String message;
	
	public String getMessage() {
		return message;
	}


	@Action(value="hello")
	public String hello() {
		message = helloService.sayHello();
		System.out.println("************************");
		return SUCCESS;
	}
}
