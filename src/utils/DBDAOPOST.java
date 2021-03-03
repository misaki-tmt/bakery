package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.Bakery;

public class DBDAOPOST {
    // データベース接続と結果取得のための変数
    static PreparedStatement pstmt;
    static ResultSet rs;

    public static void getBakery(String s, Bakery pan) {

        try {
            // 1,2. ドライバを読み込み、DBに接続
            Connection con = DBUtil.getConnection();

            // 3. DBとやりとりする窓口（Statementオブジェクト）の作成
            String sql = s;
            pstmt = con.prepareStatement(sql);

            pstmt.setString(1, pan.getName());
            pstmt.setString(2, pan.getAddress());
            pstmt.setString(3, pan.getTime());
            pstmt.setString(4, pan.getHoliday());
            pstmt.setString(5, pan.getTel());
            pstmt.setString(6, pan.getHpadd());
            pstmt.setString(7, pan.getMap());
            pstmt.setString(8, pan.getMemo());

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

    }
}