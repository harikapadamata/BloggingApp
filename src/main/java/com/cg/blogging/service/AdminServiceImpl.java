package com.cg.blogging.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.blogging.dao.AdminJPARepository;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminJPARepository adminJPARepository;
	
	

}
