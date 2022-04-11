package com.OEkrem;

public interface IDataBase {

    /**
     * Entity Information of Database connection
     */
    public static final String kullanici_Adi = "root";
    public static final String sifre = "";
    public static final String db_ismi = "veri";
    public static final String host = "localhost";
    public static final int port = 3306;

    /**
     * Tablo bilgileri
     */
    public static final String tablo_ismi = "toplum";
    public static final String column_id = "ID";
    public static final String column_userName = "Kullanici_Adi";
    public static final String column_psw = "Sifre";
    public static final String column_sum = "Para";
    public static final String column_yetki = "Yetki";


    /**
     * Veritabanı ile bağlantı kurmak için.
     * @return
     */
    public boolean connect();

    public static String getConnectUrl(){
        return "jdbc:mysql://" + host + ":" + port + "/" + db_ismi + "?useUnicode=true&characterEncoding=utf8";
    }
}
