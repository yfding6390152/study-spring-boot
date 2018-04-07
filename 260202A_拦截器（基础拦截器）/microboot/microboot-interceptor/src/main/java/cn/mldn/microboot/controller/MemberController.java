package cn.mldn.microboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.mldn.microboot.util.controller.AbstractBaseController;
import cn.mldn.microboot.vo.Member;

@Controller
public class MemberController extends AbstractBaseController {
	@RequestMapping(value = "/member_add_pre", method = RequestMethod.GET)
	public String memberAddPre() {
		return "member_add";
	}
	@RequestMapping(value = "/member_add", method = RequestMethod.POST)
	@ResponseBody
	public Object memberAdd(Member member) {
		return member ;
	}
}
