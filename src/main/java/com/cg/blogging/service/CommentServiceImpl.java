package com.cg.blogging.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.blogging.dao.CommentJPARepository;

@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	private CommentJPARepository commentJPARepository;
	

}
