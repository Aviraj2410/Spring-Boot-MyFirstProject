<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>List Of Todos</title>

<link href="webjars/bootstrap/4.4.1-1/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body>
	<nav role="navigation" class="navbar navbar-default">
		<div class="">
			<a href="http://www.facebook.com" class="navbar-brand">AVIRAJ</a>
		</div>
		<div class="navbar-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="/login">Home</a></li>
				<li><a href="/list-todos">Todos</a></li>

			</ul>
			<div class="container">
				<H1>Your Todos Are:</H1>
				<pre></pre>
				<table class="table table-striped">

					<thead>
						<tr>

							<th>Description</th>
							<th>Target Date</th>
							<th>Successfully Done</th>
							<th>Delete</th>
							<th>Update</th>

						</tr>
					</thead>
					<tbody>
						<c:forEach items="${todos}" var="todo">

							<tr>


								<td>${todo.desc}</td>
								<td><fmt:formatDate value="${todo.targetDate}"
										pattern="dd/MM/yyyy" /></td>
								<td>${todo.done}</td>

								<td><a type="button" class="btn btn-success"
									href="/update-todo?id=${todo.id}"> Update </a></td>

								<td><a type="button" class="btn btn-warning"
									href="/delete-todo?id=${todo.id}"> Delete </a></td>


							</tr>

						</c:forEach>
					</tbody>


				</table>
				<div>
					<h1 align="center">
						<a class="button" href="/add-todos">ADD A TODO</a>
					</h1>
				</div>

				<script src="webjars/jquery/3.4.0/jquery.min.js"></script>
				<script src="webjars/bootstrap/4.4.1-1</js/bootstrap.min.js"></script>
			</div>


		</div>
	</nav>






</body>
</html>