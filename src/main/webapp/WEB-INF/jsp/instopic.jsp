<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Topic</title>
</head>
<body>

	<h2>Insert Topic</h2>
	<form method="post">
		<pre>
			ID : <input type="text" name="id"><br><br>
			Name: <input type="text" name="name"><br><br>
			<input type="submit" value="Submit">
		</pre>
	</form>
	<p>${success}</p>
	
</body>
</html>