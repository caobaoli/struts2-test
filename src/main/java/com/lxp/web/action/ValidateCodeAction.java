package com.lxp.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @Package com.lxp.web.action
 * @Class com.lxp.web.action.ValidateCodeAction
 * @Description: TODO
 * @Author LiXiaoPeng
 * @Date 2015年7月27日 上午10:38:49
 * @Version V1.0
 * Copyright  Corporation 2015
 */
public class ValidateCodeAction extends ActionSupport {
	
	private String kaptcha;
	
	public void setKaptcha(String kaptcha) {
		this.kaptcha = kaptcha;
	}
	
	/**
	 * 表单展示
	 */
	public String showForm() {
		return SUCCESS;
	}
	
	/**
	 * 处理数据
	 */
	public String submitCode() {
		String kaptchaExpected = (String)ActionContext.getContext().getSession()  
				.get(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
		System.out.println("session中的值："+kaptchaExpected);
		System.out.println("表单传进来的值："+kaptcha);
		return NONE;
	}
}
