package com.cg.blogging.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.blogging.entities.Community;

@Repository
public interface CommunityJPARepository extends JpaRepository<Community,Integer>{

}
