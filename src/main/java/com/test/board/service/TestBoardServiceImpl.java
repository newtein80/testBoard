package com.test.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.test.board.dao.TestBoardDAO;
import com.test.board.vo.TestBoardVO;

@Service
public class TestBoardServiceImpl implements TestBoardService {

	@Inject
	TestBoardDAO testBoardDao;
	
	@Override
	public List<TestBoardVO> getBoardItemList() throws Exception {
		return testBoardDao.selectBoardItemList();
	}

	@Override
	public void registBoardItem(TestBoardVO testBoardVO) throws Exception {
		testBoardDao.insertBoardItem(testBoardVO);
	}

	@Override
	public TestBoardVO getBoardItem(int idx) throws Exception {
		return testBoardDao.selectBoardItem(idx);
	}

	@Override
	public void modifyBoardItem(TestBoardVO testBoardVO) throws Exception {
		testBoardDao.updateBoardItem(testBoardVO);
	}

	@Override
	public void removeBoardItem(int idx) throws Exception {
		testBoardDao.deleteBoardItem(idx);
	}

}
