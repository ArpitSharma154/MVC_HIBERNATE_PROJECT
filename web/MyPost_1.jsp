<!DOCTYPE html>
<!--[if lt IE 7]>      <html lang="en" class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html lang="en" class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html lang="en" class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en" class="no-js"> <!--<![endif]-->
    
<%@taglib prefix="s"  uri = "/struts-tags" %>

    <head>
        <style>
.tablewali{
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
                            <li class="current"><a href="index.jsp.html">Home</a></li>
                            <li><a href="#portfolio">SERVICES</a></li>
                            <li><a href="#about">About us</a></li>   
                            <li><a href="#contact">Contact us</a></li>
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
        <section id="portfolio" background-color:#fae596">
            <br><br><br>
            <h2  style="margin-left:550px" >VIEW POST</h2>   
                        <br><br><br>  
                <center>
    <s:iterator value ="data" >          
           <table class='tablewali' border='0px' width='50%'>
<tr>
    <td><br></td>
</tr>               
                <tr>
                    <td>
                          User name :<s:property  value="user.user_name"/>
</td>

<td>
    Category :<s:property value ="issuecategory.category_name"/>
</td>
<td>
    Date :<s:property value ="date1"/>
</td>

</tr>
<tr>
    <td></td>
</tr>
<tr>
    <td><br></td>
</tr>
</table>

<table class='tablewali' border='0px' width='50%'> 
<tr>
<td>
    Location :<s:property value ="location"/>
</td>



</tr>
<tr>
    <td><br></td>
</tr>
</table>

<table width='50%' class='tablewali' border='0px'>
<tr>
<td>
    Description : <s:property value="content"/>
</td>

</tr>
<tr>
    <td><br></td>
</tr>
</table>

<table class='tablewali' width='50%'>
<tr>
</tr>
<tr>
    <td><img style="margin-left:10px" src ="<s:property value="image1"/>" width = "500px" height = "250px"/></td>
                    
</tr>
<tr>
    <td></td>
</tr>
<tr>
    <td><br></td>
</tr>
</table>
    
<table class="tablewali" width='50%'>  
    <tr>
        <td><s:url action="AddComment" id="ps1">
                <s:param name="post_id" value ="post_id"></s:param>
            </s:url>
            <s:a href="%{ps1}">comment</s:a>
            </td>
    <td><s:url action="ReportAbuse"  id="rs">
                <s:param name="post_id" value ="post_id"></s:param>
            </s:url>
    <s:a href="%{rs}">Report Abuse</s:a>
        
            </td></tr>
    <tr>
    <td><br></td>
</tr>
</table>
<br><br><br>
</s:iterator>

</center>
            
            </div>  
              
            </div> <!-- end #projects -->

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
                           
                            <p>Developed by Arpit Sharma</p>
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
