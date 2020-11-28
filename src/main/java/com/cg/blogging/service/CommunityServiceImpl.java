package com.cg.blogging.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.blogging.dao.CommunityJPARepository;

@Service
public class CommunityServiceImpl implements CommunityService{
	
	@Autowired
	private CommunityJPARepository communityJPARepository;

}
