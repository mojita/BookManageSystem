package com.cn.design.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by lijunhong on 17/2/8.
 */
public class BorrowBookEntity {

    private Integer borrowBookEntityId;

    private String bookName;

    private Integer bookId;

    private int isBeyondLimit;

    private int cenBorrowBookNum;

    private Date borrowStartDate;

    private String borrowBookLimit;

    private Date returnEndDate;

    private String classificationName;

    private List<User> users;

    public Integer getBorrowBookEntityId() {
        return borrowBookEntityId;
    }

    public void setBorrowBookEntityId(Integer borrowBookEntityId) {
        this.borrowBookEntityId = borrowBookEntityId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public int getIsBeyondLimit() {
        return isBeyondLimit;
    }

    public void setIsBeyondLimit(int isBeyondLimit) {
        this.isBeyondLimit = isBeyondLimit;
    }

    public int getCenBorrowBookNum() {
        return cenBorrowBookNum;
    }

    public void setCenBorrowBookNum(int cenBorrowBookNum) {
        this.cenBorrowBookNum = cenBorrowBookNum;
    }

    public Date getBorrowStartDate() {
        return borrowStartDate;
    }

    public void setBorrowStartDate(Date borrowStartDate) {
        this.borrowStartDate = borrowStartDate;
    }

    public String getBorrowBookLimit() {
        return borrowBookLimit;
    }

    public void setBorrowBookLimit(String borrowBookLimit) {
        this.borrowBookLimit = borrowBookLimit;
    }

    public Date getReturnEndDate() {
        return returnEndDate;
    }

    public void setReturnEndDate(Date returnEndDate) {
        this.returnEndDate = returnEndDate;
    }

    public String getClassificationName() {
        return classificationName;
    }

    public void setClassificationName(String classificationName) {
        this.classificationName = classificationName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
