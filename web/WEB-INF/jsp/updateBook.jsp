<%--
  Created by IntelliJ IDEA.
  User: super
  Date: 2020/7/21
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <div class="form-group" hidden>
            <label for="bookId">书籍ID</label>
            <input  type="text" class="form-control" id="bookId" name="bookId" value="${books.bookId}" required>
        </div>
        <div class="form-group">
            <label for="bookName">书籍名称</label>
            <input type="text" class="form-control" id="bookName" name="bookName" value="${books.bookName}" required>
        </div>
        <div class="form-group">
            <label for="bookCounts">书籍数量</label>
            <input type="text" class="form-control" id="bookCounts" name="bookCounts" value="${books.bookCounts}" required>
        </div>
        <div class="form-group">
            <label for="detail">书籍描述</label>
            <input type="text" class="form-control" id="detail" name="detail" value="${books.detail}" required>
        </div>
        <button type="submit" class="btn btn-default">提交</button>
    </form>
</div>
</body>
</html>
