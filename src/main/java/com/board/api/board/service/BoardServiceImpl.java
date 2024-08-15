package com.board.api.board.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.board.api.board.dto.response.BoardListResponse;
import com.board.api.board.dto.resultMap.BoardListRM;
import com.board.api.board.mapper.BoardMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

	private final BoardMapper boardMapper;

	@Override
	public boolean createBoard(String title, String content) {
		return false;
	}

	@Override
	public List<BoardListResponse> getBoardList() {

		final List<BoardListRM> boardList = boardMapper.getBoardList();

		return boardList.stream().map(BoardListResponse::of).collect(Collectors.toList());
	}

}
