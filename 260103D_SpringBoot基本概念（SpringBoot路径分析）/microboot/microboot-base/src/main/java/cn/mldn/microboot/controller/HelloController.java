package cn.mldn.microboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping(value="/echo/{message}",method=RequestMethod.GET)
	public String echo(@PathVariable("message") String msg) {
		return "【ECHO】" + msg ;
	}
	@RequestMapping("/mul")
	public Object mul(int num) {
		return num * 2 ; 
	}
	
	@RequestMapping("/")
	public String home() {
		return "www.mldn.cn";
	}
}
