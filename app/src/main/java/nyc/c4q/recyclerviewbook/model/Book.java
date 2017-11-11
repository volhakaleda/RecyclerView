package nyc.c4q.recyclerviewbook.model;

import android.support.annotation.DrawableRes;

public class Book {

    private String title;
    private String author;
    private int year;
    @DrawableRes
    private int resId;


    public Book(String title, String author, int year, @DrawableRes int resId) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.resId = resId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @DrawableRes
    public int getResId() {
        return resId;
    }

    public void setResId(@DrawableRes
                                 int resId) {
        this.resId = resId;
    }
}
