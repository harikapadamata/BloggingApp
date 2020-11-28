package com.cg.blogging.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.blogging.entities.Comment;

@Repository
public interface CommentJPARepository extends JpaRepository<Comment,Integer>{

}
