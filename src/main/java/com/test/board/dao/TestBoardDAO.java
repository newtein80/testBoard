package com.test.board.dao;

import java.util.List;

import com.test.board.vo.TestBoardVO;

public interface TestBoardDAO {
	public List<TestBoardVO> selectBoardItemList() throws Exception;
	public void insertBoardItem(TestBoardVO testBoardVO) throws Exception;
	public TestBoardVO selectBoardItem(int idx) throws Exception;
	public void updateBoardItem(TestBoardVO testBoardVO) throws Exception;
	public void deleteBoardItem(int idx) throws Exception;
}
