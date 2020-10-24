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
      <title>Admin Home Page</title>
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
               <li><a href="HomePage.jsp">Logout</a></li>
               <li><a href="AddPost.jsp"> Add post</a><li>
             </ul>
           
           </s:div>
 
            <s:div id = "center" >
                <h1> All Corruption related post </h1>
           <table style="margin-left:100px; margin-right: 100px; background-color:#ccccff; font-size:20px;" border="1" cellspacing="0" cellpadding="10">
            
            <tr>
                        
                    <th>Post-id</th>        
                    <th>image</th>
                    <th>Description</th>
                    <th>Category_Id</th>
                    <th>Category_name</th>
                    <th>Post Date</th>
                    <th colspan="2">Operations</th>
                    
            </tr>  
            <s:iterator value ="data" >          
                  <tr>
                      
                      <td><s:property value="post_id"/></td>  
                      <td><img src ="<s:property value="image1"/>" width = "200px" height = "200px"/></td>
                      <td><s:property value="content"/></td>
                      <td><s:property value ="issuecategory.category_id"/></td>                      
                      <td><s:property value ="issuecategory.category_name"/></td>                      
                     
                      <td><s:property value ="date1"/></td>
                         <td>
                  <s:url action = "UpdatePost" id = "up">
                            
                          <s:param name = "post_id" value = "post_id"> </s:param>
                            
                       </s:url>    
                        <s:a href = "%{up}">Update</s:a>

                    </td>
                    
                    <td>
                                  <s:url action="DeletePost" id="ps">
                            <s:param name="post_id" value="post_id"></s:param>
                        </s:url>
                        <s:a href="%{ps}">Delete</s:a>
           
                    </td>
                  </tr>
                
            </s:iterator>          
                  
                    
                  <tr>
                      
                      <td colspan="5" align="center">
                    
                        <s:form action="">
                        
                          <s:submit value = "click to see more images"/>  
                            
                        </s:form>
                     
                      </td>
                      
                  </tr>
                  
                </table>
                   
            </s:div>
            
            <s:div id = "right" >
                <br>
                <br>
                <br>
                             <s:url action="ViewUser" id="ds">
                            
                        </s:url>
                        <s:a href="%{ds}">manage user</s:a>
           
                <a  href="ContentCategorywise.jsp" margin-top:100px style="font-size:20px;color: khaki;text-decoration:none">Search Content Catagorywise</a><br><br>
             <a  href="ContentDatewise.jsp" margin-top:100px style="font-size:20px;color:khaki;text-decoration:none">Search Content Datewise</a><br><br>
             <a  href="ViewReport.jsp" margin-top:100px style="font-size:20px;color:khaki;text-decoration:none">View Report</a><br><br>
             <a  href="Adminlogin.jsp" margin-top:100px style="font-size:20px;color:khaki;text-decoration:none">Create Admin</a><br><br>
            
             
           
            
            
            </s:div>
            <br style="clear: both">

            <s:include  value="CoreBlock/Footer.jsp"></s:include>  
       
        </s:div>    
        
    </body>

</html>
