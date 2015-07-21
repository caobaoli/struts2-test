/**
 * 
 */
package com.lxp.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @Package com.lxp.web.action
 * @Class com.lxp.web.action.TestAction
 * @Description: TODO
 * @Author LiXiaoPeng
 * @Date 2015年7月20日 上午9:42:56
 * @Version V1.0
 * Copyright  Corporation 2015
 */
@SuppressWarnings("serial")
public class TestAction extends ActionSupport {
	
	private String[] users;

	public String[] getUsers() {
		return users;
	}
	
	public String t1() {
		users = new String[]{"zhangsan", "lisi", "zhaoba", "wangwu"};
		
		ActionContext.getContext().getSession().put("cur_user", "张三");
		return SUCCESS;
	}
}
