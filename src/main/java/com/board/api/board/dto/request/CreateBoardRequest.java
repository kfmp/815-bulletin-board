package com.board.api.board.dto.request;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class CreateBoardRequest {

	@NotBlank(message = "������ �ʼ� �Է� ���Դϴ�.")
	@Size(min = 1)
	private String title;

	@NotBlank(message = "������ �ʼ� �Է� ���Դϴ�.")
	@Size(min = 1)
	private String content;

}
