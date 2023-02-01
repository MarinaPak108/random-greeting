package com.randomgreeting.entity;

import com.randomgreeting.dto.GenderDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gender")
public class GenderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private int count;
    @Column
    private String gender;
    @Column
    private String name;
    @Column
    private double probability;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    public static GenderEntity from(GenderDto genderDto) {
        GenderEntity genderEntity = new GenderEntity();
        genderEntity.setGender(genderDto.getGender());
        genderEntity.setCount(genderDto.getCount());
        genderEntity.setProbability(genderDto.getProbability());
        genderEntity.setName(genderDto.getName());
        return genderEntity;
    }
}
