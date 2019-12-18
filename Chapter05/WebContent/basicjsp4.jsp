<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Date,java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSPの基本</title>
</head>
<body>
<h3>暗黙オブジェクト</h3>
<%
	// 文字化け対策
	request.setCharacterEncoding("UTF-8");

	// 送信データの取得
	String userName = request.getParameter("userName");
	String pass = request.getParameter("pass");
	String gender = request.getParameter("gender");
	// チェックボックスは配列で取得
	String[] hobby = request.getParameterValues("hobby");
	String blood = request.getParameter("blood");
	String remarks = request.getParameter("remarks");

	// 値の出力
	out.println("氏名 : " + userName + "<br>");
	out.println("パスワード : " + pass + "<br>");
	out.println("性別 : " + gender + "<br>");
	out.println("血液型 : " + blood + "<br>");
	out.println("備考 : " + remarks + "<br>");
	out.println("趣味 : ");

	// 配列のすべての要素にアクセス
	if(hobby != null){
		for(String s : hobby){
%>
	<%= s %> :
<%
		}
	}
%>
</body>
</html>
