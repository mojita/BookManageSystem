package com.cn.design.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by lijunhong on 17/2/8.
 */
public class ReturnBookEntity {

    private Integer returnBookEntityId;     //还书id

    private String bookName;                //书名

    private Integer bookId;                 //书id

    private int isBeyondLimit;              //是否超期(0未超期,1超期)

    private int cenBorrowBookNum;           //当前能被借阅的本书

    private Date borrowStartDate;           //借书开始时间

    private int borrowBookLimit;         //借书期限

    private Date returnEndDate;             //还书时间

    private String classificationName;      //分类

    private List<User> users;               //用户,这里也是多对多关系

    public Integer getReturnBookEntityId() {
        return returnBookEntityId;
    }

    public void setReturnBookEntityId(Integer returnBookEntityId) {
        this.returnBookEntityId = returnBookEntityId;
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
