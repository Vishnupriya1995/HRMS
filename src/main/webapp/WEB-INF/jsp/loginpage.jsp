<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

	<style>
*, *:before, *:after {
	box-sizing: border-box;
}

html {
	overflow-y: scroll;
}

body {
	background: #c1bdba;
	font-family: 'Titillium Web', sans-serif;
}

a {
	text-decoration: none;
	color: #1ab188;
	transition: .5s ease;
}

a:hover {
	color: #179b77;
}

.form {
	background: rgba(19, 35, 47, 0.9);
	padding: 40px;
	max-width: 500px;
	margin: 40px auto;
	border-radius: 4px;
	box-shadow: 0 4px 10px 4px rgba(19, 35, 47, 0.3);
}

.tab-group {
	list-style: none;
	padding: 0;
	margin: 0 0 40px 0;
}

.tab-group:after {
	content: "";
	display: table;
	clear: both;
}

.tab-group li a {
	display: block;
	text-decoration: none;
	padding: 15px;
	background: rgba(160, 179, 176, 0.25);
	color: #a0b3b0;
	font-size: 20px;
	float: left;
	width: 50%;
	text-align: center;
	cursor: pointer;
	transition: .5s ease;
}

.tab-group li a:hover {
	background: #179b77;
	color: #ffffff;
}

.tab-group .active a {
	background: #1ab188;
	color: #ffffff;
}

.tab-content>div:last-child {
	display: none;
}

h1 {
	text-align: center;
	color: #ffffff;
	font-weight: 300;
	margin: 0 0 40px;
}

label {
	position: absolute;
	-webkit-transform: translateY(6px);
	transform: translateY(6px);
	left: 13px;
	color: rgba(255, 255, 255, 0.5);
	transition: all 0.25s ease;
	-webkit-backface-visibility: hidden;
	pointer-events: none;
	font-size: 22px;
}

label .req {
	margin: 2px;
	color: #1ab188;
}

label.active {
	-webkit-transform: translateY(50px);
	transform: translateY(50px);
	left: 2px;
	font-size: 14px;
}

label.active .req {
	opacity: 0;
}

label.highlight {
	color: #ffffff;
}

input, textarea {
	font-size: 22px;
	display: block;
	width: 100%;
	height: 50%;
	padding: 5px 10px;
	background: none;
	background-image: none;
	border: 1px solid #a0b3b0;
	color: #ffffff;
	border-radius: 0;
	transition: border-color .25s ease, box-shadow .25s ease;
}

input:focus, textarea:focus {
	outline: 0;
	border-color: #1ab188;
}

textarea {
	border: 2px solid #a0b3b0;
	resize: vertical;
}

.field-wrap {
	position: relative;
	margin-bottom: 40px;
}

.top-row:after {
	content: "";
	display: table;
	clear: both;
}

.top-row>div {
	float: left;
	width: 48%;
	margin-right: 4%;
}

.top-row>div:last-child {
	margin: 0;
}

.button {
	border: 0;
	outline: none;
	border-radius: 0;
	padding: 15px 0;
	font-size: 1.2rem;
	font-weight: 600;
	text-transform: uppercase;
	letter-spacing: .1em;
	background: #1ab188;
	color: #ffffff;
	transition: all 0.5s ease;
	-webkit-appearance: none;
}

.button:hover, .button:focus {
	background: #179b77;
}

.button-block {
	display: block;
	width: 100%;
}

.forgot {
	margin-top: -20px;
	text-align: right;
}
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>
	<div class="form">


		<div>


			<div id="login">
				<h1>Welcome Back!</h1>
				<form action="validate" method="get">
				<!-- 	<div class="field-wrap">
						<label> User Name<span class="req">*</span>
						</label> <input name="id" type="text"/>
					</div>

					<div class="field-wrap">
						<label> Password<span class="req">*</span>
						</label> <input type="password" />
					</div>
					
					<button class="button button-block" />
					Log In
					</button>

				</form> -->
				<form:form action="valiadte" modelAttribute="Employee">
				<div class="field-wrap">
						<label> User Name<span class="req">*</span>
						</label> <form:input path="empNo"/>
						<form:errors path="empNo" cssClass="error" />
					</div>
				<div class="field-wrap">
						<label> Password<span class="req">*</span>
						</label> <form:input path="firstName"/>
						<form:errors path="firstName" cssClass="error" />
					</div>
					
					<button class="button button-block" />
					Log In
					</button>
				</form:form>


			</div>

		</div>
		<!-- tab-content -->

	</div>
	<!-- /form -->

</body>
</html>
