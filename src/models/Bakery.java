package models;

import java.sql.Timestamp;

public class Bakery {

    //フィールド
    private int id;                   //id ID
    private String name;              //name 名前
    private String address;           //address 住所
    private String time;              //time 営業時間
    private String holiday;           //holiday 定休日
    private String tel;               //tel 電話番号
    private String hpadd;             //hpadd HPアドレス
    private String map;               //map GoogleMap
    private String memo;              //memo メモ
    private Timestamp created_at;     //created_at 作成日時
    private Timestamp updated_at;     //updated_at 更新日時

    //getter,setter

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getHoliday() {
        return holiday;
    }
    public void setHoliday(String holiday) {
        this.holiday = holiday;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getHpadd() {
        return hpadd;
    }
    public void setHpadd(String hpadd) {
        this.hpadd = hpadd;
    }
    public String getMap() {
        return map;
    }
    public void setMap(String map) {
        this.map = map;
    }
    public String getMemo() {
        return memo;
    }
    public void setMemo(String memo) {
        this.memo = memo;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public Timestamp getCreated_at() {
        return created_at;
    }
    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }
    public Timestamp getUpdated_at() {
        return updated_at;
    }
    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

}
