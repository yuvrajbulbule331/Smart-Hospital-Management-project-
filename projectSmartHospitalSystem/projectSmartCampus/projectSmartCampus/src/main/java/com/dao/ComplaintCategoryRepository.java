package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.ComplaintCategory;

public interface ComplaintCategoryRepository extends JpaRepository<ComplaintCategory, Long>{

}
