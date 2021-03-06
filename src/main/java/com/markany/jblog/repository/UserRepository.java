package com.markany.jblog.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markany.jblog.vo.UserVo;

@Repository
public class UserRepository {
	
	@Autowired
	private SqlSession sqlSession;

	public int insertUser(UserVo userVo) {
		return sqlSession.insert("user.insertUser", userVo);
	}

	public UserVo findByIdAndPassword(UserVo userVo) {
		return sqlSession.selectOne("user.findByIdAndPassword", userVo);
	}

}
