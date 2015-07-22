/**
 * 
 */
package com.lxp.web.convert;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.lxp.vo.Point;

/**
 * @Package com.lxp.web.convert
 * @Class com.lxp.web.convert.PointConvert
 * @Description: TODO
 * @Author LiXiaoPeng
 * @Date 2015年7月22日 下午10:03:24
 * @Version V1.0
 * Copyright  Corporation 2015
 */
public class PointConvert extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		String point_xy = values[0];
		String[] point_str = point_xy.split(",");
		Point point = new Point(Double.valueOf(point_str[0]), Double.valueOf(point_str[1]));
		return point;
	}

	@Override
	public String convertToString(Map context, Object o) {
		if(o instanceof Point) {
			Point point = (Point)o;
			return point.getX()+","+point.getY();
		}
		return "";
	}
	
}
