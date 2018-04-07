package cn.mldn.microboot.controller;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {
	@RequiresRoles("dept")
	@RequestMapping("/pages/back/dept/get")
	public String get() {
		return "部门信息" ;
	}
}
