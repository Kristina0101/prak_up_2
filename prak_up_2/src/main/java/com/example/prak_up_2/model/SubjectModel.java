package com.example.prak_up_2.model;

public class SubjectModel {
    private int Id;
    private String Name;
    private int HourInTems;
    private String NameTeacher;
    private String SurnameTeacher;
    private String MiddleNameTeacher;

    public SubjectModel(int id, String name, int hourInTems, String nameTeacher, String surnameTeacher, String middleNameTeacher) {
        Id = id;
        Name = name;
        HourInTems = hourInTems;
        NameTeacher = nameTeacher;
        SurnameTeacher = surnameTeacher;
        MiddleNameTeacher = middleNameTeacher;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getHourInTems() {
        return HourInTems;
    }

    public void setHourInTems(int hourInTems) {
        HourInTems = hourInTems;
    }

    public String getNameTeacher() {
        return NameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        NameTeacher = nameTeacher;
    }

    public String getSurnameTeacher() {
        return SurnameTeacher;
    }

    public void setSurnameTeacher(String surnameTeacher) {
        SurnameTeacher = surnameTeacher;
    }

    public String getMiddleNameTeacher() {
        return MiddleNameTeacher;
    }

    public void setMiddleNameTeacher(String middleNameTeacher) {
        MiddleNameTeacher = middleNameTeacher;
    }
}
