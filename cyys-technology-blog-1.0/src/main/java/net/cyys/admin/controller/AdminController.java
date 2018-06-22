package net.cyys.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

	/**
	 * 后台管理登录页面.
	 * 
	 * @author cyys
	 * @return
	 */
	@RequestMapping("/admin/*")
	public String adminLogin() {
		return "templates/admin/login";
	}
	
	@RequestMapping("/admin/index")
	public String index() {
		return "templates/admin/index";
	}

}
