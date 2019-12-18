package section8_1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletSession2
 */
@WebServlet("/ss2")
public class ServletSession2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSession2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 文字化け対策
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		// 送信情報の取得
		String userName = request.getParameter("userName");
		String sessionCheck = request.getParameter("sessionCheck");

		// セッションオブジェクトの取得
		HttpSession session = request.getSession();

		if("save".equals(sessionCheck)){
			// セッションに値を保存
			session.setAttribute("username", userName);
		}else{
			session.setAttribute("username", "");
		}

		// HTML 出力準備
		PrintWriter out = response.getWriter();

		out.println("<html lang='ja'>");
		out.println("<head>");
		out.println("<title>セッションの利用</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>セッションを設定しました</h3>");
		out.println("<a href='ss1'>元のページに戻る</a>");
		out.println("</body>");
		out.println("</html>");
	}
}
