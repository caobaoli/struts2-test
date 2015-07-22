/**
 * 
 */
package com.lxp.web.action;

import com.lxp.vo.Point;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @Package com.lxp.web.action
 * @Class com.lxp.web.action.TestAction
 * @Description: TODO
 * @Author LiXiaoPeng
 * @Date 2015年7月20日 上午9:42:56
 * @Version V1.0 Copyright Corporation 2015
 */
@SuppressWarnings("serial")
public class TestAction extends ActionSupport {

	private String[] users;
	private String message;
	private Point point;

	public String[] getUsers() {
		return users;
	}

	public String getMessage() {
		return message;
	}
	
	public void setPoint(Point point) {
		this.point = point;
	}

	public Point getPoint() {
		return point;
	}

	public String t1() {
		message = super.getText("label_name", new String[] { "sssss" });
		return SUCCESS;
	}

	public String t2() {

		return SUCCESS;
	}

	public String t3() {
		System.out.println(point.getX()+"============"+point.getY());
		return SUCCESS;
	}
}
