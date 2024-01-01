<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    /***********************************************************
     * 메인화면
     ************************************************************
     * JSP Name      : main.jsp
     * Description   :
     * Author        : 김홍래
     * Create Date   : 2024.01.01
     * History       : 2024.01.01 Initial create by 김홍래
     ***********************************************************/
%>
<script>
</script>

<form id="form" method="post">
    <label for="id">아이디</label>
    <input type="text" name="id" id="id" placeholder="아이디22" required />
    <label for="pass">비밀번호</label>
    <input type="password" name="pass" id="pass" placeholder="비밀번호" required />
    <input type="submit" value="로그인" />
</form>
