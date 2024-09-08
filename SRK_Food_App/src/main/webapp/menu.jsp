<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.srk.model.Menu,java.util.ArrayList" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menu List</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #f0f8ff; /* Light blue background */
        margin: 0;
        padding: 0;
    }

    h1 {
        text-align: center;
        color: white;
        padding: 20px;
        background-color: #00c1d4; /* Aqua blue */
        margin: 0;
        font-size: 32px;
    }

    .item-list {
        display: flex;
        flex-wrap: wrap;
        justify-content: center;
        gap: 20px;
        width: 90%;
        margin: 30px auto;
    }

    .menu-item {
        background-color: #ffffff;
        border: 1px solid #d0e9ff; /* Light blue border */
        border-radius: 10px;
        padding: 20px;
        width: 300px;
        box-shadow: 0 8px 16px rgba(0, 0, 0, 0.1);
        transition: transform 0.3s, box-shadow 0.3s, background-color 0.3s;
    }

    .menu-item:hover {
        transform: translateY(-5px);
        box-shadow: 0 12px 24px rgba(0, 0, 0, 0.2);
        background-color: #e0f7fa; /* Hover light aqua background */
    }

    .menu-item h3 {
        font-size: 22px;
        color: #00c1d4; /* Aqua text color */
        margin-bottom: 10px;
    }

    .menu-item p {
        font-size: 16px;
        color: #666;
        margin: 5px 0;
    }

    .menu-item .price {
        font-size: 22px;
        color: #0056b3; /* Darker blue for price */
        font-weight: bold;
        margin: 15px 0;
        text-align: center;
        padding: 10px;
        border: 2px solid #0056b3;
        border-radius: 5px;
        background-color: #e6f2ff; /* Light blue for price background */
        box-shadow: 0 3px 6px rgba(0, 0, 0, 0.1);
    }

    .menu-item .availability {
        font-size: 16px;
        margin-bottom: 15px;
        font-weight: bold;
    }

    .menu-item .availability.available {
        color: #28a745; /* Green for available */
    }

    .menu-item .availability.unavailable {
        color: #dc3545; /* Red for unavailable */
    }

    .menu-item form {
        display: flex;
        flex-direction: column;
        gap: 10px;
    }

    .menu-item form input[type="number"] {
        padding: 5px;
        font-size: 16px;
        border-radius: 5px;
        border: 1px solid #ddd;
        width: 60px;
    }

    .menu-item form input[type="submit"] {
        padding: 10px;
        background-color: #007bff;
        color: white;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        transition: background-color 0.3s ease;
    }

    .menu-item form input[type="submit"]:hover {
        background-color: #00c1d4; /* Aqua hover effect */
    }
</style>
</head>
<body>
<h1>Pick the Foods which Picks your Mood :)</h1>
<section class="item-list">
<%
ArrayList<Menu> menuList = (ArrayList<Menu>)session.getAttribute("itemsList");
if (menuList != null) {
    for (Menu menu : menuList) {
%>
    <div class="menu-item">
        <h3>Item: <%= menu.getItemName() %></h3>
        <p>Description: <%= menu.getDescription() %></p>
        <p class="price">Price: ₹<%= menu.getPrice() %></p>
        <p class="availability <%= menu.isAvailable() ? "unavailable" : "available" %>">
            Availability: <%= menu.isAvailable() ? "Not Available" : "Available" %>
        </p>
        <form action="cart">
            <input type="hidden" name="itemId" value="<%=menu.getMenuId() %>">
            Quantity: <input type="number" name="quantity" value="1" min="1">
            <input type="submit" value="Add to Cart">
            <input type="hidden" name="action" value="add">
        </form>
    </div>
<% } } %>
</section>
</body>
</html>
