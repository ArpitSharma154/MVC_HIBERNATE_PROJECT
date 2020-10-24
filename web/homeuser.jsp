<!DOCTYPE html>
 <%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--[if lt IE 7]>      <html lang="en" class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html lang="en" class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html lang="en" class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en" class="no-js"> <!--<![endif]-->
           <%@taglib prefix="s" uri="/struts-tags" %>
   
 
        <!-- Mobile Specific Meta -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- Always force latest IE rendering engine -->
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!-- Meta Keyword -->
        <meta name="keywords" content="one page, business template, single page, onepage, responsive, parallax, creative, business, html5, css3, css3 animation">
        <!-- meta character set -->
        <meta charset="utf-8">

        <!-- Site Title -->
        <title>Online complaint form</title>
        
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
                            <img src="img/logo.png" alt="OCS" height="50" width="100">
                        </a>
                    </h1>
                    <!-- /logo -->

                    </div>

                    <!-- main nav -->
                    <nav class="collapse navigation navbar-collapse navbar-right" role="navigation">
                        <ul id="nav" class="nav navbar-nav">
                            <li class="current"><a href="index.html">Home</a></li>
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
         <section id="portfolio">

            <div class="section-title text-center wow fadeInDown" >
            <br><br>
 
            <s:div>

                
                <p style="alignment-adjust: central">
                   Welcome User.
                </p><br><br><br>  
                <form action="ViewCategorywise1" method="post">
                    <select name="category" required style = "font-size:20px;">
                        <option value="">Select category</option>
                        <option value="Garbage">Garbage</option>
                        <option value="Stray Animal">Stray Animal</option>
                        <option value="Road">Road</option>
                        <option value="Electricity">Electricity</option>
                        <option value="Corruption">Corruption</option>
               
                    </select>
                    &nbsp;<input type="submit" value="submit" style = "font-size:20px;">
                </form>

                <%-- <s:form action = "ViewCategorywise1">
                 <s:select name="category" cssStyle = "margin-left:521px;font-size:18px;" 
                           list="{'Select Issue','Garbage','Stray Animal','Road','Electricity','Corruption'}" ></s:select>
                    <s:submit value = "submit" cssStyle = "font-size:15px;"/>
                </s:form>--%>
            <br><br><br><br><br> <table style="margin-left: -200px; background-color:#ccccff; font-size:18px;" border="1" cellspacing="0" cellpadding="10">
            
            <tr>    <th>Post-id</th>        
                    <th>image</th>
                    <th>Description</th>
                     <th>User_Id</th>
                    <th>Category_name</th>
                    <th colspan="2">Operations</th>
                    
            </tr>  
            <s:iterator value ="data" >          
                  <tr>    
                      <td><s:property value="post_id"/></td>  
                      <td><img src ="<s:property value="image1"/>" width = "200px" height = 200px"/></td>
                      <td><s:property value="content"/></td>
                      <td><s:property value="user.user_id"/></td>
                      <td><s:property value ="issuecategory.category_name"/></td>                                           
                      <td>  <s:url action="AddComment" id="ps1">
                            <s:param name="post_id" value="post_id"></s:param>
                            </s:url>
                        <s:a href="%{ps1}">Comment</s:a>

                    </td>
                    
                    <td>
                                  <s:url action="ReportAbuse" id="rs">
                            <s:param name="post_id" value="post_id"></s:param>
                        </s:url>
                        <s:a href="%{rs}">Report Abuse</s:a>
           
                    </td>
                  </tr>
                
            </s:iterator>          
         
                </table>
        
            </s:div>
  <div id = "right" >
    <br><br>
      <form action = "index.jsp.html" method = "post" style = "alignment-adjust: central">
              
         <input type = "submit" value = "Logout">
         
      </form> 
                  
   
           
 </div>
      
                
                
                
              
             
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

