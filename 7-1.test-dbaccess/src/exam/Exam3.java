package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam3 {
    public static void main(String[] args) {
        // 接続情報
        String url = "jdbc:postgresql://localhost:5432/student";
        String user = "postgres";
        String password = "FF74$2ca";

        Connection con = null; // 使用する変数の宣言
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = null;

        try {
            // (1)データベースに接続
            con = DriverManager.getConnection(url, user, password);

            // (2)SQL文を作成
            // ONは二つのテーブルの結合部にあたるカラムを指定する
            // 二つの絡むの値が同じレコード同士が結合される
            // 結合後のカラムは、別名を付けてgetXxx()メソッドで別名を指定できるようにする
            sql = "SELECT tm.id, tm.name, tm.age, td.name AS dep_name FROM test_members AS tm INNER JOIN test_deps AS td ON tm.dep_id = td.id;";

            // (3)SQL実行準備
            pstmt = con.prepareStatement(sql);

            // (4)SQL実行
            // ※ここにSQL実行処理を書く
            rs = pstmt.executeQuery();

            // (5)結果の操作
            // ※ここに結果の操作処理を書く
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String dep_name = rs.getString("dep_name");
                System.out.print("id=" + id); // tm.id = test_members.id
                System.out.print(", name=" + name); // tm.name = test_members.name
                System.out.print(", age=" + age); // tm.age = test_members.age
                System.out.print(", dep_name=" + dep_name); // td.name = test_deps.name
                System.out.println();
            }
        } catch (SQLException ex) {
            System.err.println("SQL = " + sql);
            ex.printStackTrace();
        } finally {
            try {
                // (6) メモリの解放(切断)
                if (con != null) {
                    con.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
