<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reset Password</title>
        <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
        <link href="${pageContext.request.contextPath}/CSS/resetpassword.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <section class="container">
            <div class="login-container">
                <div class="circle circle-one"></div>
                <div class="form-container">
                    <h1 class="opacity">Reset Password</h1>
                    <form action="${pageContext.request.contextPath}/resetpassword" method="POST">
                        <div class="border-bottom">
                            <span class="fs-5 fw-bold text-black-weak">Verification Code</span>
                            <div class="d-flex align-items-center fs-4 mt-3">
                                <input type="text" name="code" placeholder="Verification Code" class="w-100 py-4 outline-0 border-0 ms-3" />
                            </div>
                        </div>
                        <div class="border-bottom mt-5">
                            <span class="fs-5 fw-bold text-black-weak">New Password</span>
                            <div class="d-flex align-items-center fs-4 mt-3">
                                <input type="password" name="newPassword" placeholder="New Password" class="w-100 py-4 outline-0 border-0 ms-3" id="newPassword" />
                                <input type="checkbox" id="showPasswordNew" class="ms-2" />
                                <label for="showPasswordNew" class="fs-5 fw-bold text-black-weak">Show Password</label>
                            </div>
                        </div>
                        <div class="border-bottom mt-5">
                            <span class="fs-5 fw-bold text-black-weak">Confirm New Password</span>
                            <div class="d-flex align-items-center fs-4 mt-3">
                                <input type="password" name="confirmPassword" placeholder="Confirm Password" class="w-100 py-4 outline-0 border-0 ms-3" id="confirmPassword" />
                                <input type="checkbox" id="showPasswordConfirm" class="ms-2" />
                                <label for="showPasswordConfirm" class="fs-5 fw-bold text-black-weak">Show Password</label>
                            </div>
                        </div>
                        <button type="submit" name="submitReset" id="confirmReset" class="opacity">Confirm</button>
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
    <script src="${pageContext.request.contextPath}/JS/resetpass.js" type="text/javascript"></script>
</html>
