<%-- 
    Document   : AdminWelcomePage
    Created on : Jul 5, 2015, 10:30:15 AM
    Author     : Arpit
--%>
<%@taglib prefix="s"  uri = "/struts-tags" %>
<!DOCTYPE html>
<html>

    <head>

      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>DateWise  Page</title>
      <link href = "CssBlock/OurCss.css" rel = "stylesheet">
      
    </head>

    <body>

        <s:div id = "main">
           
            <s:include value="CoreBlock/Header.jsp" ></s:include>
            
            <s:include value = "CoreBlock/AdminAfterLoginMenu.jsp"></s:include>
            
            <s:div id = "center" >
                <h1> All Datewise related post </h1>
            
                <table style="margin-left:5px; margin-right: 100px; background-color:#ccccff; font-size:18px;" border="1" cellspacing="0" cellpadding="10">
            
            <tr>
                        
                    <th>Post-id</th>        
                    <th>user-id</th>
                    <th>image</th>
                    <th>Description</th>
                    <th>Category_Id</th>
                    <th>Post Date</th>
                    <th>Category Name</th>
                  </tr>  
           <s:iterator value ="data" >          
          
                  <tr>
                      
                      <td><s:property value="post_id"/></td>  
                      <td><s:property value="user.user_id"/></td>  
                      <td><img src ="<s:property value="image1"/>" width = "200px" height = "200px"/></td>
                      <td><s:property value="content"/></td>
                      <td><s:property value ="issuecategory.category_id"/></td>
                      <td><s:property value ="date1"/></td>
                       <td><s:property value ="issuecategory.category_name"/></td>
                       </tr>
                  
                    
               </s:iterator>          
                  
                </table><br>
                   
            </s:div>
            
            <s:include  value = "CoreBlock/AdminRight.jsp"></s:include>  
            
            <s:include  value="CoreBlock/Footer.jsp"></s:include>  
       
        </s:div>    
        
    </body>

</html>
