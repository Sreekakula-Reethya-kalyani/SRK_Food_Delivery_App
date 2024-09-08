<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="loginstyle.css">
</head>
<body>
    <div class="container">
        <div class="left">
            <img src="images/loginbgNew.jpg" alt="Failure Image">
        </div>
        <div class="right">
            <div class="form-container">
                <h1>Welcome to SRK's Login Page</h1>
                <p class="quote">"Welcome back! Ready to explore more delicious delights &#128523 "</p>
                <form action="login" method="post">
                    <label for="email">Email:</label>
                    <input type="email" placeholder="E-Mail address"  name="email" required>
                    <label for="password">Password:</label>
                    <input type="password" placeholder="Password" name="password" minlength="3" maxlength="16" title="Enter Your Password" required>
                    
                    <button type="submit">Login</button>
                </form>
                <div class="link">
                    <span>Don't have an account? </span><a class="Register" href="signup.jsp">Register here!</a>
                </div>
            </div>
        </div>
    </div>
</body>
</html>

    