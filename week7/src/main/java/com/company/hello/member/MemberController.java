package com.company.hello.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	@RequestMapping("/signUp")
	public String signUp() {
		return "sign_up"; //jsp view 페이지 파일명
	}
	@RequestMapping("/signIn")
	public String signIn() {
		return "sign_in";
	}
}
