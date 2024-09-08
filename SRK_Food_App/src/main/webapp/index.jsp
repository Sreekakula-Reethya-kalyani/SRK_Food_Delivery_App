<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to Your Food Delivery App</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <table>
            <tr>
                <img src="images/DreamLoogo.png" alt="restuarant logo">
            </tr>
            <tr>
            <h1>"Hello, food lovers! Ready to discover countless restaurants? Dive into deliciousness and order now with SRK Food Delivery App!"</h1>
            </tr>
        </table>
        
        <p>Are you a registered user?</p>
        <button id="registeredButton">Yes</button>
        <button id="notRegisteredButton">No</button>

        <div id="registeredOptions" style="display: none;">
            <p>If you are registered, please log in:</p>
            <a href="login.jsp">Login</a>
        </div>

        <div id="notRegisteredOptions" style="display: none;">
            <p>If you aren't registered, please register:</p>
            <a href="signup.jsp">Register</a>
        </div>
    </div>

    <script>
        document.getElementById('registeredButton').onclick = function() {
            document.getElementById('registeredOptions').style.display = 'block';
            document.getElementById('notRegisteredOptions').style.display = 'none';
        };
        document.getElementById('notRegisteredButton').onclick = function() {
            document.getElementById('notRegisteredOptions').style.display = 'block';
            document.getElementById('registeredOptions').style.display = 'none';
        };
    </script>
