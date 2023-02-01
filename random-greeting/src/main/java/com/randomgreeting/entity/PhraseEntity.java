package com.randomgreeting.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "phrase")
public class PhraseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long phraseId;
    @Column
    private String phrase;
    @ManyToOne
    @JoinColumn(name = "author_phrase", nullable = false, insertable = false, updatable = false)
    private AuthorEntity authorPhrase;
    @Column()
    private String path;
    @ManyToOne
    @JoinColumn(name = "category_phrase")
    private CategoryEntity categoryPhrase;

    public Long getPhraseId() {
        return phraseId;
    }

    public void setPhraseId(Long phraseId) {
        this.phraseId = phraseId;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public AuthorEntity getAuthorPhrase() {
        return authorPhrase;
    }

    public void setAuthorPhrase(AuthorEntity authorPhrase) {
        this.authorPhrase = authorPhrase;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public CategoryEntity getCategoryPhrase() {
        return categoryPhrase;
    }

    public void setCategoryPhrase(CategoryEntity categoryPhrase) {
        this.categoryPhrase = categoryPhrase;
    }

    @Override
    public String toString() {
        return "PhraseEntity{" +
                "phraseId=" + phraseId +
                ", phrase='" + phrase + '\'' +
                ", authorPhrase=" + authorPhrase.getName() +
                ", path='" + path + '\'' +
                ", categoryPhrase=" + categoryPhrase.getCategory() +
                '}';
    }
}
