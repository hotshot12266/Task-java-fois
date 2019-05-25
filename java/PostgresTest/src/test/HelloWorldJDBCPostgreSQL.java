package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloWorldJDBCPostgreSQL {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// ドライバクラスをロード
			Class.forName("org.postgresql.Driver");

			// データベースへ接続
			con = DriverManager.getConnection("jdbc:postgresql:testuser",
					"postgres", "1234");

			// ステートメントオブジェクトを生成
			stmt = con.createStatement();
			String sql = "SELECT * FROM tbltest";

			// クエリーを実行して結果セットを取得
			rs = stmt.executeQuery(sql);

			// 検索された行数分ループ
			while (rs.next()) {
				// NOを取得
				int no = rs.getInt("no");
				// 言語を取得
				String lang = rs.getString("language");
				// メッセージを取得
				String msg = rs.getString("message");
				// 表示
				System.out.println(no + " " + lang + " " + msg);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			/* データベースから切断する処理 */
			try {
				if (con != null) {
					con.close();
					con = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
				if (rs != null) {
					rs.close();
					rs = null;
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
}

