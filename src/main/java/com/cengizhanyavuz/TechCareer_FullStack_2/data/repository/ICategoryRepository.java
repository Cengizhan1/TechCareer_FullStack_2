package com.cengizhanyavuz.TechCareer_FullStack_2.data.repository;

import com.cengizhanyavuz.TechCareer_FullStack_2.data.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICategoryRepository extends CrudRepository<CategoryEntity,Long> {

    Optional<CategoryEntity> findByCategoryName(String categoryName);
}