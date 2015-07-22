package com.lxp.web.action;

import java.util.ArrayList;
import java.util.List;

import com.lxp.vo.Province;
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
	private String id;
	private List<Province> provinces;
	
	public void setId(String id) {
		this.id = id;
	}

	public List<Province> getProvinces() {
		return provinces;
	}

	public void setProvinces(List<Province> provinces) {
		this.provinces = provinces;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}
	
	private void initProvince() {
		provinces = new ArrayList<Province>();
		provinces.add(new Province(100, "陕西省"));
		provinces.add(new Province(200, "山西省"));
		provinces.add(new Province(300, "湖南省"));
		provinces.add(new Province(400, "湖北省"));
		provinces.add(new Province(500, "河南省"));
	}

	public String create() {
		user = new User("zhangsan", "zhangsan@126.com");
		this.initProvince();
		return SUCCESS;
	}
	
	public String save() {
		//保存到数据库中
		this.initProvince();
		return "create";
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
