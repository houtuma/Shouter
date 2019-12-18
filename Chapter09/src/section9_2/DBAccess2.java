package section9_2;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DBAccess
 */
@WebServlet("/da2")
public class DBAccess2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DBAccess2() {
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

		// HTML 出力
		out.println("<html lang='ja'>");
		out.println("<head>");
		out.println("<title>データベースの連携</title>");
		out.println("</head>");
		out.println("<body>");

		// データベース接続管理クラスの変数宣言
		DBManager dbm = new DBManager();

		// ログインユーザ情報取得
		UserDTO user = dbm.getLoginUser("suzuki", "pass2");

		if(user != null){
			out.print("ログインユーザ：" + user.getUserName());
		}else{
			out.print("ユーザ名かパスワードが間違っています");
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
