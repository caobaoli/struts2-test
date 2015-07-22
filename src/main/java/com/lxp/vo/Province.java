/**
 * 
 */
package com.lxp.vo;

import java.io.Serializable;

/**
 * @Package com.lxp.vo
 * @Class com.lxp.vo.Province
 * @Description: TODO
 * @Author LiXiaoPeng
 * @Date 2015年7月21日 下午10:25:50
 * @Version V1.0
 * Copyright  Corporation 2015
 */
public class Province implements Serializable {
	private Integer id;
	private String name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Province(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	
}
