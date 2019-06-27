package com.test.board.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.synth.SynthSeparatorUI;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.board.service.TestBoardService;
import com.test.board.vo.TestBoardVO;

@Controller
@RequestMapping(value="/test/*")
public class TestBoardController {
	
	@Inject
	TestBoardService testBoardService;
	
	@RequestMapping(value="board/list.do")
	public String boardList(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) throws Exception {
		List<TestBoardVO> _boardList = testBoardService.getBoardItemList();
		modelMap.addAttribute("items", _boardList);
		return "test/board/list";
	}
	
	@RequestMapping(value="board/view.do", method=RequestMethod.GET)
	public String boardView(@RequestParam int idx, ModelMap modelMap) throws Exception {
		TestBoardVO _boardItem = testBoardService.getBoardItem(idx);
		modelMap.addAttribute("item", _boardItem);
		return "test/board/view";
	}
	
	@RequestMapping(value="board/regform.do")
	public String boardReg(ModelMap modelMap) throws Exception {
		return "test/board/regform";
	}
	
	@RequestMapping(value="board/reg.do", method=RequestMethod.POST)
	public String boardRegAction(TestBoardVO testBoardVO) throws Exception {
		testBoardService.registBoardItem(testBoardVO);
		return "redirect: list.do";
	}
	
	@RequestMapping(value="board/mod.do", method=RequestMethod.POST)
	public String boardModAction(TestBoardVO testBoardVO) throws Exception {
		testBoardService.modifyBoardItem(testBoardVO);
		System.out.println("debug: " + testBoardVO.toString());
		return "redirect: list.do";
	}
	
	@RequestMapping(value="board/modform.do", method=RequestMethod.GET)
	public String boardMod(@RequestParam int idx, ModelMap modelMap) throws Exception {
		TestBoardVO _boardItem = testBoardService.getBoardItem(idx);
		modelMap.addAttribute("item", _boardItem);
		return "test/board/modform";
	}
	
	@RequestMapping(value="board/delete.do", method=RequestMethod.GET)
	public String boardDel(@RequestParam int idx, ModelMap modelMap) throws Exception {
		testBoardService.removeBoardItem(idx);
		return "redirect: list.do";
	}
	
}
