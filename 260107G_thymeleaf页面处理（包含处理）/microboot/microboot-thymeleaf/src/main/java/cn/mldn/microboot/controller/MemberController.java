package cn.mldn.microboot.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.mldn.microboot.util.controller.AbstractBaseController;
import cn.mldn.microboot.vo.Member;

@Controller
public class MemberController extends AbstractBaseController {
	@RequestMapping(value = "/member/map", method = RequestMethod.GET)
	public String map(Model model) {
		Map<String,Member> allMembers = new HashMap<String,Member>();
		for (int x = 0; x < 10; x++) {
			Member vo = new Member();
			vo.setMid(101L + x);
			vo.setName("啊三 - " + x);
			vo.setAge(9);
			vo.setSalary(99999.99);
			vo.setBirthday(new Date());
			allMembers.put("mldn-" + x, vo);
		}
		model.addAttribute("allMembers", allMembers);
		return "member/member_map";
	}
	
	@RequestMapping(value = "/member/list", method = RequestMethod.GET)
	public String list(Model model) {
		List<Member> allMembers = new ArrayList<Member>();
		for (int x = 0; x < 10; x++) {
			Member vo = new Member();
			vo.setMid(101L + x);
			vo.setName("啊三 - " + x);
			vo.setAge(9);
			vo.setSalary(99999.99);
			vo.setBirthday(new Date());
			allMembers.add(vo) ;
		}
		model.addAttribute("allMembers", allMembers);
		return "member/member_list";
	}
}
