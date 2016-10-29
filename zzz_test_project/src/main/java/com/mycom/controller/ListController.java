package com.mycom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mycom.model.BoardDaoInter;

@Controller
public class ListController {
	@Autowired
	private BoardDaoInter inter;
	
	@RequestMapping("list")
	public ModelAndView viewList(){
//		return new ModelAndView("list");
		return new ModelAndView("list", "list", inter.selectList());
	}
}