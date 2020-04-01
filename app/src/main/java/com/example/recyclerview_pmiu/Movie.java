package com.example.recyclerview_pmiu;

public class Movie {
    private String genre;
    private String title;
    private int year;

    public Movie(String titleArg,String genreArg,int yearArg){
        this.title =titleArg;
        this.year=yearArg;
        this.genre =genreArg;


    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
