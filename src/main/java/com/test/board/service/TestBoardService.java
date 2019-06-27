package com.test.board.service;

import java.util.List;

import com.test.board.vo.TestBoardVO;

public interface TestBoardService {
	public List<TestBoardVO> getBoardItemList() throws Exception;
	public void registBoardItem(TestBoardVO testBoardVO) throws Exception;
	public TestBoardVO getBoardItem(int idx) throws Exception;
	public void modifyBoardItem(TestBoardVO testBoardVO) throws Exception;
	public void removeBoardItem(int idx) throws Exception;
}
