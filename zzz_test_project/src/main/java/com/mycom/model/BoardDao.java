package com.mycom.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDao implements BoardDaoInter{
	
	@Autowired
	private AnnoInter inter;
	
	@Override
	public List<BoardDto> selectList() throws DataAccessException {
		
		return inter.selectList();
	}
	
}
