
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="webjars/bootstrap/4.4.1-1/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
<div class ="container">
<form:form method="post" modelAttribute="todo">
<form:hidden path="id"/>
<h1 align="center">
<font color ="blue">Please Add Your New Todos</font>
<pre></pre>


<fieldset class="form-group"> 

<form:label path="desc">Description :</form:label>
<form:input path="desc" type ="text" class="form-control" required="required"/>
<form:errors path="desc" cssClass="text-warning"> </form:errors>

</fieldset>



<fieldset class="form-group"> 

<form:label path="targetDate">Target Date :</form:label>
<form:input path="targetDate" type ="text" class="form-control" required="required"/>
<form:errors path="targetDate" cssClass="text-warning"> </form:errors>

</fieldset>

<button type="submit" class="btn btn-success">ADD</button>




</h1>
 </form:form>
 <script src="webjars/jquery/3.4.0/jquery.min.js"></script>
		<script src="webjars/bootstrap/4.4.1-1</js/bootstrap.min.js"></script>
		<script> src="webjars/bootstrap-datepicker/1.0.1/js/bootstrap-datepicker.js"></script>
		
		<script>
		$('#targetDate').datepicker({format : 'dd/mm/yyyy'});
		
	</script>
</div>

</body>
</html>