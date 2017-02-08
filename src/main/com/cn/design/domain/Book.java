package com.cn.design.domain;

import java.util.Date;

/**
 * Created by lijunhong on 17/2/8.
 */
public class Book {

    private Integer bookId;                     //id

    private String bookName;                    //书名

    private String press;                       //出版社

    private String author;                      //作者

    private int bookCount;                      //书的总本书

    private int bookNewNum;                     //当前图书馆中的本书

    private String description;                 //书的描述

    private String addUserName;                 //添加这的名字

    private String imageName;                   //图片名字

    private String imagePath;                   //图片路径

    private Date importDate;                    //入库时间

    private Classification classification;      //分类

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

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public int getBookNewNum() {
        return bookNewNum;
    }

    public void setBookNewNum(int bookNewNum) {
        this.bookNewNum = bookNewNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddUserName() {
        return addUserName;
    }

    public void setAddUserName(String addUserName) {
        this.addUserName = addUserName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }
}
