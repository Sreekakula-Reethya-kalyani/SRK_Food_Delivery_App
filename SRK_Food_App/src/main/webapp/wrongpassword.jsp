<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Failed</title>
<style>
    body, html {
        height: 100%;
        margin: 0;
        font-family: Arial, sans-serif;
    }

    .container {
        display: flex;
        height: 100%;
        width: 100%;
    }

    .left, .right {
        width: 50%;
    }

    .left {
        display: flex;
        align-items: center;
        justify-content: center;
        background-color: #f8f9fa;
    }

    .left img {
        width: 100%;
        height: 100%;
        object-fit: cover;
    }

    .right {
        display: flex;
        align-items: center;
        justify-content: center;
        background-color: #ffffff;
    }

    .form-container {
        text-align: center;
        background: linear-gradient(to right, #6a11cb, #2575fc);
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.8);
        margin-right: 10%;
    }


    .form-container h2 {
        color: #ffffff;
        
    }

    .form-container input[type="submit"] {
        padding: 10px 20px;
        font-size: 1em;
        background-color: #28e2dc;
        color: rgb(11, 11, 11);
        border: none;
        cursor: pointer;
        border-radius: 5px;
        font-weight: bolder;
    }

    .form-container input[type="submit"]:hover {
        background-color: rgb(230, 23, 189);
    }
</style>
</head>
<body>
    <div class="container">
        <div class="left">
            <img src="images/bgf.jpg" alt="Failure Image">
        </div>
        <div class="right">
            <div class="form-container">
                <h2>You have entered the Wrong Password or Email Look into it and Register again..! </h2>
                <form action="signup.jsp">
                    <input type="submit" value="Go Back to Register Page">
                </form>
            </div>
        </div>
    </div>
</body>
</html>
    