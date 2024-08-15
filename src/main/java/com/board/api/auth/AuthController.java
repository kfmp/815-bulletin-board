package com.board.api.auth;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.board.api.auth.service.MemberService;
import com.board.api.common.CommonResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/member/*")
@RequiredArgsConstructor
public class AuthController {
	private final MemberService memberService;
	
	@PostMapping("signup")
	public ResponseEntity<CommonResponse<String>> signUp(@RequestBody MemberForm member){
		boolean result = memberService.enrollMember(member);
		
		return CommonResponse.success(HttpStatus.OK, "/member/login");
	}
	
	@PostMapping("login")
	public ResponseEntity<CommonResponse<String>> login(@RequestBody MemberForm member){
			Member loginMember = memberService.loginMember(member);
			if(loginMember == null) {
				return CommonResponse.fail(HttpStatus.UNAUTHORIZED, "로그인 실패");
			}
		 
			return CommonResponse.success(HttpStatus.OK, "/board/list");
		}
}
