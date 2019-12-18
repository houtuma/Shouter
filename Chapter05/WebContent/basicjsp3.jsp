<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Date,java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSPの基本</title>
</head>
<body>
<h3>ディレクティブ</h3>
<%!
	// 変数宣言
	Date date = new Date();
	// 文字列型データのリスト
	ArrayList<String> list = new ArrayList<>();
%>
<p>データの出力</p>
<%= date %><br>
<%
	// 文字列をリストに追加
	list.add("株式会社");
	list.add("技術");
	list.add("評論社");

	// リストのすべての要素にアクセス
	for(String s : list){
%>
<%= s %><br>
<%
	}
%>
<hr>
<%-- ファイルの取り込み --%>
<%@ include file="message.html" %>
</body>
</html>
