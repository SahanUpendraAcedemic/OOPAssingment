<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang = "en">
<head>
    <title>Order Items</title>
    <link rel ="Stylesheet" href = "${pageContext.request.contextPath}/CSS/OrderItems.css">
    <script type="text/javascript">
    	function printdate(){
    		
    		var currentday= new Date();
    		var futuredays=new Date();
    		futuredays.setMonth(12);
    		var day= document.forms["order"]["date"].valueAsDate;
    		console.log(day);
    		if((day<=currentday)||(day>futuredays)){
    			alert('Invalid Date!');
    			
    		}	
    		else{
    			alert("Proceed to Place your order!");
    			document.getElementById("btn").disabled=false;
    		}
    	}
    </script>
</head>
<body>
   <div class = "container">
        <nav>
            <h1>Order Items</h1>
            <ul>
                <li><a href = "index.jsp" >Home</a></li>
                <li><a href = "#" >Community</a></li>
                <li><a href = "#" >About us</a></li>
            </ul>
        </nav>
        <div class = "content">
        <h1>Place Your order</h1>
        <%
        	String Uid = request.getParameter("uid");
        %>
            <p>.</p>
            </div>
            <div class="formdiv">
            
                 <form name="order" action="order" method="post">
                 <table>
                 	<tr><td>
                        <label for="uid">UID</label></td><td>
                        <input type="text" placeholder="Enter the Order Name" name="UID" value="<%=Uid%>" readonly></td>    
                        </tr>
						<tr><td>
                        <label for="name">Order Name</label></td><td>
                        <input type="text" placeholder="Enter the Order Name" name="oname" required></td>    
                        </tr>
                        
                        <tr><td>
                        <label for="name">Order Due Date</label></td><td>
                        <input type="date" name="oddate" id="date" required></td> 

                        <tr><td>
                        <label>Order Type:</label></td><td>
                        Standard<input type="radio" name="otype" value="Standard">
                        Rushed<input type="radio" name="otype" value="Rushed"></td> 

						<tr><td>
                        <label for="ocontent">Order Contents</label></td><td>
                        <textarea name="ocontent" required></textarea></td> 

                         
						<tr><td>
                        <label for="dilmethod">Delivery method</label></td><td>
                        <select name="dilmethod">
                        <option value="Pickup">Pick-up
                        <option value="Home Delivery">Home-Delivery
                        </select></td> 
					  </table>
                        <button id="btn" type="submit" value="Place Order">Place Order</button>
                        <script>document.getElementById("btn").disabled=true;</script>
                 </form>
 						<button onclick="return printdate()">Check Details</button>
             </div>
         
     </div>
               
</body>

</html>