package com.randomgreeting.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "category")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CategoryID")
    private Long categoryId;
    @Column (name = "Category")
    private String category;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "CategoryEntity{" +
                "categoryId=" + categoryId +
                ", category='" + category + '\'' +
                '}';
    }
}
