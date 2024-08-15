package com.board.api.board.domain;

import java.sql.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Board {

	private Long boardSeq;

	private String title;

	private String content;

	private Long memberSeq;

	private Date createdAt;

	private Date updatedAt;

	private int hitCount;

	private int likeCount;

}
