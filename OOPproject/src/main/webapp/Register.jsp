<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>
            Registration
        </title>
        <link rel ="Stylesheet" href = "${pageContext.request.contextPath}/CSS/registation.css">
    </head>
    <body>
        <div class="container">
            <form action = "uRegServlet" method="post">
                <h2>
                    Registration
                </h2>
                <div class="content">
                    <div class="input-box">
                        <label for="name">Full name</label>
                        <input type="text" placeholder="Enter the full name" name="name" required>
                    </div>
                    <div class="input-box">
                        <label for="email">Email</label>
                        <input type="email" placeholder="Enter the vaild email address" name="email" required>
                    </div>
                    <div class="input-box">
                        <label for="phonenumber">Phone Number</label>
                        <input type="tel" placeholder="Enter the phone Number" name="phonenumber" required>
                    </div>
                    <div class="input-box">
                        <label for="username">User name</label>
                        <input type="text" placeholder="Enter the user name" name="uname" required>
                    </div>
                    <div class="input-box">
                        <label for="password">Password</label>
                        <input type="password" placeholder="Enter new password" name="password" required>
                    </div>
                    <div class="input-box">
                        <label for="cpassword">Confirm password</label>
                        <input type="password" placeholder="Confirm password" name="conpassword" required>
                    </div>
                    <div class="input-box">
                        <label for="phonenumber">Address</label>
                        <input type="tel" placeholder="Enter the Address" name="address" required>
                    </div>
                    <span class="gender-title">Gender</span>
                    <div class="gender-category">
                        <input type="radio" name="Gender" value="male">
                        <label for="Gender">Male</label>
                        <input type="radio" name="Gender" value="Female">
                        <label for="Gender">Female</label>
                        <input type="radio" name="Gender" value="other">
                        <label for="Gender">Other</label>
                    </div>
                </div>
                <div class="alert">
                    <p>
                        By clicking sing up, 
                        You agree to our<a  href="#"> Terms, </a> <a href="#">Privacy Policy </a> 
                        and <a href="#">Cookies Policy</a> you may receive a SMS 
                        notifications from us and can opt out at any-time.
                    </p>
                </div>
                <div class="button-container">
                    <button type="submit">Register</button>
                </div>
            </form>
        </div>
    </body>
</html>