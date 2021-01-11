package com.markany.jblog.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markany.jblog.vo.UserVo;

@Repository
public class UserRepository {
	
	@Autowired
	private SqlSession sqlSession;

	public int insert(UserVo userVo) {
		System.out.println(userVo);
		//return sqlSession.insert("user.insert", userVo);
		return 0;
	}

}
