package com.company;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


public class Book {
    String name;
    String author;
    LocalDate publishDate;
    int numPages;
    qualityOfBook quality;
    boolean isFiction;

    public enum qualityOfBook{
        USED,
        NEW,
        GOOD,
        FAIR
    }

    public Book(String name, String author, LocalDate publishDate, int numPages, qualityOfBook quality, boolean isFiction) {
        this.name = name;
        this.author = author;
        this.publishDate = publishDate;
        this.numPages = numPages;
        this.quality = quality;
        this.isFiction = isFiction;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.publishDate = LocalDate.of(2000, 1, 1);;
        this.numPages = 100;
        this.quality = qualityOfBook.USED;
        this.isFiction = true;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }
    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public int getNumPages() {
        return numPages;
    }
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public qualityOfBook getQuality() {
        return quality;
    }
    public void setQuality(qualityOfBook quality) {
        this.quality = quality;
    }

    public boolean isFiction() {
        return isFiction;
    }
    public void setFiction(boolean fiction) {
        isFiction = fiction;
    }

    public int getAge() {
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
        int year = localDate.getYear();

        int bYear = publishDate.getYear();
        int bMonth = publishDate.getMonthValue();
        int bDay = publishDate.getDayOfMonth();

        int yearDif = year - bYear;
        if ((month - bMonth) > 0) {
            return yearDif;
        } else if (((month - bMonth) < 0)) {
            return (yearDif - 1);
        } else {
            if (day >= bDay) {
                return yearDif;
            } else {
                return (yearDif - 1);
            }
        }
    }
    public boolean isLong(){
        return(numPages>=550);
    }

    public boolean accordingToAlexIsAGoodBook(){
        return(numPages<400 && publishDate.getYear()>2000&& isFiction==true);
    }
}
