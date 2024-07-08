<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<h3>

QUẢN LÝ KHÁCH HÀNG

</h3>
<form:form modelAttribute="khg" method="post" action="add">

    <div class="mb-3">
        <label class="form-label">ID</label>
        <form:input  class="form-control"    path="id"/>
    </div>
    <div class="mb-3">
        <label class="form-label">Số Điện Thoại </label>
        <form:input  class="form-control"    path="so_dien_thoai"/>
    </div>

    <div class="mb-3">
        <label class="form-label">Tên Đầy Đủ</label>
        <form:input  class="form-control"    path="ten_day_du"/>
    </div>

    <div class="mb-3">
        <label class="form-label">Tài Khoản</label>
        <form:input  class="form-control"    path="tai_khoan"/>
    </div>

    <div class="mb-3">
        <label class="form-label">Mật Khẩu</label>
        <form:input  class="form-control"    path="mat_khau"/>
    </div>

    <div class="mb-3">
        <label class="form-label">Email</label>
        <form:input  class="form-control"    path="email"/>
    </div>

    <div class="mb-3">
        <label class="form-label">Ngày Sinh</label>
        <form:input  type="date"  class="form-control"    path="ngay_sinh"/>
    </div>

    <div class="mb-3">
        <label class="form-label">Ảnh</label>
        <form:input  class="form-control"    path="anh"/>
    </div>

    <div class="mb-3">
        <label class="form-label">Trạng Thái </label>
        <form:radiobutton path="trang_thai" value="0"/> on
        <form:radiobutton path="trang_thai" value="1"/> off
    </div>
    <button class="btn btn-primary">ADD</button>
</form:form>
<div class="container">

    <table class="table">
        <thead>

        <tr>
            <td>Id</td>
            <td>Số Điện Thoại</td>
            <td>Tên Đầy Đủ</td>
            <td>Tài Khoản</td>
            <td>Mật Khẩu</td>
            <td>Email </td>
            <td>Ngày Sinh</td>
            <td>Ảnh </td>

            <td>Trạng Thái </td>
            <td>Action</td>

        </tr>

        </thead>
    <c:forEach items="${kh}" var="kh">
        <tr>
            <td>${kh.id}</td>
            <td>${kh.so_dien_thoai}</td>

            <td>${kh.ten_day_du}</td>
            <td>${kh.tai_khoan}</td>
            <td>${kh.mat_khau}</td>
            <td>${kh.email}</td>
            <td>${kh.ngay_sinh}</td>
            <td>${kh.anh}</td>
            <td>${kh.trang_thai}</td>
            <td>
                <a href="/kh/view-update/${kh.id}">Update</a>
                <a href="kh/delete/${kh.id} " class="btn  btn-primary">DeleTe</a>
                <br>
<%--                <a class="btn   btn-primary">Detail</a>--%>
            </td>




        </tr>
    </c:forEach>
</table>
</div>