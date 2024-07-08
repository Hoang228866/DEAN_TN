<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form:form modelAttribute="khg" method="post" action="/update/${khg.id}">
<%--    <div class="mb-3">--%>
<%--        <label class="form-label">ID</label>--%>
<%--        <form:input  class="form-control"    path="id"/>--%>
<%--    </div>--%>
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
        <form:input  type="date"  class="form-control"  value="${khg.ngay_sinh}"   path="ngay_sinh"/>
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

<button>UpDate</button>







</form:form>