<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화 정보 수정</title>
</head>
<body>
	<h1>영화 정보 수정</h1>
	<form action="/MovieProject/movieupdate.do" method="post">
		<input type="hidden" value="" name="mtitle"/>
		<input type="hidden" value="" name="mgrade"/>
		<input type="hidden" value="" name="mcountry"/>
		<input type="hidden" value="" name="mdirector"/>
		<input type="hidden" value="" name="mactor"/>
		<input type="hidden" value="" name="mplot"/>
		<table border="1">
			<tr>
				<th>영화 제목</th>
				<td><input type="text" name="movietitle" value=""/><br/></td>
			</tr>
			<tr>
				<th>영화 등급</th>
				<td><input type="text" name="moviegrade" value=""/><br/></td>
			</tr>
			<tr>
				<th>영화 제작 국가</th>
				<td><input type="text" name="moviecountry" value=""/><br/></td>
			</tr>
			<tr>
				<th>영화 감독</th>
				<td><input type="text" name="moviedirector" value=""/><br/></td>
			</tr>
			<tr>
				<th>출연진</th>
				<td><input type="text" name="movieactor" value=""/><br/></td>
			</tr>
			<tr>
				<th>영화 줄거리</th>
				<td><textarea rows="10" cols="50" name="plot">value</textarea><br/></td>
			</tr>
			<tr>
				<td><input type="submit" value="올리기"></td>
				<td><input type="reset" value="초기화"></td>
			</tr>
		</table>
	</form>
	<form action="/MovieProject/movieselect.do" method="post">
		<input type="hidden">
		<input type="submit" value="돌아가기">
	</form>
</body>
</html>