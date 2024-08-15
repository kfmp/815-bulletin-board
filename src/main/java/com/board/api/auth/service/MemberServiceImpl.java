package com.board.api.auth.service;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.board.api.auth.Member;
import com.board.api.auth.MemberForm;
import com.board.api.auth.mapper.MemberMapper;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
	
	private final MemberMapper memberMapper;
	@Override
	public boolean enrollMember(MemberForm member) {
		member.setPass(hashPassword(member.getPass()));
		return memberMapper.insertMember(member);
	}
	@Override
	public Member loginMember(MemberForm member) {
		Member findMember = memberMapper.selectMember(member);
		if(findMember != null) {
			 if(checkPassword(member.getPass(),findMember.getPass()))
				 return findMember;
		}
		return null;
	}
	                                
	
	private String hashPassword(String plain) {
		return BCrypt.hashpw(plain, BCrypt.gensalt());
	}
	
	private boolean checkPassword(String plain, String hashed) {
		
		return BCrypt.checkpw(plain, hashed);
	}
}
