package com.lx.test.controller.system.user;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lx.test.controller.system.common.CommonController;
import com.lx.test.entity.system.User;
import com.lx.test.service.system.user.UserService;

@Controller
@RequestMapping("user")
public class UserController extends CommonController {

	@Resource(name="userService")
	private UserService service ;
	
	@RequestMapping("list.do")
	public ModelAndView list() throws Exception {
		clearMv();
		Map map = new HashMap();
		map.put("userName","");
		List<User> list = service.getUserList(map);
		mv.addObject("ulist", list);
		mv.setViewName("system/index");
		return mv ;
	}
	
	
	@RequestMapping("add.do")
	public ModelAndView add(@RequestParam(value="username")String userName,
			@RequestParam(value="password")String password
				) throws Exception {
		clearMv();
		Map map = new HashMap();
		map.put("username", userName);
		map.put("password", password);
		map.put("status", "0");
		
		if(service.addUser(map)){
			mv.setViewName("redirect:list.do");
		}
		
		return mv ;
		
	}
	
	
	@RequestMapping("del.do")
	public void del(@RequestParam(value="uid")String uid , HttpServletResponse response) throws Exception {
		PrintWriter out = response.getWriter();
		Map map = new HashMap ();
		map.put("uid",uid);
		
		if(service.delUser(map)){
			out.write("success");
		}else {
			out.write("failed");
		}
		
	}
	
	
	
	
	
}
