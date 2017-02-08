package com.cn.design.domain;

import java.util.List;

/**
 * Created by lijunhong on 17/2/8.
 */
public class Classification {

    private Integer classificationId;

    private String classificationName;

    private List<Book> books;

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
