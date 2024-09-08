<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Confirmation</title>
<style>
    body {
        font-family: 'Helvetica Neue', Arial, sans-serif;
        background-color: #e9ecef;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .confirmation-box {
        background-color: #ffffff;
        padding: 40px;
        border-radius: 15px;
        box-shadow: 0 8px 20px rgba(0, 0, 0, 0.1);
        text-align: center;
    }

    h2 {
        color: #28a745;
        font-size: 28px;
        margin-bottom: 20px;
        font-weight: bold;
    }

    .home-link {
        font-size: 18px;
        text-decoration: none;
        color: #007bff;
        background-color: #ffffff;
        border: 2px solid #007bff;
        padding: 10px 20px;
        border-radius: 5px;
        transition: background-color 0.3s, color 0.3s;
        display: inline-block;
        margin-top: 20px;
    }

    .home-link:hover {
        background-color: #007bff;
        color: #ffffff;
    }
</style>
</head>
<body>
    <div class="confirmation-box">
        <h2>Your Order is Confirmed!</h2>
        <a class="home-link" href="home.jsp">Go to HomePage</a>
    </div>
</body>
</html>
