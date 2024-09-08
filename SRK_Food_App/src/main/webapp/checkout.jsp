<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.srk.model.Cart"%>
<%@ page import="com.srk.model.CartItem"%>
<%@ page import="java.util.Map"%>
<%@ page import="java.util.Map.Entry"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cart Items</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 0;
    }
    .container {
        width: 80%;
        margin: 50px auto;
        background-color: #fff;
        padding: 20px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    h1 {
        text-align: center;
        color: blue;
    }
    table {
        width: 100%;
        border-collapse: collapse;
        margin: 20px 0;
    }
    table, th, td {
        border: 1px solid #ddd;
    }
    th, td {
        padding: 12px;
        text-align: left;
    }
    th {
        background-color: #f8f8f8;
    }
    tr:nth-child(even) {
        background-color: #f9f9f9;
    }
    .empty-cart {
        text-align: center;
        color: #888;
        font-size: 18px;
    }
    .Cart-Item h3 {
        margin: 5px 0;
        color: #555;
    }
    .grand-total {
        text-align: right;
        padding-right: 10px;
        font-weight: bold;
        color: #333;
    }
</style>
</head>
<body>
   <form action="confirm">
    <div class="container">
    <form action="">
        <h1>Billing Items</h1>
        <%
        double grandTotal = 0;
        Cart cart = (Cart) session.getAttribute("cart");

        if (cart != null) {
            Map<Integer, CartItem> cartitems = cart.getItems();
            
            
            if (cartitems != null && !cartitems.isEmpty()) {
        %>
        <table>
            <tr>
                <th>Item ID</th>
                <th>Item Name</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Subtotal</th>
            </tr>
            <%
                // Loop through the cart items and calculate subtotals and grand total
                for (Map.Entry<Integer, CartItem> entry : cartitems.entrySet()) {
                    CartItem cartitem = entry.getValue();
                    double subTotal = cartitem.getSubTotal();
                    grandTotal += subTotal;
            %>
            <tr>
                <td><%= cartitem.getItemId() %></td>
                <td><%= cartitem.getItemName() %></td>
                <td><%= cartitem.getPrice() %></td>
                <td><%= cartitem.getQuantity() %></td>
                <td><%= subTotal %></td>
            </tr>
            <%
                } 
            %>
            <tr>
                <td colspan="4" class="grand-total">Grand Total:</td>
                <td><%= grandTotal %></td>
            </tr>
        </table>
    <h3>Select Payment Method:</h3>
    <label>
        <input type="radio" name="paymentMethod" value="creditCard" required>
        Credit Card
    </label><br>
    <label>
        <input type="radio" name="paymentMethod" value="debitCard">
        Debit Card
    </label><br>
    <label>
        <input type="radio" name="paymentMethod" value="paypal">
        PayPal
    </label><br>
    <label>
        <input type="radio" name="paymentMethod" value="bankTransfer">
        Bank Transfer
    </label><br>
    <label>
        <input type="radio" name="paymentMethod" value="cashOnDelivery">
        Cash on Delivery
    </label><br>
    
        
        <h3>Address:</h3>
          <input type="text" name="address"style="width: 400px; height: 100px;">
          
          <center><h2><input type="submit" value="Confirm Order"></h2></center>
        </form>
        

        <%
            } else {
        %>
            <p class="empty-cart">Your cart is empty.</p>
        <%
            }
        } else {
        %>
            <p class="empty-cart">Your cart is empty.</p>
        <%
        }
        %>
    </div>
    
</body>
</html>
