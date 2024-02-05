<html>

<head>
    <title> Dynamic Jsp</title>
</head>
<%@ page import ="java.util.Date"%>
<body>
    <h3> ${username}</h3><br>

    <form action ="addStudent">
        Name:<input type ="text" name="studentName"><br>
        RollNo:<input type ="text" name="rollNo"><br>
        <input type ="submit">
    </form>
    <h1> View User</h1>
    
    <form action ="viewStudent">   
        RollNo:<input type ="text" name="rollNo"><br>
        <input type ="submit">
    </form>
    <h1>Delete</h1>
    <form action ="deleteStudent">   
        RollNo:<input type ="text" name="rollNo"><br>
        <input type ="submit">
    </form>
    <h1>Update</h1>
    <form action ="updateStudent">   
        RollNo:<input type ="text" name="rollNo"><br>
        <input type ="submit">
    </form>
     <strong>current time is </strong>:<%=new Date ()%>
</body>
</html>