package section9_2;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DBAccess
 */
@WebServlet("/da")
public class DBAccess extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DBAccess() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 文字化け対策
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		// HTML 出力準備
		PrintWriter out = response.getWriter();

		// データベース接続に必要な情報
		final String DSN = "jdbc:mysql://localhost:3306/sns?useSSL=false";
		final String USER = "root";
		final String PASSWORD = "root";

		// データベース接続情報管理
		Connection conn = null;

		// SQL 情報管理
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		PreparedStatement pstmt3 = null;

		// SELECT 文の実行結果管理
		ResultSet rset1 = null;
		ResultSet rset2 = null;

		out.println("<html lang='ja'>");
		out.println("<head>");
		out.println("<title>データベースの連携</title>");
		out.println("</head>");
		out.println("<body>");

		try {
			// JDBC ドライバのロード
            Class.forName("com.mysql.jdbc.Driver");

            // データベース接続
            conn = DriverManager.getConnection(DSN, USER, PASSWORD);

            // SQL 文(検索)の作成と実行
            String sql = "SELECT * FROM users WHERE userId=?";
            pstmt1 = conn.prepareStatement(sql);
            pstmt1.setInt(1, 1);

            rset1 = pstmt1.executeQuery();

            out.println("<p>１件検索</p>");
            out.println("<pre>");
            // 検索結果があるか
			if (rset1.next()) {
				out.print(rset1.getString(2) + ":");
				out.print(rset1.getString(3) + ":");
				out.print(rset1.getString(4) + ":");
				out.print(rset1.getString(5) + ":");
				out.println(rset1.getString(6));
			}
            out.println("</pre>");
            out.println("<hr>");

            // SQL 文(挿入)の作成と実行
            sql = "INSERT INTO users(loginId,password,userName,icon,profile) VALUES(?,?,?,?,?)";
            pstmt2 = conn.prepareStatement(sql);
            pstmt2.setString(1, "tanaka");
            pstmt2.setString(2, "pass4");
            pstmt2.setString(3, "田中　純次");
            pstmt2.setString(4, "icon-user");
            pstmt2.setString(5, "こんにちは");

            pstmt2.executeUpdate();

            // SQL 文(検索)の作成と実行
            sql = "SELECT * FROM users";
            pstmt3 = conn.prepareStatement(sql);

            rset2 = pstmt3.executeQuery();

            out.println("<p>全件検索</p>");
            out.println("<pre>");

            // 問合せ結果の行数分繰り返し
			while(rset2.next()) {
				out.print(rset2.getString(2) + ":");
				out.print(rset2.getString(3) + ":");
				out.print(rset2.getString(4) + ":");
				out.print(rset2.getString(5) + ":");
				out.println(rset2.getString(6));
			}
            out.println("</pre>");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e)	{
			e.printStackTrace();
		} finally {
			try {
				rset1.close();
			} catch (SQLException e) {	}

			try {
				rset2.close();
			} catch (SQLException e) {	}

			try {
				pstmt1.close();
			} catch (SQLException e) {	}

			try {
				pstmt2.close();
			} catch (SQLException e) {	}

			try {
				pstmt3.close();
			} catch (SQLException e) {	}

			try {
				conn.close();
			} catch (SQLException e) {	}
		}

        out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
