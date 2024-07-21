package com.example.task_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.task_management.entity.Author;
import com.example.task_management.service.AuthorService;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public List<Author> getAllAuthors() {
        return authorService.findAll();
    }

    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable Long id) {
        return authorService.findById(id);
    }

    @PostMapping
    public Author createAuthor(@RequestBody Author author) {
        return authorService.save(author);
    }

    @PutMapping("/{id}")
    public Author updateAuthor(@PathVariable Long id, @RequestBody Author authorDetails) {
        Author author = authorService.findById(id);

        if (author != null) {
            author.setName(authorDetails.getName());
            return authorService.save(author);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id) {
        authorService.deleteById(id);
    }
}