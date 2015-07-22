/**
 * 
 */
package com.lxp.vo;

import java.io.Serializable;

/**
 * @Package com.lxp.vo
 * @Class com.lxp.vo.Point
 * @Description: TODO
 * @Author LiXiaoPeng
 * @Date 2015年7月22日 下午10:01:33
 * @Version V1.0
 * Copyright  Corporation 2015
 */
public class Point implements Serializable {
	private Double x;
	private Double y;
	public Double getX() {
		return x;
	}
	public void setX(Double x) {
		this.x = x;
	}
	public Double getY() {
		return y;
	}
	public void setY(Double y) {
		this.y = y;
	}
	public Point(Double x, Double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
}
