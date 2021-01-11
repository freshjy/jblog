package com.markany.jblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markany.jblog.repository.UserRepository;
import com.markany.jblog.vo.UserVo;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public boolean join(UserVo vo) {
		int count = userRepository.insert(vo);
		return count == 1;
	}
}
