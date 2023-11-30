package com.company.hello.member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class MemberDao {
	private Map<String, MemberVO> memberDB = new HashMap<String, MemberVO>();
	
	public void insertMember(MemberVO memberVO) {
		System.out.println("[MemberDao] insertMember()");
		
		System.out.println("m_id = " + memberVO.getM_id());
		System.out.println("m_pw = " + memberVO.getM_pw());
		System.out.println("m_mail = " + memberVO.getM_mail());
		System.out.println("m_phone = " + memberVO.getM_phone());
		
		memberDB.put(memberVO.getM_id(), memberVO);
		printMember();
	}

	public MemberVO selectMemberVO(MemberVO memberVO) {
		System.out.println("[MemberDao] selectMember()");
		MemberVO signInedMember = memberDB.get(memberVO.getM_id());
		
		if (signInedMember != null && (memberVO.getM_pw().equals(signInedMember.getM_pw())))
			return signInedMember;
			else 
				return null;
	}
	
	private void printMember() {
		System.out.println("[MemberDao] printMember()");
		
		System.out.println("<회원 목록>");
		
		Set<String> keys = memberDB.keySet();
		Iterator<String> keyIter = keys.iterator();
		while(keyIter.hasNext()) {
			String Key = keyIter.next();
			MemberVO memberVO = memberDB.get(Key);
			
			System.out.println("m_id = " + memberVO.getM_id());
			System.out.println("m_pw = " + memberVO.getM_pw());
			System.out.println("m_mail = " + memberVO.getM_mail());
			System.out.println("m_phone = " + memberVO.getM_phone());
			System.out.println("----------------------------------");
		}
	}

}
