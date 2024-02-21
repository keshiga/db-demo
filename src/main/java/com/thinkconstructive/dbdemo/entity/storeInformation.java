package com.thinkconstructive.dbdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class storeInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookId;
    private String bookName;
    private String bookDetail;


    private String bookNumber;



    public storeInformation() {
    }

    public storeInformation(String bookName, String bookDetail, String bookNumber) {
        this.bookName = bookName;
        this.bookDetail = bookDetail;
        this.bookNumber = bookNumber;
    }

    public Integer getBookId() {
        return bookId;
    }
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getBookDetail() {
        return bookDetail;
    }
    public void setBookDetail(String bookDetail) {
        this.bookDetail = bookDetail;
    }
    public String getBookNumber() {
        return bookNumber;
    }
    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }
}
