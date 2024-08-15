package com.board.api.auth;

import java.sql.Date;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Member {
	private Long memberSeq;
	private String email;
	private String pass;
	private String address;
	private String name;
	private Date createdAt;
}
