<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="${pageContext.request.contextPath}/CSS/login.css" rel="stylesheet" type="text/css"/>
        <style>
            .alert {
                padding: 15px;
                background-color: #4CAF50;
                color: white;
                margin-bottom: 15px;
                opacity: 1;
                transition: opacity 0.6s;
            }
            .hidden {
                opacity: 0;
                visibility: hidden;
                height: 0;
                padding: 0;
                margin: 0;
            }
        </style>
    </head>
    <body>
        <section class="container">
            <div class="login-container">
                <div class="circle circle-one"></div>
                <div class="form-container">
                    <img src="https://raw.githubusercontent.com/hicodersofficial/glassmorphism-login-form/master/assets/illustration.png" alt="illustration" class="illustration" />
                    <h1 class="opacity">Login</h1>
                    <c:if test="${not empty param.mess}">
                        <div id="alert" class="alert">${param.mess}</div>
                    </c:if>
                    <form action="${pageContext.request.contextPath}/login" method="POST">
                        <input type="text" name="username" placeholder="username" style="border-radius: 10px"/>
                        <div class="password-container">
                            <input id="pass" type="password" name="password" placeholder="password" style="border-radius: 10px"/>
                            <span id="togglePassword" onclick="togglePasswordVisibility()">👁 Show Password️</span>
                        </div>
                        <button type="submit" name="submitLogin" class="opacity">Login</button>
                    </form>   
                    <div class="register-forget opacity">
                        <a href="forgotpass">Forgot Password</a>
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
        <script src="${pageContext.request.contextPath}/JS/login.js" type="text/javascript"></script>
        <script>
                                function togglePasswordVisibility() {
                                    var passwordInput = document.getElementById('pass');
                                    var togglePassword = document.getElementById('togglePassword');
                                    if (passwordInput.type === 'password') {
                                        passwordInput.type = 'text';
                                        togglePassword.textContent = '🙈 Hide Password️';
                                    } else {
                                        passwordInput.type = 'password';
                                        togglePassword.textContent = '👁 Show Password️️';
                                    }
                                }

                                // Hide alert after 3 seconds
                                setTimeout(function () {
                                    var alert = document.getElementById('alert');
                                    if (alert) {
                                        alert.classList.add('hidden');
                                    }
                                }, 3000);
        </script>
    </body>
</html>
