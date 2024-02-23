package com.balikicindebalik.guidebackend.API.models;

import java.util.Date;

public class Guide {
    private int id;
    private String title;
   private String content;
    private String author;
    private Date releaseDate;

    private String readingTime;

    public Guide(int id, String title, String content, String author, Date releaseDate, String readingTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.releaseDate = releaseDate;
        this.readingTime = readingTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getReadingTime() {
        return readingTime;
    }

    public void setReadingTime(String readingTime) {
        this.readingTime = readingTime;
    }
}
