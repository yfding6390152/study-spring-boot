package cn.mldn.microboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.mldn.microboot.util.controller.AbstractBaseController;

@Controller
public class MemberController extends AbstractBaseController {
	@RequestMapping(value = "/uploadPre", method = RequestMethod.GET)
	public String uploadPre() { // 通过model可以实现内容的传递
		return "upload_page";
	}
}
