package com.mycom.model;

import java.util.List;

import org.springframework.dao.DataAccessException;

public interface BoardDaoInter {
	List<BoardDto> selectList() throws DataAccessException;
	List<BoardDto> selectScrollList(String last_bno) throws DataAccessException;
}
