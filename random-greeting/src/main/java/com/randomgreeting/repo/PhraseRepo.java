package com.randomgreeting.repo;

import com.randomgreeting.entity.PhraseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhraseRepo extends JpaRepository<PhraseEntity, Long> {
    PhraseEntity findPhraseEntityByPhraseId (Long id);
}
