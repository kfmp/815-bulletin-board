package com.board.api.board.dto.request;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class CreateBoardRequest {

	@NotBlank(message = "제목은 필수 입력 값입니다.")
	@Size(min = 1)
	private String title;

	@NotBlank(message = "내용은 필수 입력 값입니다.")
	@Size(min = 1)
	private String content;

}
