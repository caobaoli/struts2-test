/**
 * 
 */
package com.lxp.web.action;

import com.lxp.vo.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @Package com.lxp.web.action
 * @Class com.lxp.web.action.UsersAction
 * @Description: TODO
 * @Author LiXiaoPeng
 * @Date 2015年7月20日 上午9:42:56
 * @Version V1.0
 * Copyright  Corporation 2015
 */
@SuppressWarnings("serial")
public class UsersAction extends ActionSupport {
	
	private User user;
	
	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public String create() {
		user = new User("zhangsan", "zhangsan@126.com");
		return SUCCESS;
	}
	
	public String save() {
		//保存到数据库中
		return SUCCESS;
	}
	
	public String edit() {
		user = new User("lisi", "lisi@126.com");
		return SUCCESS;
	}
	
	public String update() {
		//保存到数据库中
		return SUCCESS;
	}
}
