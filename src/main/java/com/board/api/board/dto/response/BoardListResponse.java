package com.board.api.board.dto.response;

import java.sql.Date;

import com.board.api.board.domain.Board;
import com.board.api.board.dto.resultMap.BoardListRM;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Builder
@RequiredArgsConstructor
@Getter
public class BoardListResponse {

	private final Long boardSeq;

	private final String title;

	private final String content;

	private final String name;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private final Date createdAt;

	private final int hitCount;

	private final int likeCount;

	public static BoardListResponse of(BoardListRM board) {

		return BoardListResponse.builder().boardSeq(board.getBoardSeq()).title(board.getTitle())
				.content(board.getContent()).name(board.getName()).createdAt(board.getCreatedAt())
				.hitCount(board.getHitCount()).likeCount(board.getLikeCount()).build();
	}

}
