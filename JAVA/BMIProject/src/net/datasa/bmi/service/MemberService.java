package net.datasa.bmi.service;

import java.util.ArrayList;
import java.util.List;

import net.datasa.bmi.vo.Member;

public class MemberService {
	List<Member> list = new ArrayList<>();

	// 회원 등록 메서드
	public void addMember(Member member) {
		list.add(member);
	}

	// 특정 회원 검색 메서드
	public Member selectByCode(int code) {
		for(Member m : list) {
			if(m.getCode() == code) {
				return m;
			}
		}
		return null;
	}

	// 전체 회원 검색 메서드
	public List<Member> selectAll() {
		return list;
	}

	// 특정 회원 삭제 메서드
	public void deleteMember(Member member) {
		list.remove(member);
	}
	
}
