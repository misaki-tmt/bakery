package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    //DB接続と結果取得のための変数
    private static Connection con;

    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        //1.ドライバのクラスをjava上で読み込む
        Class.forName("com.mysql.jdbc.Driver");
        //2.DBと接続
        con = DriverManager.getConnection(
                "jdbc:mysql://localhost/bakery?useSSL=false",
                "repuser",
                "reppass"
            );
        return con;
    }

    public static void close(){
        //7.接続を閉じる
        if(con != null){
            try{
                con.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }

}
