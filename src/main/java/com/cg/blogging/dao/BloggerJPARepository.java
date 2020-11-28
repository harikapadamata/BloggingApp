package com.cg.blogging.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.blogging.entities.Blogger;

@Repository
public interface BloggerJPARepository extends JpaRepository<Blogger,Integer>{

}
