package com.OEkrem;

public interface IDataBaseMoneyProcess extends IDataBase{

    /**
     * Kullanıcının o anki bakiyesini gösterir.
     * Böyle bir kullanıcı yok ise -1 döner.
     * @param user
     * @return
     */
    public int getMoney(User user);

    /**
     * Para çekme işlemi
     * @param user
     * @param sum
     * @return
     */
    public boolean withdrawMoney(User user, int sum);

    /**
     * Para yatırma işlemi
     * @param user
     * @param sum
     * @return
     */
    public boolean depositMoney(User user, int sum);

    /**
     * Para transfer işlemi
     * @param transmitter
     * @param receiver
     * @param sum
     * @return
     */
    public boolean moneyTransfer(User transmitter, User receiver, int sum);
}
