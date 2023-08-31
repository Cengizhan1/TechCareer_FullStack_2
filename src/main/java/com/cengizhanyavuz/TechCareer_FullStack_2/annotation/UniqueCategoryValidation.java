package com.cengizhanyavuz.TechCareer_FullStack_2.annotation;

import com.cengizhanyavuz.TechCareer_FullStack_2.data.repository.ICategoryRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;

// LOMBOK
@RequiredArgsConstructor

// Annotation
public class UniqueCategoryValidation implements ConstraintValidator<UniqueCategoryName,String> {
    // Injection
    private final ICategoryRepository iCategoryRepository;
    @Override
    public boolean isValid(String categoryName, ConstraintValidatorContext constraintValidatorContext) {
        boolean isOtherCategoryName=iCategoryRepository.findByCategoryName(categoryName).isPresent();
        return !isOtherCategoryName;
    }
}