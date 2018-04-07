package cn.mldn.microboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.mldn.microboot.util.controller.AbstractBaseController;

@Controller
public class UploadController extends AbstractBaseController {
	@RequestMapping(value = "/uploadPre", method = RequestMethod.GET)
	public String uploadPre() { // 通过model可以实现内容的传递
		return "upload_page";
	}
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	@ResponseBody
	public String upload(String name, MultipartFile photo) {
		if (photo != null) {	// 现在有文件上传
			System.out.println("【*** 文件上传 ****】name = " + name);
			System.out.println("【*** 文件上传 ****】photoName = " + photo.getName());
			System.out.println("【*** 文件上传 ****】photoContentType = " + photo.getContentType());
			System.out.println("【*** 文件上传 ****】photoSize = " + photo.getSize());
			
		}
		return "upload-file";
	}
}
