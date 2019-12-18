<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSPの基本</title>
</head>
<body>
	<h3>JSPの基本的なタグ</h3>
	<%-- JSPのコメント --%>
	<%!
		// 変数宣言
		String message = "Hello JSP World!!";
	%>
	<p>データの出力</p>
	<%= message %><br>
</body>
</html>
