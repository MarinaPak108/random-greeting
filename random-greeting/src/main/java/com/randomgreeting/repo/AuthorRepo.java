package com.randomgreeting.repo;

import com.randomgreeting.entity.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo extends JpaRepository<AuthorEntity, Long> {
}
