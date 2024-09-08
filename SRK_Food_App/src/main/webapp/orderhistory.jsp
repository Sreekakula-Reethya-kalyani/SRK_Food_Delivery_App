<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.srk.model.OrderHistory"%>
<%@ page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order History</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        color: #333;
        margin: 0;
        padding: 0;
    }

    h1 {
        text-align: center;
        color: #4CAF50;
        margin: 20px 0;
    }

    .orderhistory-container {
        width: 80%;
        margin: auto;
        padding: 20px;
    }

    .orderhistory-details {
        background-color: #fff;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        margin-bottom: 20px;
        padding: 20px;
    }

    .orderhistory-details h3 {
        margin: 10px 0;
        color: #555;
    }

    .orderhistory-details h3 span {
        color: #333;
        font-weight: bold;
    }
    
    .orderhistory-details:nth-child(even) {
        background-color: #f9f9f9;
    }

</style>
</head>
<body>
    <h1>Order History</h1>
    <div class="orderhistory-container">
        <% ArrayList<OrderHistory>  orderhistorylist= (ArrayList<OrderHistory>)session.getAttribute("orderhistorylist");
        if(orderhistorylist != null) {
            for(OrderHistory a : orderhistorylist) { %>
            <div class="orderhistory-details">
                <h3>Order History ID: <span><%= a.getOrderHistoryId() %></span></h3>
                <h3>Order ID: <span><%= a.getOrderId() %></span></h3>
                <h3>Total Amount: <span><%= a.getTotAmount() %></span></h3>
                <h3>Status: <span><%= a.getStatus() %></span></h3>
                
                <a href="orderitem?orderId=<%= a.getOrderId() %>">View</a>
            </div>
            <% }
        } else { %>
        <p>No order history available.</p>
        <% } %>
    </div>
</body>
</html>
