package com.board.api.board.dto.resultMap;

import java.sql.Date;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class BoardListRM {

	private final Long boardSeq;

	private final String title;

	private final String content;

	private final Long memberSeq;

	private final String name;

	private final Date createdAt;

	private final Integer hitCount;

	private final Integer likeCount;

}
