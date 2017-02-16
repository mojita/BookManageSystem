package com.cn.design.domain;

import java.util.Date;

/**
 * Created by lijunhong on 17/2/8.
 */
public class LibraryCard {

    private Integer cardId;     //借书证的Id

    private String userName;    //用户姓名

    private Date startDate;     //借书证开始时间

    private User user;          //用户

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
