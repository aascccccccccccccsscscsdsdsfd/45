package cn.edu.lntu.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.lntu.common.Result;
import cn.edu.lntu.domain.User;
import cn.edu.lntu.service.MenuService;
import cn.edu.lntu.service.UserService;

@Controller
@RequestMapping("/user")
@CrossOrigin
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private MenuService menuService;
	@RequestMapping("/login")
	@ResponseBody
	public Result login(@RequestBody User user) {
		HashMap res=new HashMap();
		User dbUser=userService.getUser(user.getNo());
		if(dbUser!=null&&dbUser.getPassword().equals(user.getPassword())) {
			res.put("user", dbUser);
			res.put("menu", menuService.getMenus(String.valueOf(dbUser.getRole_id())));
			return Result.suc(res);
		}else {
			return Result.fail();
		}			
	}
}
