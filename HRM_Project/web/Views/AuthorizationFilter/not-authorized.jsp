<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Not Authorized</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="container mt-5">
            <div class="alert alert-danger">
                <h4 class="alert-heading">Access Denied</h4>
                <p>You do not have permission to access this page.</p>
                <hr>
                <a href="${pageContext.request.contextPath}/login" class="btn btn-primary">Back to Login</a>
            </div>
        </div>
    </body>
</html>
