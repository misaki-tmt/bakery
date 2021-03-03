package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.Bakery;

public class DBDAOShow {
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
            String show = "select * from bakerys where id = ?";
            pstmt = con.prepareStatement(show);
            pstmt.setInt(1, sql);

            // 4, 5. Select文の実行と結果を格納／代入

            rs = pstmt.executeQuery();
            rs.next();
            // 6. 結果をlistに入れる
                bakery.setId(rs.getInt("id"));
                bakery.setName(rs.getString("name"));
                bakery.setAddress(rs.getString("address"));
                bakery.setTime(rs.getString("time"));
                bakery.setHoliday(rs.getString("holiday"));
                bakery.setTel(rs.getString("tel"));
                bakery.setHpadd(rs.getString("hpadd"));
                bakery.setMap(rs.getString("map"));
                bakery.setMemo(rs.getString("memo"));
                bakery.setCreated_at(rs.getTimestamp("created_at"));
                bakery.setUpdated_at(rs.getTimestamp("updated_at"));

                // リストに追加


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
