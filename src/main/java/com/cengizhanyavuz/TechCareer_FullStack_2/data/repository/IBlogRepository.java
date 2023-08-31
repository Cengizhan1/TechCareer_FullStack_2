package com.cengizhanyavuz.TechCareer_FullStack_2.data.repository;

import com.cengizhanyavuz.TechCareer_FullStack_2.data.entity.BlogEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// CrudRepository
// JpaRepository
@Repository
public interface IBlogRepository extends CrudRepository<BlogEntity,Long> {
}