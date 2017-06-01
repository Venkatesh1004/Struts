<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<html:form action = "/time.do" method ="post">
<html:errors/>
<br>
username: <html:text property="username"> </html:text> <br> 
password: <html:password property="password"> </html:password><br>


Confirmpassword: <html:password property="confirmpassword"></html:password><br>


<%-- Gender:<html:radio property="sex" value="Male">Male</html:radio>
<html:radio property="sex" value="Female">Female</html:radio>
<html:radio property="sex" value="Other">Other</html:radio>
 --%>
  

<br>
<html:submit value = "Login to maven app"/>





</html:form>

</body>
</html>