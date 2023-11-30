package com.company.hello.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
	//Controller는 클라이언트 요청에 대한 페이지를 리턴한다.
	/* MemberService memberService = new MemberService(); */
	@Autowired
	MemberService memberService;

	@RequestMapping("/signUp")
	public String signUP() {
		return "sign_up";
	}
	
	@RequestMapping("/signIn")
	public String signIn() {
		return "sign_in";
	}
	
	@RequestMapping("/signUpConfirm")
	/*public String signUpConfirm(@RequestParam String m_id,
								@RequestParam Integer m_pw,
								@RequestParam String m_mail,
								@RequestParam String m_phone)*/ 
		//String m_id = request.getParameter("m_id");
	public String signUpConfirm(MemberVO memberVO) {
		System.out.println("[MemberController] signUpConfirm()");

		System.out.println("m_id = " + memberVO.getM_id());
		System.out.println("m_pw = " + memberVO.getM_pw());
		System.out.println("m_mail = " + memberVO.getM_mail());
		System.out.println("m_phone = " + memberVO.getM_phone());
		
		memberService.signUpConfirm(memberVO);
		
		return "sign_up_ok"; 
	}
	
	@RequestMapping("/signInConfirm")
	public String signInconfirm(MemberVO memberVO) {
		System.out.println("[MemberController] signInConfirm()");
		
		MemberVO signInedMember = memberService.signInConfirm(memberVO);
		
		if (signInedMember != null)
				return "sign_in_ok";
			else
				return "sign_in_ng";
	}
}
