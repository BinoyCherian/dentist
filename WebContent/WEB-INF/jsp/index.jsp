<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9" lang=""> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js" lang=""> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>Future Hospitals</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="apple-touch-icon" href="apple-touch-icon.png">

<!--         <link rel="stylesheet" href="assets/css/bootstrap.min.css"> -->
        <link href="<c:url value="/assets/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css" />
        <!--        <link rel="stylesheet" href="assets/css/bootstrap-theme.min.css">-->

		<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  		<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>		

		<script src="assets/js/bootstrap.min.js"></script>

        <!--For Plugins external css-->
        <link rel="stylesheet" href="assets/css/plugins.css" />

        <!--Theme custom css -->
        <link rel="stylesheet" href="assets/css/style.css">

        <!--Theme Responsive css-->
        <link rel="stylesheet" href="assets/css/responsive.css" />
        <link href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" rel="Stylesheet"></link>


		<script>
		
		$( function() {
		    var availableTags = ${locationList};
		    $( "#location" ).autocomplete({
		      source: availableTags
		    });
		  } );


// 		$( function() {
// 		    var availableTags = ${dentistJson};
// 		    $(availableTags).autocomplete({
// 		      source: availableTags
// 		    });
// 		  } );
		
		
// 		var json = ${dentistJson};
// 		alert("json[0]");
		
		
		</script>
        
    </head>
    <body>
        <!--[if lt IE 8]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->
		<div class='preloader'><div class='loaded'>&nbsp;</div></div>

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
                    <!-- <a class="navbar-brand" href="#"><img src="assets/images/logo.png" class="d-inline-block align-top" alt="Logo" />Future Hospital</a> -->
                    <a class="navbar-brand" href="#">
                        <img src="assets/images/logo.png" width="30" 
="30" class="d-inline-block align-top" alt="">
                        <span >Future Hospital</span>
                    </a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

                    <ul class="nav navbar-nav navbar-right">
                        <li class="active"><a href="#home">Home</a></li>
                        <li><a href="#aboutus">About us</a></li>
                        <!-- <li><a href="#">Contact</a></li> -->
                        <!-- <li class="login"><a href="#">Sign In</a></li> -->
                    </ul>

                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>

        <!--Home page style-->
        <header id="home" class="home">
            <div class="overlay-fluid-block">
                <div class="container text-center">
                    <div class="row">
                        <div class="home-wrapper">
                            <div class="col-md-10 col-md-offset-1">
                                <div class="home-content">

                                    <h1>YOUR HOME FOR HEALTH</h1>
                                    <p>Find and book</p>
   									

                                    <div class="container input-group home-contact">
                                            <div class="row align-items-center">
                                              <div class="col-md-4">
                                                  <div>
                                                    <input id="location" type="text" class="form-control" placeholder="location">
<!--                                                     <select> -->
<%--                                                			 <c:forEach items="${locationList}" var="item"> --%>
<%--     														<option value="${item}">${item}</option>       														<td>Employee ID: <c:out value="${item}"/></td> --%>
<%-- 													</c:forEach>	 --%>
<!-- 													</select> -->
                                                </div>
                                              </div>
                                              <div class="col-md-4">
                                                    <input type="text" class="form-control" placeholder="Search Specialties, Doctors..">
                                                    
                                              </div>
                                              <div class="col-md-4">
                                                    <input type="submit" class="form-control" value="Search">
                                              </div>
                                            </div>
                                          </div>
                                        <!-- <div class="col-md-6 col-md-offset-3 col-sm-12 col-xs-12">
                                            <div class="home-contact">
                                                <div class="input-group">
                                                    <input type="text" class="form-control" value="location">
                                                    <input type="text" class="form-control" placeholder="Search Specialties, Doctors..">
                                                    <input type="submit" class="form-control" value="Search">
                                                </div> /input-group -->


                                            </div> 
                                        </div>
                                    </div>


                                </div>
                            </div>
                        </div>
                    </div>
                </div>			
            </div>
        </header>

        <section class="empty" style="height:200px; width:100%">

        </section>
        <section id="aboutus" class="font">
            <div class="container">
                <div class="row section-aboutus" style="text-align:center">
                    <h2>ABOUT US</h2>
                    <p>We are a team of 5 members, who are:</p>
                    <ul class="list-group list">
                            <li class="list-group-item">Abdul</li>
                            <li class="list-group-item">Binoy</li>
                            <li class="list-group-item">Sushant</li>
                            <li class="list-group-item">Saurabh</li>
                            <li class="list-group-item">vinay</li>
                    </ul>
                </div>
            </div>
        </section>

        <section class="empty" style="height:200px; width:100%">
                
        </section>
		
		
		<div class="scrollup">
			<a href="#"><i class="fa fa-chevron-up"></i></a>
		</div>

        <script src="assets/js/plugins.js"></script>
        <script src="assets/js/main.js"></script>
    </body>
</html>
