<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body style="background-color:red">
<div class="container">
<h1>my form</h1>
<form action="RegisterServlet" method="post">
<table>
<tr>
<td>please enter your name</td>
<td><input type="text" name="user_name" placeholder="enter name"></td>
</tr>
<tr>
<td>please enter you password</td>
<td><input type="password" name="user_password" placeholder="enter password"></td>
</tr>
<tr>   
<td> please enter your email</td>
<td><input type="text" name="email" placeholder="enter email"></td>

</tr>
<tr>
<td>select gender</td>
<td><input type="radio"  name="user_gender" value="male">Male</td>
</tr>
<tr>
<td>select gender</td>
<td><input type="radio" name="user_gender" value="female">Female</td>
</tr>
<tr>
<td>condition</td>
<td><input type="checkbox" name="user_gender" value="female">Female</td>
</tr>
<tr>
<td style="text-align:center">
<td><input type="radio" name="condition" value="checked"></td>
<td>agree term and condition</td>
</td>
</tr>
<tr>
<td>select course</td>
<td>
<select name="user_couser">
<option value="java">java</option>
<option value="python">python</option>
<option value="C++">C++</option>
<option value="HTML">HTML</option>
</select>

</td>
</tr>


</table>
<button type="submit" value="submit">submit</button>
<button type="reset">reset</button>

</form>


</div>
<h1><a href="web">first servlet</a></h1>
<h1><a href="webapp">second servlet</a></h1>
<h1><a href="RegisterServlet">third servlet</a></h1>
<h1><a href="success">sussess</a></h1>

</body>
</html>