package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Complaint;

public interface ComplaintRepository extends JpaRepository<Complaint,Long>{
	
	
	
}
