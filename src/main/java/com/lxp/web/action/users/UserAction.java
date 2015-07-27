/**
 * 
 */
package com.lxp.web.action.users;

import java.util.Date;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;


@SuppressWarnings("serial")
public class UserAction extends ActionSupport {
	private String msg="现在时刻"+new Date();

	public String getMsg() {
		return msg;
	}
	
	@Action(value="t1",
			results={@Result(name="other", location="other.jsp")})
	public String t1() {
		if(msg==null) {
			return "other";
		}
		return SUCCESS;
	}
	
	public String t2() {
		return SUCCESS;
	}
}
