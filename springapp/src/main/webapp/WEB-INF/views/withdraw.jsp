<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
  <title><fmt:message key="title"/></title>
  <style>
    .error { color: red; }
  </style>  
</head>
<body>
<h1><fmt:message key="withdraw.heading"/></h1>
<form:form method="post" commandName="withdraw">
  <table width="95%" bgcolor="f8f8ff" border="0" cellspacing="0" cellpadding="5">
    <tr>
      <td align="right" width="20%">Withdraw (&#8364):</td>
        <td width="20%">
          <form:input path="amount"/>
        </td>
        <td width="60%">
          <form:errors path="amount" cssClass="error"/>
        </td>
    </tr>
  </table>
  <br>
  <input type="submit" value="Withdraw">
</form:form>
<a href="<c:url value="accountdata.htm"/>">Home</a>
</body>
</html>