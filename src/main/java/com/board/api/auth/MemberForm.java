package com.board.api.auth;

import org.hibernate.validator.constraints.NotBlank;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class MemberForm {
	@NotBlank(message = "이메일은 필수 값입니다.")
	private String email;
	@NotBlank(message = "비밀번호는 필수 값입니다.")
	private String pass;
	@NotBlank(message = "주소는 필수 값입니다.")
	private String address;
	@NotBlank(message = "이름은 필수 값입니다.")
	private String name;
}
