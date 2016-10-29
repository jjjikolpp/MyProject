package com.mycom.model;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface AnnoInter {
	@Select("select * from boardtest order by b_no1 desc limit 0,10")
	public List<BoardDto> selectList();
	
	@Select("select * from boardtest order by b_no1 desc limit 0,10")
	public List<BoardDto> selectScrollList();
	
}
