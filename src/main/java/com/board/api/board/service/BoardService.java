package com.board.api.board.service;

import java.util.List;

import com.board.api.board.dto.response.BoardListResponse;

public interface BoardService {

	public boolean createBoard(String title, String content);

	public List<BoardListResponse> getBoardList();

}
