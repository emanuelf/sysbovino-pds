<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

	<link rel="stylesheet" href="css/bootstrap.min.css">
  	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	
	<base target="destino" />  
	
<title>Mastrinder - Sitema bovino</title>
</head>
<body>
 <div class="container-fluid">
	  	<div class="row">
	  		
	  	</div>
	  	<div class="row">
	  		<nav class="navbar navbar-default">
			  <div class="container">
			   		 <!-- Brand and toggle get grouped for better mobile display -->
			    <div class="navbar-header">
			      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
			        <span class="sr-only">Toggle navigation</span>
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			      </button>
			      <a class="navbar-brand" href="dashboard-resumo.jsp"><img alt="Mastrinder" src="img/mastrinder.png" style="height: 50px; width: 50px; margin-top: -12px;"> </a>
			    </div>	
			    <!-- Collect the nav links, forms, and other content for toggling -->
			    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			       
			      <ul class="nav navbar-nav navbar-center">
			        <li><a style="background-color: #D7EAFF" href="loteDashboard.jsp" class="active">Lote</a></li>
			        <li><a  style="background-color: #AED7AE" href="animalDashboard.jsp">Animal</a></li>
			        <li><a style="background-color: #FDF0D9" href="alimentacaoDashboard.jsp">Alimenta��o</a></li>
			        <li><a style="background-color: #FFEDED" href="medicamentoDashboard.jsp">Sa�de</a></li>
			        
			      </ul>
			    </div><!-- /.navbar-collapse -->
			  </div><!-- /.container-fluid -->
			</nav>
	  	</div>
	  	<div class="row">
				<iframe class="col-lg-12" src="dashboard-resumo.jsp" name="destino" style=" border: 0px; height: 600px;">
				</iframe>
			</div>
	  
	  </div>
</body>
</html>