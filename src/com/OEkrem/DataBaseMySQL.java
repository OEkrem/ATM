package com.OEkrem;

import java.sql.*;
import java.util.ArrayList;

public class DataBaseMySQL implements IDataBaseUserProcess, IDataBaseMoneyProcess{

    private Connection con = null;
    private Statement statement = null;

    @Override
    public boolean connect() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadı..");
            System.out.println("DataBaseMySQL-conncect()-ClassNotFoundException : \"com.mysql.jdbc.Driver\"");
        }
        try {
            con = DriverManager.getConnection(IDataBase.getConnectUrl(), IDataBase.kullanici_Adi, IDataBase.sifre);
            System.out.println("Bağlantı başarılı..");
            return true;
        } catch (SQLException ex) {
            System.out.println("Bağlantı başarısız..");
            System.out.println("DataBaseMySQL-conncect()-SQLExcepiton : " + IDataBase.tablo_ismi);
        }
        return false;
    }

    @Override
    public boolean userCheck(User user) {
        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery("Select * From " + IDataBase.tablo_ismi);
            while(rs.next()) {
                String userName = rs.getString(IDataBase.column_userName);
                String psw = rs.getString(IDataBase.column_psw);
                if(user.getUserName().equals(userName))
                    if(user.getPsw().equals(psw))
                        return true;

            }
        } catch (SQLException e) {
            System.out.println("DataBaseMySQL-userCheck()-SQLExcepiton : " + IDataBase.tablo_ismi);
        }
       return false;
    }

    @Override
    public boolean addUser(User user) {
        if(!userCheck(user)){
            try {
                statement = con.createStatement();
                String ekle = "Insert INTO " + IDataBase.tablo_ismi + " ("+column_userName+","+column_psw+","+column_sum+","+column_yetki+")"+
                        " VALUES("+ "'" + user.getUserName()+"','" + user.getPsw() + "','" + user.getSum() + "','" + user.getYetki() + "'"+ ")";
                statement.executeUpdate(ekle);
            } catch (SQLException e) {
                System.out.println("DataBaseMySQL-addUser()-SQLExcepiton : " + IDataBase.tablo_ismi);
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean removeUser(User user) {
        if(userCheck(user)){
            try {
                statement = con.createStatement();
                statement.executeUpdate("Delete from "+ IDataBase.tablo_ismi +" where "+ column_id + " = " + getId(user));
            } catch (SQLException e) {
                System.out.println("DataBaseMySQL-removeUser()-SQLExcepiton : " + IDataBase.tablo_ismi);
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public int getId(User user) {
        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery("Select * From " + IDataBase.tablo_ismi);
            while(rs.next()) {
                int id = rs.getInt(IDataBase.column_id);
                String userName = rs.getString(IDataBase.column_userName);
                if(user.getUserName().equals(userName))
                    return id;
            }
        } catch (SQLException e) {
            System.out.println("DataBaseMySQL-getId()-SQLExcepiton : " + IDataBase.tablo_ismi);
        }
        return -1;
    }

    @Override
    public User getUser(int id) {
        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery("Select * From " + IDataBase.tablo_ismi);
            while(rs.next()) {
                int id1 = rs.getInt(IDataBase.column_id);
                String userName = rs.getString(IDataBase.column_userName);
                String psw = rs.getString(IDataBase.column_psw);
                if(id == id1)
                    return new User(userName, psw);
            }
        } catch (SQLException e) {
            System.out.println("DataBaseMySQL-getUser()-SQLExcepiton : " + IDataBase.tablo_ismi);
        }
        return null;
    }

    @Override
    public User getUser(String userName) {
        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery("Select * From " + IDataBase.tablo_ismi);
            while(rs.next()) {
                int id = rs.getInt(IDataBase.column_id);
                String userName1 = rs.getString(IDataBase.column_userName);
                String psw = rs.getString(IDataBase.column_psw);
                int sum = rs.getInt(IDataBase.column_sum);
                String yetki = rs.getString(IDataBase.column_yetki);
                if(userName1.equals(userName)){
                    User user = new User(userName, psw);
                    user.setYetki(yetki);
                    user.setSum(sum);
                    return user;
                }
            }
        } catch (SQLException e) {
            System.out.println("DataBaseMySQL-getUser()-SQLExcepiton : " + IDataBase.tablo_ismi);
        }
        return null;
    }

    @Override
    public ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery("Select * From " + IDataBase.tablo_ismi);
            while(rs.next()) {
                int id = rs.getInt(IDataBase.column_id);
                String userName = rs.getString(IDataBase.column_userName);
                String psw = rs.getString(IDataBase.column_psw);
                int sum = rs.getInt(IDataBase.column_sum);
                String yetki = rs.getString(IDataBase.column_yetki);

                User user = new User(userName, psw);
                user.setYetki(yetki);
                user.setSum(sum);
                users.add(user);
            }
        } catch (SQLException e) {
            System.out.println("DataBaseMySQL-getUser()-SQLExcepiton : " + IDataBase.tablo_ismi);
        }
        return users;
    }

    @Override
    public boolean changeUserName(User user, String userName) {
        if(userCheck(user) && !userCheck(new User(userName, ""))) {
            try {
                statement = con.createStatement();
                statement.executeUpdate("Update " + tablo_ismi + " SET " + column_userName + " = '" + userName +
                        "' where " + column_id + " = " + getId(user));
                user.setUserName(userName);
            } catch (SQLException e) {
                System.out.println("DataBaseMySQL-changeUserName()-SQLExcepiton : " + IDataBase.tablo_ismi);
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean changePsw(User user, String psw) {
        if(userCheck(user)) {
            try {
                statement = con.createStatement();
                statement.executeUpdate("Update " + tablo_ismi + " SET " + column_psw + " = '" + psw +
                        "' where " + column_id + " = " + getId(user));
                user.setPsw(psw);
            } catch (SQLException e) {
                System.out.println("DataBaseMySQL-changePsw()-SQLExcepiton : " + IDataBase.tablo_ismi);
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public int getMoney(User user) {
        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery("Select * From " + IDataBase.tablo_ismi);
            while(rs.next()) {
                String userName = rs.getString(IDataBase.column_userName);
                int sum = rs.getInt(IDataBase.column_sum);
                if(user.getUserName().equals(userName))
                    return sum;
            }
        } catch (SQLException e) {
            System.out.println("DataBaseMySQL-getMoney()-SQLExcepiton : " + IDataBase.tablo_ismi);
        }
        return -1;
    }

    @Override
    public boolean withdrawMoney(User user, int sum) {
        if(userCheck(user)) {
            if(sum > getMoney(user)){
                return false;
            }
            try {
                statement = con.createStatement();
                statement.executeUpdate("Update " + tablo_ismi + " SET " + column_sum + " = '" + (getMoney(user)-sum) +
                        "' where " + column_id + " = " + getId(user));
            } catch (SQLException e) {
                System.out.println("DataBaseMySQL-withdrawMoney()-SQLExcepiton : " + IDataBase.tablo_ismi);
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean depositMoney(User user, int sum) {
        if(userCheck(user)) {
            try {
                statement = con.createStatement();
                statement.executeUpdate("Update " + tablo_ismi + " SET " + column_sum + " = '" + (sum+getMoney(user)) +
                        "' where " + column_id + " = " + getId(user));
            } catch (SQLException e) {
                System.out.println("DataBaseMySQL-depositMoney()-SQLExcepiton : " + IDataBase.tablo_ismi);
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean moneyTransfer(User transmitter, User receiver, int sum) {
        if(withdrawMoney(transmitter, sum)){
            if(depositMoney(receiver, sum)){
                return true;
            }else{
                if(depositMoney(transmitter, sum)){
                    System.out.println("Para iade edildi işlem başarısız..");
                    return false;
                }
                else{
                    System.out.println("Para çekildi ama iade edilemedi.. İşlem başarısız..");
                    return false;
                }
            }
        }
        return false;
    }
}
