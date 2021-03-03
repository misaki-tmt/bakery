<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:import url="../layout/app.jsp">
    <c:param name="content">

        <h2><c:out value="${pan.name}" />の詳細ページ</h2>

        <p>名前：<c:out value="${pan.name}" /></p>
        <p>住所：<c:out value="${pan.address}" /></p>
        <p>営業時間：<c:out value="${pan.time}" /></p>
        <p>休日：<c:out value="${pan.holiday}" /></p>
        <p>電話番号：<c:out value="${pan.tel}" /></p>
        <p>HP：<c:out value="${pan.hpadd}" /></p>
        <p>マップ：<c:out value="${pan.map}" /></p>

        <p>メモ：<c:out value="${pan.memo}" /></p>
        <p>ID : <c:out value="${pan.id}" /></p>
        <p>作成日時：<fmt:formatDate value="${pan.created_at}" pattern="yyyy-MM-dd HH:mm:ss" /></p>
        <p>更新日時：<fmt:formatDate value="${pan.updated_at}" pattern="yyyy-MM-dd HH:mm:ss" /></p>

        <p><a href="index">一覧に戻る</a></p>
        <p><a href="edit?id=${pan.id}">編集する</a>
    </c:param>
</c:import>