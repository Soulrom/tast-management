package com.example.task_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.task_management.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}