<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="${pageContext.request.contextPath}/CSS/login.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <section class="container">
            <div class="login-container">
                <div class="circle circle-one"></div>
                <div class="form-container">
                    <img src="https://raw.githubusercontent.com/hicodersofficial/glassmorphism-login-form/master/assets/illustration.png" alt="illustration" class="illustration" />
                    <h1 class="opacity">LOGIN</h1>
                    <form action="${pageContext.request.contextPath}/login" method="POST">
                        <input type="text" name="username" placeholder="username" />
                        <input type="password" name="password" placeholder="password" />
                        <button type="submit" name="submitLogin" class="opacity">Login</button>
                    </form>   
                    <div class="register-forget opacity">
                        <a href="#">Forgot Password</a>
                    </div>
                    <c:if test="${not empty mess}">
                        <div class="alert">
                            <span class="closebtn" onclick="this.parentElement.style.display = 'none';">&times;</span> 
                            ${mess}
                        </div>
                    </c:if>
                </div>
                <div class="circle circle-two"></div>
            </div>
            <div class="theme-btn-container"></div>
        </section>
    </body>
</html>
