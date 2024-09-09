<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Máy Tính</title>
</head>
<body>
<h1>Máy Tính Cơ Bản</h1>
<form action="CalculatorServlet" method="post">
    <table>
        <tr>
            <td>Toán Hạng 1:</td>
            <td><input type="text" name="operand1" /></td>
        </tr>
        <tr>
            <td>Toán Hạng 2:</td>
            <td><input type="text" name="operand2" /></td>
        </tr>
        <tr>
            <td>Toán Tử:</td>
            <td>
                <select name="operator">
                    <option value="+">Cộng</option>
                    <option value="-">Trừ</option>
                    <option value="*">Nhân</option>
                    <option value="/">Chia</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Tính Toán" /></td>
        </tr>
    </table>
</form>
</body>
</html>



