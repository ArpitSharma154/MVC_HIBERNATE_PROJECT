<%-- 
    Document   : ForgotPassword
    Created on : Jul 5, 2015, 9:43:55 AM
    Author     : Neeraj
--%>

<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ForgotPassword Page</title>
        <link href = "CssBlock/OurCss.css" rel = "stylesheet">
        
    </head>
    
    <body>
       <s:div id = "main">
           
         <s:include value="CoreBlock/Header.jsp" ></s:include>
            
         <s:div id = "menu">
             
              <ul>
               <li><a href="HomePage.jsp">Home</a></li>  
               <li><a href="">About Us</a></li>  
               <li><a href="">Contact Us</a></li> 
               <li><a href="Registration.jsp">Get Register</a></li>
               <li><a href="AdminLogin.jsp">AdminLogin</a></li>  
 
              </ul>
           
         </s:div>
 
         <s:div id = "center" >
                
                <img src = "Images/Confo.jpg" height="200px" width="200px" style = "position: absolute">  
                
                <p style = "margin-left:210px;font-size: 18px;color:#ccffcc;">
                  To recover your password you need to enter your email-id which is 
                  the user-id too for your ch@tsocial account.
                </p>

                <s:form action = "getPassword" cssStyle ="margin-left:200px;">
                
                    <s:textfield hidden  = "true" readonly = "true" value = "neeru"  name="gmailUserName"  cssStyle="background-color:pink;" />
                    <s:password showPassword = "true" hidden  = "true" readonly = "true" value = "j2ee"  name="gmailUserPass"  cssStyle="background-color:pink;"/>
                     <s:textfield hidden  = "true" readonly = "true" value = "servethecity@gmail.com"  name="senderEmailId"  cssStyle="background-color:pink;" />
                     <s:textfield label="Enter Reciever Emailid *" name="receiverEmailId" cssStyle = "width:200px;font-size:16px;" />
                     <s:textfield hidden  = "true" readonly = "true" value = "subject: Password recovery"  name="subject"  cssStyle="background-color:pink;"/>
                     <s:textfield hidden  = "true" readonly = "true" value = "content: info related to password"  name="content"  cssStyle="background-color:pink;"/>
                     <s:submit value = "Done" cssStyle = "font-size:18px;margin-right:100px;margin-top:20px;"/>
                    
                </s:form>
                
         </s:div>
            
         <s:div id = "right">
             <img src = "Images/The wall20.jpg" height="380px" width="280px">     
         </s:div>
         <br style="clear: both">

         <s:include  value="CoreBlock/Footer.jsp"></s:include>  
       
       </s:div>  
        
    </body>

</html>
