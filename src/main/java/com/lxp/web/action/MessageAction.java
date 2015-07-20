/**
 * 
 */
package com.lxp.web.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @Package com.lxp.web.action
 * @Class com.lxp.web.action.MessageAction
 * @Description: TODO
 * @Author LiXiaoPeng
 * @Date 2015年7月20日 上午9:42:56
 * @Version V1.0
 * Copyright  Corporation 2015
 */
@SuppressWarnings("serial")
public class MessageAction extends ActionSupport {
	private String msg;

	public String getMsg() {
		return msg;
	}
	
	public String execute() {
		msg="现在时刻"+new Date();
		return "msg";
	}
}
