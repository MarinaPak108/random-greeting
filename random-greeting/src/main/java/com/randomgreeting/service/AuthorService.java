package com.randomgreeting.service;

import com.randomgreeting.entity.AuthorEntity;
import com.randomgreeting.repo.AuthorRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    private final AuthorRepo repo;

    public AuthorService(AuthorRepo repo) {
        this.repo = repo;
    }

    public List<AuthorEntity> showAuthors() {
        return repo.findAll();
    }
}
