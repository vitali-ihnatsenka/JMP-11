<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="/static/css/app.css">
    <script src="/static/js/jquery-3.1.1.min.js"></script>
    <script src="/static/js/app.js"></script>
</head>
<body>
    <c:forEach items="${accounts}" var="account">
        <div>
            <span>${account.id}</span>...........<span>${account.money}</span>
            <form action="/setMoney" method="post">
                <input type="hidden" value="${account.id}" name="accountId"/>
                <input type="number" min="0"  step="1" name="value"/>
                <input type="submit" value="Change amount"/>
            </form>
        </div>
    </c:forEach>
    <form action="/addAccount" method="post">
        <input type="submit" value="Add"/>
    </form>
</body>
</html>