package com.randomgreeting.dto;

import com.randomgreeting.entity.GenderEntity;

import java.lang.String;

public final class GenderDto {
    private int count;
    private String gender;
    private String name;
    private double probability;

    public GenderDto() {
    }

    public GenderDto(int count, String gender, String name, double probability) {
        this.count = count;
        this.gender = gender;
        this.name = name;
        this.probability = probability;
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

    public static GenderDto from(GenderEntity genderEntity) {
        GenderDto genderDto = new GenderDto();
        genderDto.setGender(genderEntity.getGender());
        genderDto.setProbability(genderEntity.getProbability());
        genderDto.setCount(genderEntity.getCount());
        genderDto.setName(genderEntity.getName());
        return genderDto;
    }
}