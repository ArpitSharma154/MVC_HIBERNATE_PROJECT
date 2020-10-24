<%-- 
    Document   : ViewUser
    Created on : Jul 6, 2015, 11:31:44 AM
    Author     : Arpit
--%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>

  <head>
      
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <title>View UserProfile Page</title>
     <link href = "CssBlock/OurCss.css" rel = "stylesheet"> 
     
     <style>
         
         #center td
         {
           margin-left:350px;
           color:black;
           font-size:21px;
         }  
         
     </style>
     
  </head>
  
  <body>

    <s:div id = "main">
        
          
      <s:div id = "center">
          
        <img src = "Images/Confo.jpg" height="200px" width="200px" style = "position: absolute">  
        
        <pre style = "margin-left:210px;font-size: 18px;color: black; ">
                      <b> User Profile</b>
        </pre>               
        
        <table style="margin-left:330px; background-color:#ccccff; font-size:20px;" border="1" cellspacing="0" cellpadding="10">
            
            <tr>
              <td>User Name</td>  
              <td><s:property value = "user.user_name"></s:property></td>
            </tr>  
            
            <tr>
                
               <td>User Email-Id</td>  
               <td><s:property value = "user.user_id"></s:property></td> 
               
            </tr>
            
            <tr>
                
               <td>Password</td>  
               <td><s:property value = "user.password"></s:property></td> 
               
            </tr>
            
            <tr>
                
               <td>Contact No.</td>  
               <td><s:property value = "user.user_number"></s:property></td> 
               
            </tr>
            
            <tr>
                
               <td>Country</td>  
               <td><s:property value = "user.country"></s:property></td> 
               
            </tr>
            
            <tr>
                
               <td>State</td>  
               <td><s:property value = "user.state"></s:property></td> 
               
            </tr>
            
            <tr>
                
               <td>City</td>  
               <td><s:property value = "user.city"></s:property></td> 
               
            </tr>
            
            <tr>
                
               <td>Street</td>  
               <td><s:property value = "user.street"></s:property></td> 
               
            </tr>
            
            <tr>
                
               <td>House Number</td>  
               <td><s:property value = "user.house_number"></s:property></td> 
               
            </tr>
            
            <tr>
                
               <td>Gender</td>  
               <td><s:property value = "user.gender"></s:property></td> 
               
            </tr>
            
                        
            <tr>
                
               <td>Age</td>  
               <td><s:property value = "user.age"></s:property></td> 
               
            </tr>
                                    
            <tr>
                
               <td>UserRelation</td>  
               <td><s:property value = "user.user_relation"></s:property></td> 
               
            </tr>
            
        </table><br>
        
      </s:div>
        
        
    </s:div>  
      
  </body>

</html>
