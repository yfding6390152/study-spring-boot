package cn.mldn.microboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.mldn.microboot.util.controller.AbstractBaseController;

@RestController
public class MessageController extends AbstractBaseController {
	@RequestMapping(value = "/echo", method = RequestMethod.GET)
	public String echo(String mid) {
		System.out.println("【*** 访问地址 ***】" + super.getMessage("member.add.action"));
		return super.getMessage("welcome.msg", mid);
	}
}
