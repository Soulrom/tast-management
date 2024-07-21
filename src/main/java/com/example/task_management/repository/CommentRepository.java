package com.example.task_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.task_management.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}