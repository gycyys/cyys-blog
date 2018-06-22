package net.cyys.admin.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {
	
	@RequestMapping("/")
	public String test(Map<String, Object> modal) {
		modal.put("message", "测试beetl");
		return "templates/index";
	}
	
	@RequestMapping("/test")
	@ResponseBody
	public Object test() {
		return "test";
	}
}
