package com.fwx.pojo;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * 用户实体类
 * @author Fwx
 * @param null
 * @return
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "User")
@XmlType(propOrder = {"accounts"})
public class User {
    @XmlElement(name = "Accounts")
    private List<Account> accounts;    //一个用户对应多个账户
    @XmlAttribute(name = "UserName")
    private String userName;
    @XmlAttribute(name = "age")
    private int age;


    public User() {
    }

    public User(String userName, int age, List<Account> accounts) {
        this.userName = userName;
        this.age = age;
        this.accounts = accounts;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", accounts=" + accounts +
                '}';
    }
}
