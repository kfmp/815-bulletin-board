package com.board.api.auth.mapper;

import com.board.api.auth.Member;
import com.board.api.auth.MemberForm;

public interface MemberMapper {

	boolean insertMember(MemberForm member);
	Member selectMember(MemberForm member);
}
