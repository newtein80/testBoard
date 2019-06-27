package com.test.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.test.board.vo.TestBoardVO;

@Repository
public class TestBoardDAOImpl implements TestBoardDAO {

	@Inject
	SqlSession sqlSession;
	
	@Override
	public List<TestBoardVO> selectBoardItemList() throws Exception {
		return sqlSession.selectList("testboard.lists");
	}

	@Override
	public void insertBoardItem(TestBoardVO testBoardVO) throws Exception {
		sqlSession.insert("testboard.insertItem", testBoardVO);

	}

	@Override
	public TestBoardVO selectBoardItem(int idx) throws Exception {
		return sqlSession.selectOne("testboard.selectItem", idx);
	}

	@Override
	public void updateBoardItem(TestBoardVO testBoardVO) throws Exception {
		sqlSession.update("testboard.updateItem", testBoardVO);
	}

	@Override
	public void deleteBoardItem(int idx) throws Exception {
		sqlSession.delete("testboard.deleteItem", idx);
	}

}
