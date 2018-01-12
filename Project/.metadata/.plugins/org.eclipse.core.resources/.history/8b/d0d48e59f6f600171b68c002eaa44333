<%@page contentType="text/html" pageEncoding="UTF-8"%>
   <!DOCTYPE HTML>
    <html lang="en">
    <head>
    <meta charset="utf-8">
    <title>TGN - The Game Nation</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    
    <link href="css/loginForm.css" rel="stylesheet">
    <link href="css/font-awesome.css" rel="stylesheet">

    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <link rel='stylesheet' id='prettyphoto-css'  href="css/prettyPhoto.css" type='text/css' media='all'>
    <link href="css/fontello.css" type="text/css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Quattrocento:400,700' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Patua+One' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
    <style>
    body {
        padding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */
    }
    </style>
    <link href="css/bootstrap-responsive.css" rel="stylesheet">
    <link rel="shortcut icon" href="img/favicon.ico">
    
    <script type="text/javascript" src="js/validator.js"></script>
    
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/jquery.scrollTo-1.4.2-min.js"></script>
    <script type="text/javascript" src="js/jquery.localscroll-1.2.7-min.js"></script>
    <script type="text/javascript" charset="utf-8">
          $(document).ready(function(){
            $("a[rel^='prettyPhoto']").prettyPhoto();
          });
        </script>
    </head>
    
    <body>
	    <div class="navbar-wrapper">
      <div class="navbar navbar-inverse navbar-fixed-top">
        <div class="navbar-inner">
          <div class="container">
            <!-- Responsive Navbar Part 1: Button for triggering responsive navbar (not covered in tutorial). Include responsive CSS to utilize. -->
            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </a>
            <h1 class="brand"><a href="index.jsp">TGN - The Game Nation</a></h1>
            <!-- Responsive Navbar Part 2: Place all navbar contents you want collapsed withing .navbar-collapse.collapse. -->
            <nav class="pull-right nav-collapse collapse">
              <ul id="menu-main" class="nav">
                
                <li><a title="portfolio" href="index.jsp">Home</a></li> <!-- this will be 3 most recent or something... -->
                
                <li><a title="services" href="topics.jsp">All topics</a></li>
                
     			<% if ((session.getAttribute("email") != null) && (((String) session.getAttribute("email")).compareTo("")!=0)) { %>           
               		<li><a title="team" href="account.jsp">Account</a></li>
                <% } %>
                
                <% if ((session.getAttribute("email") == null) || (((String) session.getAttribute("email")).compareTo("")==0)) { %>
					<li><a title="login" href="login.jsp">Login</a></li>
				<%} else { %>
					<li><a title="logout" href="logout.jsp">Logout</a></li>
				<%} %>
				              
              </ul>
            </nav>
          </div>
        </div>
      </div>
    </div>