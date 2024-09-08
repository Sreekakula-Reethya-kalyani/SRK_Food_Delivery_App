<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.srk.model.User,com.srk.model.Restaurant,java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Restaurant Listings</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f4f4f4;
    }
    
    header {
        background-color: azure; 
        color: black;
        padding: 20px;
        text-align: center;
    }
    
    nav {
        margin-top: 10px;
        background-color: azure;
    }

    nav a {
        color: black;
        margin-right: 10px;
        text-decoration: none;
    }

    nav a:hover {
        color: #ff00f2; 
        text-decoration: underline;
    }

    .reslogo {
        transition: transform 0.3s ease, filter 0.3s ease; 
    }

    .reslogo:hover {
        transform: scale(1.1); 
        filter: drop-shadow(0 0 10px aqua);
    }

    .page-container {
        display: flex;
        max-width: 1200px;
        margin: 20px auto;
    }

    .right-column {
        flex: 1;
        background-color: #fff;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    }

    h2 {
        text-align: center;
    }

    .restaurant-list {
        display: grid;
        grid-template-columns: repeat(auto-fill, minmax(300px, 1fr));
        gap: 20px;
    }

    .restaurant-card {
        background-color: white;
        border-radius: 8px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.5);
        overflow: hidden;
        transition: transform 0.3s ease, box-shadow 0.3s ease; 
        display: flex;
        flex-direction: column;
        align-items: center;
        text-align: center;
    }

    .restaurant-card:hover {
        transform: scale(1.05);
        box-shadow: 0 8px 16px rgba(26, 223, 223, 1); 
    }

    .restaurant-card img {
        width: 100%;
        height: 150px;
        object-fit: cover;
    }

    .restaurant-details {
        padding: 15px;
    }

    .restaurant-details h3 {
        font-size: 22px;
        margin: 0 0 10px;
    }

    .restaurant-details p {
        font-size: 16px;
        margin: 5px 0;
        color: #555;
    }

    .restaurant-details a {
        display: inline-block;
        padding: 10px 20px;
        background-color: #50B498; 
        color: white;
        text-decoration: none;
        border-radius: 5px;
        font-weight: bold;
        margin-top: 10px;
    }

    .restaurant-details a:hover {
        background-color: #0056a3; 
    }

    footer {
        text-align: center;
        margin-top: 20px;
        color: #777;
    }
     footer {
        text-align: center;
        color: #777;
        padding: 10px;
        background-color: azure; /* Matches the header */
        position: relative;
        bottom: 0;
        width: 100%;
    }
</style>
</head>
<body>

<header class="h">
    <div style="display: flex; align-items: center; justify-content: center;">
        <img src="images/DreamLoogo.png" alt="App Logo" height="50px" width="100px" class="reslogo">
        <h1 style="margin-left: 20px;">Welcome to SRK Foods World! &#128521</h1>
    </div>
    <nav>
        <a href="home">&#127869Home</a>
        <% User user = (User)session.getAttribute("loggedInUser"); %>
        <% if (user != null) { %>
            <span>Welcome <%= user.getUser_name() %> &#10084</span>
            <a href="cart.jsp">&#128722View Cart</a>
            <a href="history">&#9203Order History</a>
            <a href="logout.jsp">&#xF1C3Logout</a>
        <% } else { %>
            <a href="login.jsp">&#128100Login</a>
            <a href="signup.jsp">&#128073Register</a>
        <% } %>
    </nav>
</header>

<div class="page-container">
    <div class="right-column">
        <h2>Featured Restaurants</h2>
         <section class="restaurant-list">
            <% ArrayList<Restaurant> restaurantList = (ArrayList<Restaurant>)session.getAttribute("restaurantlist");
            if (restaurantList != null) {
                for (Restaurant restaurant : restaurantList) { %>
                <div class="restaurant-card">
                    
                    <div class="restaurant-details">
                        <h3><%= restaurant.getRestaurant_Name() %></h3>
                        <p><%= restaurant.getCuisinType() %> - <%= restaurant.getDeliveryTime() %> mins</p>
                        <a href="menu?restaurant_Id=<%= restaurant.getRestaurant_Id() %>">View Menu</a>
                    </div>
                </div>
            <% } } else { %>
                <p>No restaurants available at the moment.</p>
            <% } %>
        </section>
    </div>
</div>

<footer>
    <p>&copy; 2024 SRK Online Food Delivery. All rights reserved.</p>
</footer>

</body>
</html>
