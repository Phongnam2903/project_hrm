<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forgot Password</title>
        <link href="${pageContext.request.contextPath}/CSS/forgotpass.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <section class="container">
            <div class="login-container">
                <div class="circle circle-one"></div>
                <div class="form-container">
                    <h1 class="opacity">Forgot Password</h1>
                    <form action="${pageContext.request.contextPath}/forgotpass" method="POST">
                        <input type="text" name="email" placeholder="Input your email" />
                        <button type="submit" name="submitReset" class="opacity">Reset Password</button>
                        <a href="${pageContext.request.contextPath}/login" class="cancel-btn">Cancel</a>
                    </form>
                    <c:if test="${not empty mess}">
                        <div id="errorModal" class="modal">
                            <div class="modal-content">
                                <span class="close" onclick="document.getElementById('errorModal').style.display = 'none'">&times;</span>
                                <p>${mess}</p>
                            </div>
                        </div>
                    </c:if>
                </div>
                <div class="circle circle-two"></div>
            </div>
            <div class="theme-btn-container"></div>
        </section>
    </body>
    <script src="${pageContext.request.contextPath}/JS/forgotpass.js" type="text/javascript"></script>
</html>
