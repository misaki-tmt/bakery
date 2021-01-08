package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import models.Bakery;

public class DBDAO {
    // データベース接続と結果取得のための変数
    static PreparedStatement pstmt;
    static ResultSet rs;

    public static List<Bakery> getBakery(String s) {
        // メソッドの結果として返すリスト
        List<Bakery> results = new ArrayList<Bakery>();

        try {
            // 1,2. ドライバを読み込み、DBに接続
            Connection con = DBUtil.getConnection();

            // 3. DBとやりとりする窓口（Statementオブジェクト）の作成
            String sql = s;
            pstmt = con.prepareStatement(sql);

            // 4, 5. Select文の実行と結果を格納／代入
            rs = pstmt.executeQuery();

            // 6. 結果を表示する
            while (rs.next()) {
                // 1件ずつオブジェクトを生成して結果を詰める
                Bakery bakery = new Bakery();
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

                System.out.println(bakery.getId());
                System.out.println(bakery.getName());
                System.out.println(bakery.getAddress());
                System.out.println(bakery.getTime());
                System.out.println(bakery.getHoliday());
                System.out.println(bakery.getTel());
                System.out.println(bakery.getHpadd());


                // リストに追加
                results.add(bakery);
            }
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
        return results;
    }
}