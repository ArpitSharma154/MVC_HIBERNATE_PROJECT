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
                              <li> <s:url action="ViewContent1" id="uh">
                <s:param name = "post_id" value = "post_id"> </s:param>
            </s:url>
            <s:a href="%{uh}">Home</s:a></li>
               <li><s:url action ="userProfile" id="up">
                   
               </s:url>
                    <s:a href="%{up}">Profile</s:a>
            </li>
                             
               <li><s:url action="ViewUserpost" id="vup">
               <s:param name = "user_id" value = "user_id"> </s:param></s:url>
                <s:a href="%{vup}">My Post</s:a>  </li>
                <li><a href="AddPost.jsp"> Add Post</a></li>   
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
        <section id="portfolio" style="background-color:#fcfeff">
            <br>
            <h2 style="margin-left:50px" >welcome  ,   <s:property value="#session.username"></s:property></h2>
             <table  style="background-color:#ccccff ; font-size:20px;"   border="1" > 
             <s:form action="AddComment" method="post">   
                     <s:iterator value ="list" >
                         <table style="margin-left: 500px ; margin-top: 50px">
                     <tr>  <td>Post</td>
                           <td><img src ="<s:property value="image1"/>" width = "100px" height = "100px"/></td>
                     </tr>
                    <tr >
                    <td >Post Id</td>
                    <td><input type="text"readonly="true" name="post_id" value="<s:property value="post_id"></s:property>" style="background:#ccccff "/>
                    </td>
                     </tr>

                     <tr>  <td>Date</td>
                           <td><s:property value ="date1"/></td>
                     </tr>
                      <tr>  
                           <td><sx:datetimepicker label="Date"  name="date" displayFormat="dd-MM-yyyy" required="true" /></td>
                     </tr>
                     <tr>  <td>Category Name</td>
                           <td><s:property value="issuecategory.category_name"></s:property></td>
                     </tr>
                                          
                     <tr>  
                         <td><s:textarea  label="Comment" name="comment" cols="20" rows="8" cssStyle="position:relative" /></td>
                     </tr>
                                        
                      <tr>
                           <td><s:submit name="submit" value="Add Comment" align="center" cssStyle="position:relative"/></td>
                       
                     </tr>
             </table>  
             </s:iterator>
               
                 </s:form>
                            
 
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
