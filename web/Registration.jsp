<%-- 
    Document   : Register
    Created on : Jul 7, 2015, 6:49:57 PM
    Author     : Arpit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@taglib prefix="s" uri="/struts-tags" %>  
        <link href="CssBlock/OurCss.css" rel="stylesheet">
        <title>User Registration</title>
        
        <style>
            
          input
          {
            size: 30px;  
            font-size:16px;
          }
            
        </style>
        
    </head>
    
      <body>  
        <s:div id="main">
        
            <s:include value="CoreBlock/Header.jsp"></s:include>
           
            <s:div id = "menu">
                
             <marquee style = "color:white;font-size:18px; margin-top: 5px; ">Our City Our Responsibility</marquee>

            </s:div>
           
            <s:div id = "center">
               
                    <h1 style="color:blue; margin-left:100px;" align = "center">Registration Form</h1><br>

                   <form action = "UserRegistration" method = "post" style=" margin-left:400px; margin-right: 500px;">

                          <input type = "text" name = "user_name" required placeholder="Enter Full Name" ><br><br>
                          <input type = "email" name = "user_id" required placeholder="Enter Email-Id" ><br><br>
                          <input type = "password" name = "password" required placeholder="Enter Passowrd" ><br><br>
                          <input type = "text" name = "user_number" required placeholder="Enter Mobile No." ><br><br>
                          <input type = "text" name = "age" required placeholder = "Enter Age"><br><br>    
                          <input type = "radio" class="gender" name = "gender"  checked="checked">Male
                          <input type = "radio" class = "gender" name = "gender" >Female<br><br>
                          <input type = "text" name = "country" required placeholder = "Enter Country"><br><br>                    
                          <input type = "text" name = "state" required placeholder = "Enter State"><br><br>                      
                          <input type = "text" name = "city" required placeholder = "Enter City"><br><br>
                          <input type = "text" name = "street" required placeholder = "Enter Street"><br><br> 
                          <input type = "text" name = "houser_number" required placeholder = "Enter House No."><br><br>
                          <input type = "text" name = "user_relation" required placeholder = "User Relation"><br><br>
                          <input type = "submit" value = "Register" >
                      </form><br>   
            
            </s:div>
       
        <s:include value = "CoreBlock/BeforeLoginRight.jsp"></s:include>       
        
        <s:include value="CoreBlock/Footer.jsp"></s:include>   
  
   </s:div>
 </body> 
 </html>
      