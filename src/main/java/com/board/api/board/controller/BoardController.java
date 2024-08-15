package com.board.api.board.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.board.api.board.dto.request.CreateBoardRequest;
import com.board.api.board.dto.response.BoardListResponse;
import com.board.api.board.service.BoardService;
import com.board.api.common.CommonResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/board")
@RequiredArgsConstructor
public class BoardController {

	private final BoardService boardService;

	@GetMapping("/list")
	public ResponseEntity<CommonResponse<List<BoardListResponse>>> getList() {

		List<BoardListResponse> boardList = boardService.getBoardList();

		return CommonResponse.success(HttpStatus.OK, boardList);
	}

}
