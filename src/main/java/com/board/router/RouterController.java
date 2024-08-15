package com.board.router;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RouterController {
	
	@GetMapping("/member/signup")
	public String showsignUp() {
		return "/member/signup";
	}

	
	@GetMapping("/member/login")
	public String showLogin() {
		return "/member/login";
	}
	
}
