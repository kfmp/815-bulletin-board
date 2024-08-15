package com.board.api.board.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.board.api.board.dto.resultMap.BoardListRM;

@Mapper
public interface BoardMapper {

	List<BoardListRM> getBoardList();

}
