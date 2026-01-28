package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exam1 {
    public static void main(String[] args) {
        // 接続情報
        String url = "jdbc:postgresql://localhost:5432/student";
        String user = "postgres";
        String password = "FF74$2ca";

        Connection con = null; // 使用する変数の宣言
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        PreparedStatement pstmt3 = null;
        String sql1 = null;
        String sql2 = null;
        String sql3 = null;

        try {
            // (1)データベースに接続
            con = DriverManager.getConnection(url, user, password);

            // (2)SQL文を作成
            sql1 = "INSERT INTO test_members(name, age, dep_id) VALUES('山田太郎', 62, 1);";
            sql2 = "INSERT INTO test_members(name, age, dep_id) VALUES('佐藤花子', 33, 2);";
            sql3 = "INSERT INTO test_members(name, age, dep_id) VALUES('遠藤次郎', 55, 2);";

            // (3)SQL実行準備
            pstmt1 = con.prepareStatement(sql1);
            pstmt2 = con.prepareStatement(sql2);
            pstmt3 = con.prepareStatement(sql3);

            // (4)SQL実行
            // ※ここにSQL実行処理を書く
            int num1 = pstmt1.executeUpdate();
            int num2 = pstmt2.executeUpdate();
            int num3 = pstmt3.executeUpdate();
            int totalOfUpdate = num1 + num2 + num3;

            // (5)結果の操作
            // ※ここに結果の操作処理を書く
            System.out.println(totalOfUpdate + "件の更新");
        } catch (SQLException ex) {
            System.err.println("SQL = " + sql1);
            System.err.println("SQL = " + sql2);
            System.err.println("SQL = " + sql3);
            ex.printStackTrace();
        } finally {
            try {
                // (6) メモリの解放(切断)
                if (con != null) {
                    con.close();
                }
                if (pstmt1 != null) {
                    pstmt1.close();
                }
                if (pstmt2 != null) {
                    pstmt2.close();
                }
                if (pstmt3 != null) {
                    pstmt3.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
