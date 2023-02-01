package com.randomgreeting.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "author")
public class AuthorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AuthorID")
    private Long authorId;
    @Column(name = "Name")
    private String name;

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AuthorEntity{" +
                "authorId=" + authorId +
                ", name='" + name + '\'' +
                '}';
    }
}
