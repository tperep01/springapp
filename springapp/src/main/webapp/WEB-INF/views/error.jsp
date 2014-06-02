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
 <H1>Página de errores en JSP:</H1>  
 <P>El error que ha ocurrido es: Intentar sacar más de lo que se tiene en la cuenta. <pre> 
 </pre> 
 </P> 
<a href="<c:url value="accountdata.htm"/>">Home</a>
</body>
</html>