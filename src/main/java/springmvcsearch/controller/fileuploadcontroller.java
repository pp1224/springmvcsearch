package springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class fileuploadcontroller {

	@RequestMapping("/fileform")
	public String showuploadform() {
		
		
		return "fileform";
	}
	
	
	@RequestMapping(value = "/uploadimg", method = RequestMethod.POST)
	public String upload(@RequestParam("upfile") CommonsMultipartFile file) {
		
		System.out.println(file.getContentType());
		
		return "success";
	}
	
}
