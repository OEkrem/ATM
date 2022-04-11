package com.OEkrem;

import java.util.ArrayList;

public interface IDataBaseUserProcess extends IDataBase{
    /**
     * Kullanıcının veritabanında kaydının olup olmadığını bize söyler.
     * @param User
     * @return
     */
    public boolean userCheck(User User);

    /**
     * Veritabanına bir User ekler.
     * @param user
     * @return
     */
    public boolean addUser(User user);

    /**
     * Veritabanından bir user siler.
     * @param user
     * @return
     */
    public boolean removeUser(User user);

    /**
     * Girilen bilgilere göre id numarası döner.
     * Böyle bir kullanıcı yok ise <strong>-1</strong> döner.
     * @param user
     * @return
     */
    public int getId(User user);

    /**
     * Id numarasına göre kullanıcı bilgilerini alır.
     * Böyle bir kullanıcı yok ise <strong>null<strong/> döner;
     * @param id
     * @return
     */
    public User getUser(int id);

    /**
     *
     * @param userName
     * @return
     */
    public User getUser(String userName);

    /**
     * Tüm kullanıcıları bir leste halinde döner..
     * @return
     */
    public ArrayList<User> getUsers();

    /**
     * Kullanıcı adı değiştirmek için..
     * @param user
     * @param userName
     * @return
     */
    public boolean changeUserName(User user, String userName);

    /**
     * Kullanıcının sifresini değiştirmek için..
     * @param user
     * @param psw
     * @return
     */
    public boolean changePsw(User user, String psw);
}
