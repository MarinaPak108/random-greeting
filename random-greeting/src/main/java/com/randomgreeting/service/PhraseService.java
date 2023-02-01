package com.randomgreeting.service;

import com.randomgreeting.entity.PhraseEntity;
import com.randomgreeting.repo.PhraseRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

@Service
public class PhraseService {
    private final PhraseRepo repo;
    private static final Logger logger = Logger.getLogger(PhraseService.class.getName());

    public PhraseService(PhraseRepo repo) {
        this.repo = repo;
    }

    public List<PhraseEntity> showPhrases(){
       return repo.findAll();
    }

    public PhraseEntity randomPhrase(){
        List<PhraseEntity> phrases = repo.findAll();
        Long size = Long.valueOf(phrases.size());
        Random rand = new Random();
        Long phraseId = rand.nextLong(size-1);
        logger.info(String.format("phrase id is %s ", phraseId));
        PhraseEntity phrase = repo.findPhraseEntityByPhraseId(phraseId+1);
        if (phrase.getPath().equals("0")){
            phrase.setPath("https://images.unsplash.com/photo-1471623432079-b009d30b6729?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
            logger.info(String.format("phrase path is null and now is %s ", phrase.getPath()));
            return phrase;
        }
        return phrase;
    }
}
