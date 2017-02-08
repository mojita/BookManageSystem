package com.cn.design.domain;

import java.util.List;

/**
 * Created by lijunhong on 17/2/8.
 */
public class Classification {

    private Integer classificationId;       //书的分类

    private String classificationName;      //分类型

    private List<Book> books;               //书,这个是1对多的关系

    public Integer getClassificationId() {
        return classificationId;
    }

    public void setClassificationId(Integer classificationId) {
        this.classificationId = classificationId;
    }

    public String getClassificationName() {
        return classificationName;
    }

    public void setClassificationName(String classificationName) {
        this.classificationName = classificationName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
