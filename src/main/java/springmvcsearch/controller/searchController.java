package springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class searchController {
	
	@RequestMapping("/user/{userId}")
	public String getuser(@PathVariable("userId") int userId) {
		System.out.println(userId);
		return "home";
	}
	
	
	@RequestMapping("/")
	public String home() {
		
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("qbox") String query) {
		
		String url= "https://www.google.com/search?q="+query;
		
		RedirectView obj= new RedirectView();
		
		obj.setUrl(url);
		
		return obj;
	}
	

}
