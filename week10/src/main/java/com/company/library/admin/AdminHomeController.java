package com.company.library.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminHomeController {
	//Controller 역할 : 요청 처리, 적절한 페이지 리턴
	
	//@RequestMapping (value= {"", "/"}, method = RequestMethod.GET)
	@GetMapping(value =  {"", "/"})
	public String home() {
		System.out.println("[AdminHomeController] home()");
		String nextPage = "admin/home";
		return nextPage;
	}
}
