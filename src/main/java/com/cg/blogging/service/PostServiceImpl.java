package com.cg.blogging.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.blogging.dao.PostJPARepository;

@Service
public class PostServiceImpl implements PostService{
	
	@Autowired
	private PostJPARepository  postJPARepository;

}
