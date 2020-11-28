package com.cg.blogging.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.blogging.entities.Admin;

@Repository
public interface AdminJPARepository extends JpaRepository<Admin,Integer>{

}
