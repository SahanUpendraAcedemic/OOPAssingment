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

    		var day= document.forms["uporder"]["odate"].valueAsDate;
    		console.log(day);
    		if((day<=currentday)||(day>futuredays)){
    			alert('Invalid Date!');
    			
    		}	
    		else{
    			alert("Proceed to Update your order!");
    			document.getElementById("obtn").disabled=false;
    		}
    	}
    </script>
</head>
<body>
   <div class = "container">
        <nav>
            <h1>Update Order</h1>
        </nav>
        <div class = "content">
        <h1>Update Your order</h1>
           <p>.</p>
            </div>
            <div class="formdiv">
            <%
				String oname =request.getParameter("Oname");
				String odate =request.getParameter("Odate");
				String otype =request.getParameter("Otype");
				String ocontent =request.getParameter("Ocontent");
				String dilmethod =request.getParameter("Odil");
				
			%>
                 <form  name="uporder" action="update" method="post">
                <table>
                	<tr><td>
                        <label for="name">Order Name*</label></td><td>
                        <input type="text" placeholder="Enter the Order Name" name="updateoname" value="<%=oname%>" readonly></td></tr>   
                      
                        <tr><td>
                        <label for="name">Order Due Date</label></td><td>
                        <input type="date" name="updateoddate" id="odate" value="<%=odate%>"></td></tr>   
                      
                        <tr><td>
                        <label>Order Type:</label></td><td>	
                        <label for="otype">Standard</label><input type="radio" name="updateotype" value="Standard">
                        <label for="otype">Rushed</label><input type="radio" name="updateotype" value="Rushed">
                        </td></tr>   
                        
                    	<tr><td>
                        <label for="updateocontent">Order Contents</label></td><td>
                        <input type="text" name="updateocontent" value="<%=ocontent%>"></td></tr>   

                        <tr><td>
                        <label for="updatedilmethod">Delivery method*</label></td><td>
                        <select name="updatedilmethod">
                        <option value="Pickup">Pick-up</option>
                        <option value="Home Delivery">Home-Delivery</option>
                        </select>
                        </td></tr>	   
                     </table>
                        
                        <p> * - will not be changed from the original order!</p>
                        <button id="obtn" type="submit" value="Update Order">Update Order</button>
                        <script>document.getElementById("obtn").disabled=true;</script>
                 </form>
 						<button onclick="return printdate()">Check Details</button>
             </div>
     </div>
               
</body>

</html>