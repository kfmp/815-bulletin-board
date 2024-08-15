package com.board.api.auth.service;

import com.board.api.auth.Member;
import com.board.api.auth.MemberForm;

public interface MemberService {
	public boolean enrollMember(MemberForm member);
	public Member loginMember(MemberForm member);
}
