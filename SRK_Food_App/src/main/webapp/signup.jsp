<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Register Page</title>
    <style>
        @charset "ISO-8859-1";
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            background-image: url(images/bgimg.jpg);
            background-size: cover;
            background-position: center;
            margin: 0;
            padding: 0;
        }

        h1 {
            margin-bottom: 2%;
            text-align: center;
            color: #0f2df2;
            font-family: Cursive;
        }

        h3 {
            font-family: Didot;
            color: rgb(3, 3, 3);
        }

        h2 {
            text-align: center;
            color: #ff0000;
            font-family: Cursive;
            padding-top: 10px;
        }

        form {
            width: 50%;
            margin: 0 auto;
            background-color: rgba(0, 255, 255, 0.5);
            padding: 20px;
            border-radius: 8px;
            box-shadow: 1px 0 10px rgba(0, 0, 0, 1.5);
            z-index: 30;
            margin-bottom: 50px;
        }

        table {
            width: 100%;
        }

        td {
            padding: 10px;
        }

        label {
            font-weight: bold;
        }

        input[type="tel"],
        input[type="text"],
        input[type="email"],
        input[type="password"] {
            width: 100%;
            padding: 8px;
            margin: 5px 0;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        input[type="submit"] {
            width: 100%;
            background-color: #e00db3;
            color: white;
            padding: 10px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #1518de;
        }

        .quote {
            text-align: center;
            font-size: 18px;
            color: #fff;
            margin-top: -20px;
            margin-bottom: 40px;
        }
    </style>
</head>
<body>
    <h1>Welcome to SRK Food Delivery App</h1>
    <div class="quote">
        <h3>"Good food is the foundation of genuine happiness.<br>Join us today! and enjoy the taste of paradise"</h3>
    </div>
    <h2>Register Below &#128150</h2>
    <form action="register">
        <table>
            <tr>
                <td><label for="username">User Name:</label></td>
                <td><input type="text" id="username" name="username" placeholder="Enter your name" required></td>
            </tr>
            <tr>
                <td><label for="password">Password:</label></td>
                <td><input type="password" id="password" name="password" placeholder="Enter your password" minlength="3" required></td>
            </tr>
            <tr>
                <td><label for="email">Email:</label></td>
                <td><input type="email" id="email" name="email" placeholder="Enter valid email" pattern="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}" required></td>
            </tr>
            <tr>
                <td><label for="phoneNumber">Phone Number:</label></td>
                <td><input type="tel" id="phoneNumber" name="phoneNumber" placeholder="Enter your phone number" required></td>
            </tr>
            <tr>
                <td><label for="address">Address:</label></td>
                <td><input type="text" id="address" name="address" placeholder="Enter your address" required></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Register"></td>
            </tr>
        </table>
        
    </form>
</body>
</html>
