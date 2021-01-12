package com.markany.jblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markany.jblog.repository.BlogRepository;
import com.markany.jblog.repository.CategoryRepository;
import com.markany.jblog.repository.UserRepository;
import com.markany.jblog.vo.BlogVo;
import com.markany.jblog.vo.CategoryVo;
import com.markany.jblog.vo.UserVo;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BlogRepository blogRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	
	
	public boolean join(UserVo userVo) {
		
		boolean check = false;
		
		CategoryVo categoryVo = new CategoryVo();
		BlogVo blogVo = new BlogVo();
		
		blogVo.setBlogId(userVo.getId());
		blogVo.setBlogTitle(userVo.getName());
		blogVo.setLogo("/assets/images/spring-logo.jpg");
		
		categoryVo.setCategoryName("無");
		categoryVo.setDesc("無");
		categoryVo.setBlogId(blogVo.getBlogId());
		
		check = (userRepository.insertUser(userVo)==1) &&
				(blogRepository.insertBlog(blogVo)==1)&&
				(categoryRepository.inserCategory(categoryVo)==1);
		
		System.out.println(userVo);
		System.out.println(blogVo);
		System.out.println(categoryVo);
		return check;
	}

	public UserVo getUser(UserVo userVo) {
		return userRepository.findByIdAndPassword(userVo);
	}
}
