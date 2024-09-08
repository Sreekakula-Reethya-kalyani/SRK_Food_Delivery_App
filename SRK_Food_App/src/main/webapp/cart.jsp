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
    /* General CSS Reset */
    * {
      margin: 0;
      padding: 0;
      box-sizing: border-box;
    }
    
    /* Body Style */
    body {
      font-family: "Poppins", sans-serif;
    }
    
    /* Container */
    .container {
      max-width: 1300px;
      margin: auto;
      padding-left: 25px;
      padding-right: 25px;
    }

    /* Heading Style */
    h1 {
      text-align: center;
      margin-bottom: 20px;
      color: #ff523b;
    }

    /* Cart Item Styles */
    .Cart-Item {
      display: flex;
      justify-content: space-between;
      align-items: center;
      padding: 15px;
      border-bottom: 1px solid #ddd;
    }
    
    .Cart-Item h3 {
      color: #555;
      margin-bottom: 10px;
    }

    .Cart-Item img {
      width: 100px;
      margin-right: 20px;
    }

    .Cart-Item form {
      display: flex;
      align-items: center;
    }

    .Cart-Item input[type="number"] {
      width: 50px;
      height: 30px;
      margin-right: 10px;
      padding-left: 10px;
      font-size: 20px;
      border: 1px solid #ff523b;
    }

    .Cart-Item input[type="submit"] {
      background: #ff523b;
      color: white;
      border: none;
      padding: 5px 10px;
      margin-left: 5px;
      cursor: pointer;
    }

    .Cart-Item input[type="submit"]:hover {
      background: #555;
    }

    /* Empty Cart Message */
    .empty-cart {
      text-align: center;
      margin-top: 20px;
      color: #ff523b;
      font-size: 20px;
    }

    /* Proceed to Pay Button */
    .proceed-to-pay {
      display: block;
      margin: 40px auto;
      padding: 15px 30px;
      background-color: #ff523b;
      color: white;
      text-align: center;
      font-size: 18px;
      border: none;
      cursor: pointer;
      text-transform: uppercase;
      border-radius: 5px;
    }

    /* Hover Effect */
    .proceed-to-pay:hover {
      background-color: #555;
    }
</style>
</head>
<body>
    <div class="container">
        <h1>Cart Items</h1>
        <%
            Cart cart = (Cart) session.getAttribute("cart");

            if (cart != null) {
                Map<Integer, CartItem> cartitems = cart.getItems();
                
                if (cartitems != null && !cartitems.isEmpty()) {
                   
                    for (Map.Entry<Integer, CartItem> entry : cartitems.entrySet()) {
                        CartItem cartitem = entry.getValue();
        %>
            <div class="Cart-Item">
                <h3>Item ID: <%= cartitem.getItemId() %></h3>
                <h3>Item Name: <%= cartitem.getItemName() %></h3>
                <h3>Price: <%= cartitem.getPrice() %></h3>
                
                 <form action="cart">
                 <input type="hidden" name="itemId" value="<%= cartitem.getItemId() %>">
                   Quantity: <input type="number" name="quantity" value="<%= cartitem.getQuantity() %>" min="1">
       			  <input type="submit" name="action" value="update">
       			<input type="submit" name="action" value="delete">
                </form>
                <h3>Subtotal: <%= cartitem.getSubTotal() %></h3><br>
               
            </div>
            <a href="menu.jsp">Add more items</a>
        <%
                    }%>
                    <form action="checkout.jsp">
                     <center><input type="submit" value="Proceed To Pay"></center>
                     </form>
                    
              <% } 
                else {
        %>
            <p>Your cart is empty.</p>
        <%
                }
            } 
           
        %>
    </div>
</body>
</html>
