<%-- 
    Document   : login
    Created on : Jul 19, 2024, 2:13:53 PM
    Author     : xuxum
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../../CSS/login.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
    <body>
        <section class="container">
            <div class="login-container">
                <div class="circle circle-one"></div>
                <div class="form-container">
                    <img src="https://raw.githubusercontent.com/hicodersofficial/glassmorphism-login-form/master/assets/illustration.png" alt="illustration" class="illustration" />
                    <h1 class="opacity">LOGIN</h1>
                    <form>
                        <input type="text" name="username"
                               placeholder="username" />
                        <input type="password" name="password"
                               placeholder="password" />
                        <button class="opacity">SUBMIT</button>
                    </form>
                    <div class="social">
                        <div class="go"><i class="fab fa-google"></i>  Google</div>
                        <div class="fb"><i class="fab fa-facebook"></i>  Facebook</div>
                    </div>      
                    <div class="register-forget opacity">
                        <a href="">REGISTER</a>
                        <a href="">FORGOT PASSWORD</a>
                    </div>
                </div>
                <div class="circle circle-two"></div>
            </div>
            <div class="theme-btn-container"></div>
        </section>
    </body>
</body>
</html>
