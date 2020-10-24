<%-- 
    Document   : user
    Created on : Jul 5, 2015, 12:02:09 AM
    Author     : Ravi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <%@taglib prefix="s" uri="/struts-tags" %>
        <link href="CssBlock/OurCss.css" rel="stylesheet">
        <title>User's Profile</title>
        
    </head>
    <body>
        
        <s:div id="main">
        
            <s:include value="CoreBlock/Header.jsp"></s:include>
         
            <s:include value="CoreBlock/Menu.jsp"></s:include>
        
            <s:div id="center">
            
             <h1 style="margin-left: 300px ;font-size: 40px; color:black ; margin-top: 30px;"> User  Profile</h1>
            
             <s:form action="userUpdate" method="post">
             <table style="color: black; font-size:20px;margin-left: 250px;margin-top:-200px; " cellpadding="8px" >
                <tr >
                    <td >User Id</td> <td><input type="text"readonly="true" name="user_id" value="<s:property value="#session.Profile.user_id"></s:property>" style="background: wheat"/>
                    </td></tr>
                    <br>
                    <td> Name </td> <td><input type="text" readonly="true" name="user_name" value="<s:property value="#session.Profile.user_name"></s:property>"style="background: wheat">
                </td></tr><br>
                <td> Password </td> <td><input type="password"  name="password" value="<s:property value="#session.Profile.password"></s:property>"style="background: wheat">
                </td></tr><br>
         
                <td> Age </td> <td><input type="text" name="age" value="<s:property value="#session.Profile.age"></s:property>"style="background: wheat">
               </td></tr><br>
             <td>Gender </td> <td><input type="text" name="gender" readonly="true" value="<s:property value="#session.Profile.gender"></s:property>"style="background: wheat">
              </td></tr>  <br>
             <td>Mobile Number </td> <td><input type="text" name="user_number" value="<s:property value="#session.Profile.user_number"></s:property>"style="background: wheat">
              </td></tr>  <br>
             <td>House Number </td> <td><input type="text" name="house_number" value="<s:property value="#session.Profile.house_number"></s:property>"style="background: wheat">
              </td></tr>  <br>
             <td>Street </td> <td><input type="text" name="street" value="<s:property value="#session.Profile.street"></s:property>"style="background: wheat">
              </td></tr>  <br>
             <td>City </td> <td><input type="text" name="city" value="<s:property value="#session.Profile.city"></s:property>"style="background: wheat">
              </td></tr>  <br>
             <td>State </td> <td><input type="text"  name="state" value="<s:property value="#session.Profile.state"></s:property>"style="background: wheat">
              </td></tr>  <br>
             <td>Country </td> <td><input type="text" name="country" value="<s:property value="#session.Profile.country"></s:property>"style="background: wheat">
              </td></tr>  <br>
             <td>Profession </td> <td><input type="text" name="user_relation" value="<s:property value="#session.Profile.user_relation"></s:property>"style="background: wheat">
              </td></tr>  <br>
                
              <tr>
                <td><input type="submit" value="Update"></td></s:form>
              </tr>
           </table>
            </s:div>
    
             <div id = "right" >
    
      <form action = "HomePage.jsp" method = "post" style = "margin-left:120px;">
              
         <input type = "submit" value = "Logout">
         
      </form> 
                  
      <br><br><a href = "www.cricinfor.com" style="margin-top:5px; "><img src = "Images/The wall20.jpg" height="340px" width="289px"></a>             
           
      </div>
       

        <br style="clear: both">
        <s:include value="CoreBlock/Footer.jsp"></s:include>   
        
       
        </s:div>
       
       
 
    </body>
</html>
