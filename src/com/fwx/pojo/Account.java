package com.fwx.pojo;

import javax.xml.bind.annotation.*;

/**
 * 账号实体类
 * @author Fwx
 * @param null
 * @return
 */

/**
 * @XmlAccessorType(XmlAccessType.FIELD)指定映射为XML文档的类中要映射成XML格式中元素标签的成员属性，为这个类中的所有成员属性变量
 * @XmlRootElement 用在class类的注解，常与@XmlRootElement，@XmlAccessorType一起使用.也可以单独使用,如果单独使用,需要在成员属性的get方法上加@XmlElement等注解.
 * @XmlType,在使用@XmlType的propOrder 属性时，必须列出JavaBean对象中的所有XmlElement，否则会报错。
 * @author
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Account")
@XmlType(propOrder = {"accountName","comment","passWord"})  //可以设置生成字段的顺序
public class Account {
    @XmlElement(name = "AccountName",required = true)
    private String accountName;
    @XmlAttribute(name = "CreationTime")
    private String creationTime;
    @XmlElement(name = "PassWord",required = true)
    private String passWord;
    @XmlElement(name = "Comment")
    private String comment;

    public Account() {
    }

    public Account(String accountName, String creationTime, String passWord, String comment) {
        this.accountName = accountName;
        this.creationTime = creationTime;
        this.passWord = passWord;
        this.comment = comment;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", creationTime='" + creationTime + '\'' +
                ", passWord='" + passWord + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
