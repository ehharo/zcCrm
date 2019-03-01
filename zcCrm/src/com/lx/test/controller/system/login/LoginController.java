package com.lx.test.controller.system.login;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lx.test.controller.system.common.CommonController;
import com.lx.test.service.system.login.LoginService;

@Controller
public class LoginController extends CommonController {

	@Resource(name="loginService")
	private LoginService service ;
	
	@RequestMapping("tologin.do")
	public ModelAndView tologin(){
		clearMv();
		mv.setViewName("system/login");
		return mv;
	}
	
	@RequestMapping("loginCheck.do")
	public ModelAndView loginCheck(@RequestParam(value="username")String username,
				@RequestParam(value="password") String password
			) throws Exception {
		clearMv();
		// 参数封装 
		Map map = new HashMap();
		map.put("username",username);
		map.put("password",password);
		
		if(service.loginCheck(map) != null ) {
			/*
			 *  加入redirect之后实际为了重定向到某一个requestMapping进行处理。
			 */
			mv.setViewName("redirect:user/list.do");
		}else{
			mv.setViewName("redirect:tologin.do");
		}
		return mv;
	}
	
}
