package com.OEkrem;

import java.util.Objects;

public class User {

    private String userName;
    private String psw;
    private String yetki;
    private int sum;

    public User(String userName, String psw) {
        this.userName = userName;
        this.psw = psw;
        this.yetki = "Limited";
        this.sum = 0;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getYetki() {
        return yetki;
    }

    public void setYetki(String yetki) {
        this.yetki = yetki;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getId() {
        return ATM.database.getId(this);
    }

    public void paraCek(int sum){
        this.setSum(this.getSum()-sum);
    }
    public void paraYatir(int sum){
        this.setSum(this.getSum()+sum);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userName.equals(user.userName) && psw.equals(user.psw);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, psw);
    }

    @Override
    public String toString() {
        return "UserName : '" + userName + '\'' +
                " - Psw : '" + psw + '\'' +
                " - Yetki : '" + yetki + '\'' +
                " - Sum : " + sum;
    }
}
