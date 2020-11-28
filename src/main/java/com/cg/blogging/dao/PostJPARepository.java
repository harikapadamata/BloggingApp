package com.cg.blogging.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.blogging.entities.Post;

@Repository
public interface PostJPARepository extends JpaRepository<Post,Integer>{

}
