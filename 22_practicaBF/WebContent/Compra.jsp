<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="Registrar" scope="session" class="com.basico.Productos">
	<jsp:setProperty name="Registrar" property="mail"  />
	<jsp:setProperty name="Registrar" property="prod"  />
		<jsp:setProperty name="Registrar" property="uni"  />
	
</jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:getProperty property="mail" name="Registrar" />
<jsp:getProperty property="prod" name="Registrar" />
<jsp:getProperty property="uni" name="Registrar" />
	
</body>
</html>