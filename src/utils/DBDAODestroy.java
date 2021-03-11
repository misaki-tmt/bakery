package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.Bakery;

public class DBDAODestroy {
    // データベース接続と結果取得のための変数
    static PreparedStatement pstmt;
    static ResultSet rs;

    public static Bakery getBakery(int s) {
        // メソッドの結果として返す変数
        Bakery bakery = new Bakery();

        try {
            // 1,2. ドライバを読み込み、DBに接続
            Connection con = DBUtil.getConnection();

            // 3. DBとやりとりする窓口（Statementオブジェクト）の作成
            int sql = s;
            String show = "delete from bakerys where id = ?";
            pstmt = con.prepareStatement(show);
            pstmt.setInt(1, sql);

            // 4, 5. Select文の実行と結果を格納／代入

            pstmt.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            if( rs != null ){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if( pstmt != null ){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            DBUtil.close();
        }
        return bakery;
    }
}
