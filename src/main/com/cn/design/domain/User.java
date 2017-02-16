package com.cn.design.domain;

import java.util.Set;

/**
 * Created by lijunhong on 17/1/24.
 */
public class User {

    private Integer userId;                             //userId

    private String userName;                            //用户名

    private String password;                            //密码

    private String nick;                                //昵称

    private String emailAddress;                        //邮箱地址

    private String homeAddress;                         //家庭住址

    private String phoneNum;                            //电话

    private String imageName;                           //图片名字

    private String imagePath;                           //图片路径

    private LibraryCard libraryCard;                    //借书证

    private Role role;                                  //角色

    private Set<BorrowBookEntity> borrowBookEntities;  //借书

    private Set<ReturnBookEntity> returnBookEntities;  //还书

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
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

    public LibraryCard getLibraryCard() {
        return libraryCard;
    }

    public void setLibraryCard(LibraryCard libraryCard) {
        this.libraryCard = libraryCard;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Set<BorrowBookEntity> getBorrowBookEntities() {
        return borrowBookEntities;
    }

    public void setBorrowBookEntities(Set<BorrowBookEntity> borrowBookEntities) {
        this.borrowBookEntities = borrowBookEntities;
    }

    public Set<ReturnBookEntity> getReturnBookEntities() {
        return returnBookEntities;
    }

    public void setReturnBookEntities(Set<ReturnBookEntity> returnBookEntities) {
        this.returnBookEntities = returnBookEntities;
    }
}
