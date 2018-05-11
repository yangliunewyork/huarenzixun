<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Book</title>
    <link rel="stylesheet"
          type="text/css"
          href="<c:url value="/resources/style.css" />" >
</head>
<body>
<div class="bookView">
    <div class="bookTitle"><c:out value="${book.title}" /></div>
    <div>
        <span class="bookContent"><c:out value="${book.content}" /></span>
    </div>
</div>
</body>
</html>