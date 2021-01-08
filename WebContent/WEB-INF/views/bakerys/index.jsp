<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="../layout/app.jsp">
    <c:param name="content">

        <h2>パン屋さん　一覧</h2>
        <table id="bakery_list">
            <tbody>
                <tr>
                    <th>名前</th>
                    <th>住所</th>
                    <th>営業時間</th>
                    <th>休日</th>
                    <th>電話番号</th>
                    <th>HP</th>
                    <th>マップ</th>
                    <th>作成日時</th>
                    <th>更新日時</th>
                    <th>メモ</th>
                </tr>

                <%-- pan内の要素が無くなるまで続ける --%>
                <c:forEach var="pan" items="${pan}">
                    <tr>
                        <td><c:out value="${pan.name}" /></td>
                        <td><c:out value="${pan.address}" /></td>
                        <td><c:out value="${pan.time}" /></td>
                        <td><c:out value="${pan.holiday}" /></td>
                        <td><c:out value="${pan.tel}" /></td>
                        <td><c:out value="${pan.hpadd}" /></td>
                        <td><c:out value="${pan.map}" /></td>

                        <td><c:out value="${pan.created_at}" /></td>
                        <td><c:out value="${pan.updated_at}" /></td>
                        <td><c:out value="${pan.memo}" /></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

    </c:param>
</c:import>