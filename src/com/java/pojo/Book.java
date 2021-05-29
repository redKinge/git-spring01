package com.java.pojo;

/**
 * description:描述
 * author: 河发
 * time: 14:35
 */
public class Book {
    private Long id;//主键
    private String bankNo;//号码
    private String uName;//姓名
    private Float money;//金额
    public  Book(){

    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bankNo='" + bankNo + '\'' +
                ", uName='" + uName + '\'' +
                ", money=" + money +
                '}';
    }
}
