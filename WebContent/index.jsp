<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>

</head>
<body>
<form action="${pageContext.request.contextPath}/userAction_add" method="post">
    用户名：<input type="text" name="username"/><br>
    密&nbsp&nbsp&nbsp码：<input type="password" name="password"/><br/>
    <input type="submit" value="添加"/>
</form>
<%--<table>--%>
    <%--<tr>--%>
        <%--<td>--%>
            <%--用户名：--%>
        <%--</td>--%>
        <%--<td>--%>
            <%--<input type="text" name="username">--%>
        <%--</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>--%>
            <%--密码：--%>
        <%--</td>--%>
        <%--<td>--%>
            <%--<input type="text" name="password">--%>
        <%--</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td colspan="1">--%>
            <%--&lt;%&ndash; <%	String name=request.getParameter("name");--%>
                <%--String age=request.getParameter("age"); %>--%>
             <%--<a href="http://219.216.81.181:8080/ssh_crudTest/user/add?name=<%=name%>&age=<%=age%>">添加</a> </td>  &ndash;%&gt;--%>

            <%--<input type="submit" value="添加">--%>
    <%--</tr>--%>
<%--</table>--%>
<%--</form>--%>

<!--   <script type="text/javascript">
   function add(){
        var name = document.getElementById("username").value;
        var age = document.getElementById("password").value;

   }


 </script> -->
</body>
</html>