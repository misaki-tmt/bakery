package models;

public class Bakerys {

    //フィールド
    private int id;                   //id ID
    private String name;              //name 名前
    private String address;           // address 住所
    //営業時間どうしよう。
    private String holiday;           //holiday 定休日
    private int tel;                  //tel 電話番号
    private String hpadd;             //hpadd HPアドレス
    private String map;               //map GoogleMap
    private String memo;              //memo メモ

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
    public int getTel() {
        return tel;
    }
    public void setTel(int tel) {
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

}
