package com.iu.s1.bankBook;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankBookDAO {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.s1.bankBook.BankBookDAO.";
	
	public List<BankBookDTO> getBankBookList()throws Exception{
		return sqlSession.selectList(NAMESPACE+"getBankBookList");
	}
	
	public BankBookDTO getBankBookDetail(BankBookDTO bankBookDTO)throws Exception{
		return sqlSession.selectOne(NAMESPACE+"getBankBookDetail", bankBookDTO);
	}
	
	public int setBankBookAdd(BankBookDTO bankBookDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setBankBookAdd", bankBookDTO);
	}
	
	public int setBankBookUpdate(BankBookDTO bankBookDTO)throws Exception{
		return sqlSession.update(NAMESPACE+"setBankBookUpdate", bankBookDTO);
	}
	
	public int setBankBookDelete(BankBookDTO bankBookDTO)throws Exception{
		return sqlSession.delete(NAMESPACE+"setBankBookDelete", bankBookDTO);
	}

	
	
	

}
