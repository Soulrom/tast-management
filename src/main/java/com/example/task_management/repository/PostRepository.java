package com.example.task_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.task_management.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}