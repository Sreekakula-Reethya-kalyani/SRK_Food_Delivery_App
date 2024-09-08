<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList,com.srk.model.OrderItem" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Items List</title>
<style>
    @import url('https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap'); /* Importing Roboto font */

    body {
        font-family: 'Roboto', sans-serif; /* Using Roboto font */
        background-color: #f0f8ff; /* Light blue background */
        margin: 0;
        padding: 0;
    }

    h1 {
        text-align: center;
        color: #ffffff;
        padding: 20px;
        margin: 0;
        background-color: #4682b4; /* Steel blue */
    }

    .order-items-container {
        width: 80%;
        margin: 20px auto;
        padding: 20px;
        background-color: white;
        border-radius: 8px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    }

    .order-item {
        border-bottom: 1px solid #ddd;
        padding: 15px 0;
        margin-bottom: 20px;
    }

    .order-item h3 {
        font-size: 18px;
        color: #333;
    }

    .order-item .price, .order-item .subtotal {
        font-weight: bold;
        color: #007bff; /* Light blue for prices */
    }

    .order-item:hover {
        background-color: #f0f8ff; /* Light blue hover effect */
        border-radius: 8px;
    }

    /* Button for adding more items */
    .add-more-items {
        display: block;
        text-align: center;
        margin: 20px auto;
        padding: 10px 20px;
        background-color: #4682b4; /* Steel blue */
        color: white;
        text-decoration: none;
        border-radius: 5px;
        transition: background-color 0.3s;
    }

    .add-more-items:hover {
        background-color: #5b9bd5; /* Lighter blue on hover */
    }
</style>
</head>
<body>
<h1>Ordered Items</h1>
<div class="order-items-container">
    <% 
    ArrayList<OrderItem> orderItemList = (ArrayList<OrderItem>) session.getAttribute("orderItemList"); 
    if (orderItemList != null) {
        for (OrderItem ot : orderItemList) { 
    %>
        <div class="order-item">
            <h3>Order Item ID: <span class="price"><%= ot.getOrderItemId() %></span></h3>
            <h3>Menu ID: <span class="price"><%= ot.getMenuId() %></span></h3>
            <h3>Quantity: <%= ot.getQuantity() %></h3>
            <h3>SubTotal: <span class="subtotal">&#8377;<%= ot.getSubTotal() %></span></h3>
        </div>
    <% 
        } 
    } else { 
    %>
        <h3>No order items found in your session.</h3>
    <% 
    } 
    %>
    </div>
</body>
</html>
