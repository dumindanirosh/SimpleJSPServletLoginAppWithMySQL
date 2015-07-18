<%-- 
    Document   : index
    Created on : Jul 18, 2015, 10:46:12 AM
    Author     : Esoft
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form action="login"  method="post">
        <table border="1">
            <thead>
                <tr>
                    <th>Login Page</th>        
                </tr>
            </thead>
            <tbody>
            
                <tr>
                    <td>User Name</td>
                    <td><input type="text" name="username"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="passwordfield"></td>
                </tr>
                 
                <tr>
                    <td></td>
                    <td> <button type="submit">Login</button></td>
                </tr>
                
            </tbody>
        </table>
     </form>
    </body>
</html>
