<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
  <head><title><fmt:message key="title"/></title></head>
  <body>
  	<font face="arial" color="black" size="5">
    <h1><fmt:message key="heading"/></h1>
    <p><fmt:message key="greeting"/> <c:out value="${model.now}"/></p>
    <h3>Account Data</h3>
    
     Account ID: <c:out value="${model.account.getId()}"/> <br><br>
     Name: <c:out value="${model.account.getName()}"/> <br><br>
     DNI: <c:out value="${model.account.getDni()}"/> <i> <br><br>
     Balance: <c:out value="${model.account.getBalance()}"/> </i> &#8364 <br><br>
    
    <a href="<c:url value="deposit.htm"/>">Deposit Money</a><br><br>
    <a href="<c:url value="withdraw.htm"/>">Withdraw Money</a>
    <br>
  </body>
</html>