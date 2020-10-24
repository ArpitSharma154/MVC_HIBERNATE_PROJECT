<!DOCTYPE html>
<%@taglib prefix="s"  uri = "/struts-tags" %>

    <head>
        <style>
                .tablewali { 
                            background-color:#3fb0ac;   
                            color:black;
                            text-align: center;
                            border-style:inline;
                            z-index:1000;
                            box-shadow:10px 10px 2px #292929;
                            font-style:Comic sans;
                            font-size: 20px;
                            padding: 20px;
                           }
</style>
        <!-- Mobile Specific Meta -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- Always force latest IE rendering engine -->
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!-- Meta Keyword -->
        <meta name="keywords" content="one page, business template, single page, onepage, responsive, parallax, creative, business, html5, css3, css3 animation">
        <!-- meta character set -->
        <meta charset="utf-8">

        <!-- Site Title -->
        <title>ONLINE COMPLAINT SYSTEM</title>
        
        <!--
        Google Fonts
        ============================================= -->
        <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700" rel="stylesheet" type="text/css">
		
        <!--
        CSS
        ============================================= -->
        <!-- Fontawesome -->
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <!-- Bootstrap -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <!-- Fancybox -->
        <link rel="stylesheet" href="css/jquery.fancybox.css">
        <!-- owl carousel -->
        <link rel="stylesheet" href="css/owl.carousel.css">
        <!-- Animate -->
        <link rel="stylesheet" href="css/animate.css">
        <!-- Main Stylesheet -->
        <link rel="stylesheet" href="css/main.css">
        <!-- Main Responsive -->
        <link rel="stylesheet" href="css/responsive.css">
		
		
		<!-- Modernizer Script for old Browsers -->
        <script src="js/vendor/modernizr-2.6.2.min.js"></script>
		
    </head>
	
    <body>
            <header  class="navbar-fixed-top" style=" background-color : rgb(0, 199, 252);">
                <div class="container">
                <div class="navbar-header">
                    <!-- responsive nav button -->
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <!-- /responsive nav button -->

                    <!-- logo -->
                    <h1 class="navbar-brand">
                        <a href="#body">
                            <img src="img/newlogo.png" alt="OCS" height="50" width="100">
                        </a>
                    </h1>
                    <!-- /logo -->

                    </div>

                    <!-- main nav -->
                    <nav class="collapse navigation navbar-collapse navbar-right" role="navigation">
                        <ul id="nav" class="nav navbar-nav">
                         <s:url action = "viewAllUser" id = "mu">
                         <s:param name = "" value = ""> </s:param>
                     </s:url>    
                     <s:a href = "%{mu}">&nbsp&nbsp&nbspManage User</s:a>

                     <a href="ContentCategorywise.jsp">&nbsp&nbsp&nbspsearch  categorywise </a>
                      
                     <a href="ContentDatewise.jsp">&nbsp&nbspsearch  datewise </a>
                     
                     <s:url action = "viewReport" id = "vr">
                         <s:param name = "" value = ""> </s:param>
                      </s:url>    
                      <s:a href = "%{vr}">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspView Reports</s:a>
  
                      <s:url action = "openCreateAdminPage" id = "ca">
                         <s:param name = "" value = ""> </s:param>
                      </s:url>    
                      <s:a href = "%{ca}">&nbsp&nbsp&nbspCreate Another Admin</s:a>   
                        </ul>
                    </nav>
                    <!-- /main nav -->
                </div>

            
        </header>
   
        <!--
        Fixed Navigation
        ==================================== -->
        
        <!--
        End Fixed Navigation
        ==================================== -->


        <!--
        Home Slider
        ==================================== -->
        <section id="portfolio" style="background-color:#fcfeff; margin-top:50px;margin-left:400px">
<form action="createAdmin">

                  Admin User_id <input type="email" width="150px" style="font-size:16px" required  name="admin_id" placeholder="Enter email">  
                   
                   <br><br>
        
                   Admin password<input type="password" width="150px" style="font-size:16px" required placeholder="Enter password" name="adminpassword">  
                   
                   <br><br>
                   
                   <input type="submit" value="Login" width="100px" style="font-size:18px" >
               
               </form>
        </section>
        <!--
        End #contact
        ========================== -->

        <!--
        #footer
        ========================== -->
        <footer id="footer" class="text-center">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">

                        <div class="footer-logo wow fadeInDown">
                            <img src="img/logo.png" alt="logo">
                        </div>

                        <div class="footer-social wow fadeInUp">
                            <h3>We are social</h3>
                            <ul class="text-center list-inline">
                                <li><a href="http://www.facebook.com"><i class="fa fa-facebook fa-lg"></i></a></li>
                                <li><a href="http://www.twitter.com"><i class="fa fa-twitter fa-lg"></i></a></li>
                                <li><a href="http://www.googleplus.com"><i class="fa fa-google-plus fa-lg"></i></a></li>
                             </ul>
                        </div>

                        <div class="copyright">
                           
                            <p>Developed by G-6</p>
                        </div>

                    </div>
                </div>
            </div>
        </footer>
        <!--
        End #footer
        ========================== -->


        <!--
        JavaScripts
        ========================== -->
        
        <!-- main jQuery -->
        <script src="js/vendor/jquery-1.11.1.min.js"></script>
        <!-- Bootstrap -->
        <script src="js/bootstrap.min.js"></script>
        <!-- jquery.nav -->
        <script src="js/jquery.nav.js"></script>
        <!-- Portfolio Filtering -->
        <script src="js/jquery.mixitup.min.js"></script>
        <!-- Fancybox -->
        <script src="js/jquery.fancybox.pack.js"></script>
        <!-- Parallax sections -->
        <script src="js/jquery.parallax-1.1.3.js"></script>
        <!-- jQuery Appear -->
        <script src="js/jquery.appear.js"></script>
        <!-- countTo -->
        <script src="js/jquery-countTo.js"></script>
        <!-- owl carousel -->
        <script src="js/owl.carousel.min.js"></script>
        <!-- WOW script -->
        <script src="js/wow.min.js"></script>
        <!-- theme custom scripts -->
        <script src="js/main.js"></script>
    </body>
</html>
