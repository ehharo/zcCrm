package com.lx.test.controller.system.common;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

public class CommonController {

	protected ModelAndView mv = new ModelAndView();
	
	public Map getParameter(HttpServletRequest request) {
		return request.getParameterMap();
	}
	
	public void clearMv(){
		mv.clear();
	}
}
