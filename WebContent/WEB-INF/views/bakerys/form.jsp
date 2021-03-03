<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<label for="name">名前</label><br />
<input type="text" name="name" value="${bakery.name}" />
<br /><br />

<label for="address">住所</label><br />
<input type="text" name="address" value="${bakery.address}" />
<br /><br />

<label for="time">営業時間</label><br />
<input type="text" name="time" value="${bakery.time}" />
<br /><br />

<label for="holiday">休日</label><br />
<input type="text" name="holiday" value="${bakery.holiday}" />
<br /><br />

<label for="tel">電話番号</label><br />
<input type="text" name="tel" value="${bakery.tel}" />
<br /><br />

<label for="hpadd">HPアドレス</label><br />
<input type="text" name="hpadd" value="${bakery.hpadd}" />
<br /><br />

<label for="map">マップ</label><br />
<input type="text" name="map" value="${bakery.map}" />
<br /><br />

<label for="memo">メモ</label><br />
<input type="text" name="memo" value="${bakery.memo}" />
<br /><br />

<button type="submit">登録</button>