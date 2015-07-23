package com.lxp.web.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @Package com.lxp.web.action
 * @Class com.lxp.web.action.ValidateTestAction
 * @Description: TODO
 * @Author LiXiaoPeng
 * @Date 2015年7月23日 下午4:04:57
 * @Version V1.0
 * Copyright  Corporation 2015
 */
public class ValidateTestAction extends ActionSupport {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	public String show() {
		return SUCCESS;
	}
	
	public String reg() {
		System.out.println("sssssssssssssss");
		return NONE;
	}
}
