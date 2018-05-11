<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" >
</head>
<body>

<div class="listTitle">
    <h1>Recent books</h1>
    <ul class="bookList">
        <c:forEach items="${bookList}" var="book" >
            <li id="book_<c:out value="book.id"/>">
                <div><c:out value="${book.title}" /></div>
                <div><c:out value="${book.author}" /></div>
            </li>
        </c:forEach>
    </ul>
</div>
</body>
</html>