</body>
<style>
    body {
    font-family:cursive;
    background-color: #f8f9fa;
    background-image: linear-gradient(135deg, rgba(244, 244, 244,0.07) 0%, rgba(244, 244, 244,0.07) 12.5%,rgba(211, 211, 211,0.07) 12.5%, rgba(211, 211, 211,0.07) 25%,rgba(178, 178, 178,0.07) 25%, rgba(178, 178, 178,0.07) 37.5%,rgba(145, 145, 145,0.07) 37.5%, rgba(145, 145, 145,0.07) 50%,rgba(113, 113, 113,0.07) 50%, rgba(113, 113, 113,0.07) 62.5%,rgba(80, 80, 80,0.07) 62.5%, rgba(80, 80, 80,0.07) 75%,rgba(47, 47, 47,0.07) 75%, rgba(47, 47, 47,0.07) 87.5%,rgba(14, 14, 14,0.07) 87.5%, rgba(14, 14, 14,0.07) 100%),linear-gradient(45deg, rgba(236, 236, 236,0.07) 0%, rgba(236, 236, 236,0.07) 12.5%,rgba(210, 210, 210,0.07) 12.5%, rgba(210, 210, 210,0.07) 25%,rgba(183, 183, 183,0.07) 25%, rgba(183, 183, 183,0.07) 37.5%,rgba(157, 157, 157,0.07) 37.5%, rgba(157, 157, 157,0.07) 50%,rgba(130, 130, 130,0.07) 50%, rgba(130, 130, 130,0.07) 62.5%,rgba(104, 104, 104,0.07) 62.5%, rgba(104, 104, 104,0.07) 75%,rgba(77, 77, 77,0.07) 75%, rgba(77, 77, 77,0.07) 87.5%,rgba(51, 51, 51,0.07) 87.5%, rgba(51, 51, 51,0.07) 100%),linear-gradient(90deg, #ffffff,#ffffff);
    margin: 0;
    padding: 0;
}

.container {
    max-width: 800px;
    margin: 50px auto;
    padding: 20px;
    margin-top:5%;
    /*background-image:radial-gradient(to right, rgba(255, 255, 255, 0.1), rgba(255, 255, 255, 0.3));
    background-image: radial-gradient(circle at 11% 32%, rgba(2,255,255,0.02) 0%, rgba(255,255,255,0.04) 5%,transparent 5%, transparent 95%),radial-gradient(circle at 89% 30%, rgba(255,255,255,0.04) 0%, rgba(255,255,255,0.04) 5%,transparent 5%, transparent 95%),radial-gradient(circle at 76% 90%, rgba(255,255,255,0.03) 0%, rgba(255,255,255,0.03) 6%,transparent 6%, transparent 94%),radial-gradient(circle at 83% 14%, rgba(255,255,255,0.03) 0%, rgba(255,255,255,0.03) 6%,transparent 6%, transparent 94%),radial-gradient(circle at 62% 81%, rgba(255,255,255,0.03) 0%, rgba(255,255,255,0.03) 6%,transparent 6%, transparent 94%),radial-gradient(circle at 34% 3%, rgba(255,255,255,0.03) 0%, rgba(255,255,255,0.03) 6%,transparent 6%, transparent 94%),radial-gradient(circle at 19% 1%, rgba(255,255,255,0.04) 0%, rgba(255,255,255,0.04) 4%,transparent 4%, transparent 96%),radial-gradient(circle at 48% 14%, rgba(255,255,255,0.04) 0%, rgba(255,255,255,0.04) 4%,transparent 4%, transparent 96%),radial-gradient(circle at 54% 23%, rgba(255,255,255,0.04) 0%, rgba(255,255,255,0.04) 4%,transparent 4%, transparent 96%),radial-gradient(circle at 10% 37%, rgba(255,255,255,0.04) 0%, rgba(255,255,255,0.04) 4%,transparent 4%, transparent 96%),linear-gradient(70deg, rgba(81, 242, 237, 0.5),rgba(28, 31, 400, 0.5));
    */
    background-image: radial-gradient(circle at 11% 32%, rgba(2,255,255,0.02) 0%, rgba(255,255,255,0.04) 5%,transparent 5%, transparent 95%),
                  radial-gradient(circle at 89% 30%, rgba(255,255,255,0.04) 0%, rgba(255,255,255,0.04) 5%,transparent 5%, transparent 95%),
                  radial-gradient(circle at 76% 90%, rgba(255,255,255,0.03) 0%, rgba(255,255,255,0.03) 6%,transparent 6%, transparent 94%),
                  radial-gradient(circle at 83% 14%, rgba(255,255,255,0.03) 0%, rgba(255,255,255,0.03) 6%,transparent 6%, transparent 94%),
                  radial-gradient(circle at 62% 81%, rgba(255,255,255,0.03) 0%, rgba(255,255,255,0.03) 6%,transparent 6%, transparent 94%),
                  radial-gradient(circle at 34% 3%, rgba(255,255,255,0.03) 0%, rgba(255,255,255,0.03) 6%,transparent 6%, transparent 94%),
                  radial-gradient(circle at 19% 1%, rgba(255,255,255,0.04) 0%, rgba(255,255,255,0.04) 4%,transparent 4%, transparent 96%),
                  radial-gradient(circle at 48% 14%, rgba(255,255,255,0.04) 0%, rgba(255,255,255,0.04) 4%,transparent 4%, transparent 96%),
                  radial-gradient(circle at 54% 23%, rgba(255,255,255,0.04) 0%, rgba(255,255,255,0.04) 4%,transparent 4%, transparent 96%),
                  radial-gradient(circle at 10% 37%, rgba(255,255,255,0.04) 0%, rgba(255,255,255,0.04) 4%,transparent 4%, transparent 96%),
                  linear-gradient(70deg, rgba(81, 242, 237, 0.5), rgba(225, 50, 137, 0.2), rgba(28, 31, 400, 0.5));

    box-shadow: 0 0 10px rgba(0, 0, 0, 1);
    border-radius: 8px;
    text-align: center;
}

table {
    width: 100%;
    margin-bottom: 20px;
}

img {
    width: 150px;
    height: auto;
    margin-bottom: 20px;
}

h1 {
    font-size: 24px;
    color: #333333;
    margin-bottom: 20px;
}

p {
    font-size: 22px;
    color: #0c30fd;
    font-weight: bolder;
}

button {
    padding: 10px 20px;
    font-size: 16px;
    color: #080808;
    background-color:aqua;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    margin: 10px;
    font-weight: bolder;
}

button:hover {
    background-color: #ec2eef;
}

a {
    color: #e92def;
    text-decoration: none;
    font-size: 20px;
    font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
}

a:hover {
    text-decoration: underline;
    font-weight: bold;
}

#registeredOptions, #notRegisteredOptions {
    margin-top: 20px;
}

</style>
</html>
    