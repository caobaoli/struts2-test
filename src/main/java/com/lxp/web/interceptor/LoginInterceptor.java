package com.lxp.web.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * @Package com.lxp.web.interceptor
 * @Class com.lxp.web.interceptor.LoginInterceptor
 * @Description: TODO
 * @Author LiXiaoPeng
 * @Date 2015年7月23日 下午6:13:05
 * @Version V1.0
 * Copyright  Corporation 2015
 */
public class LoginInterceptor extends MethodFilterInterceptor {
	private static final String cur_user="cur_user";
	
	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		String currentUser = (String) ActionContext.getContext().getSession().get(cur_user);
		if(currentUser==null) {
			Map<String, String> request = (Map<String, String>) ActionContext.getContext().get("request");
			request.put("notlogin", "您还没有登录，请登录");
			return "login";
		}
		return invocation.invoke();
	}

}
