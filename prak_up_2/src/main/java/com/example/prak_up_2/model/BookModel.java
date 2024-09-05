package com.example.prak_up_2.model;

public class BookModel {
    private int Id;
    private String Name;
    private String Author;
    private String Publishing;
    private int YearPublishing;

    public BookModel(int id, String name, String author, String publishing, int yearPublishing) {
        Id = id;
        Name = name;
        Author = author;
        Publishing = publishing;
        YearPublishing = yearPublishing;
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

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPublishing() {
        return Publishing;
    }

    public void setPublishing(String publishing) {
        Publishing = publishing;
    }

    public int getYearPublishing() {
        return YearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        YearPublishing = yearPublishing;
    }
}
