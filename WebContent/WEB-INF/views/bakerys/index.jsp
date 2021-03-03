<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="../layout/app.jsp">
    <c:param name="content">

        <h2>パン屋さん　一覧</h2>
        <ul id="bakery_list">

                <%-- pan内の要素が無くなるまで続ける --%>
                <c:forEach var="pan" items="${pan}">

                <li>
                    <a href="show?id=${pan.id}">
                         <c:out value="${pan.name}" />
                    </a>
                </li>
                </c:forEach>

        </ul>

<p><a href="<c:url value='/bakery/new' />">新規登録</a></p>

    </c:param>
</c:import>