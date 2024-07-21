package com.example.task_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.task_management.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}