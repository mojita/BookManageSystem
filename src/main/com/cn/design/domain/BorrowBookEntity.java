package com.cn.design.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by lijunhong on 17/2/8.
 */
public class BorrowBookEntity {

    private Integer borrowBookEntityId;     //id

    private String bookName;                //booName

    private Integer bookId;                 //bookId

    private int isBeyondLimit;              //是否超过期限(0未超过,1超过)

    private int cenBorrowBookNum;           //能借本书(当前)

    private Date borrowStartDate;           //借书开始时间

    private int borrowBookLimit;         //这本书的借书的规定期限

    private Date returnEndDate;             //还书的时间

    private String classificationName;      //分类

    private List<User> users;               //借这本书的用户,一本书有很多本,所以会出现很多用户,多对多关系

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

    public int getBorrowBookLimit() {
        return borrowBookLimit;
    }

    public void setBorrowBookLimit(int borrowBookLimit) {
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
