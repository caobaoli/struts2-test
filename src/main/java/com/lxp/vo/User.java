/**
 * 
 */
package com.lxp.vo;

import java.io.Serializable;

/**
 * @Package com.lxp.vo
 * @Class com.lxp.vo.User
 * @Description: TODO
 * @Author LiXiaoPeng
 * @Date 2015年7月20日 下午9:49:06
 * @Version V1.0
 * Copyright  Corporation 2015
 */
public class User implements Serializable {
	private String account;
	private String email;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public User() {
		super();
	}
	public User(String account, String email) {
		super();
		this.account = account;
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [account=" + account + ", email=" + email + "]";
	}
	
	
	
	
}
