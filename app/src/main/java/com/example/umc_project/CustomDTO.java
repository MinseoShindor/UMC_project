package com.example.umc_project;

public class CustomDTO {

    // 유기동물 Data

    private String name; //동물 종 이름
    private String sex;
    private String type; //동물 종류
    private String region;
    private String departureDate;

    private int ResId; //동물 구분하기 위한 유일 id
    private int age;
    private int weight;


    //종 이름
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //성별
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //동물 종류
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //지역
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }


    //출국 가능 날짜
    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String region) {
        this.departureDate = departureDate;
    }


    //나이
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //몸무게
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //id
    public int getResId() {
        return ResId;
    }

    public void setResId(int ResId) {
        this.ResId = ResId;
    }



}
