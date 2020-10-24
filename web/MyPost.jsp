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
      <title>JSP Page</title>
      <link href = "CssBlock/OurCss.css" rel = "stylesheet">
     
    </head>

    <body>

        <s:div id = "main">
           
            <s:include value="CoreBlock/Header.jsp" ></s:include>
            
            <s:div id = "menu">
              <s:include value="CoreBlock/Menu.jsp" ></s:include>
             
            </s:div>
 
            <s:div id = "center" >
            
                <img src = "Images/Confo.jpg" height="160px" width="180px" style = "position: absolute">  
                
                <pre style = "margin-left:210px;font-size: 18px;color: black; ">
                   Welcome User.
                </pre>  
                <s:form action = "ViewCategorywise1">
                 <s:select name="category" cssStyle = "margin-left:521px;font-size:18px;" 
                           list="{'Select Issue','Garbage','Stray Animal','Road','Electricity','Corruption'}" ></s:select>
                    <s:submit value = "submit" cssStyle = "font-size:15px;"/>
                </s:form><br><br>
            <table style="margin-left:5px; margin-right: 100px; background-color:#ccccff; font-size:18px;" border="1" cellspacing="0" cellpadding="10">
            
            <tr>
                        
                    <th>Post-id</th>        
                    <th>image</th>
                    <th>Description</th>
                    <th>Category_Id</th>
                    <th>Category_name</th>
                    <th>Post Date</th>
                    <th>location</th>
                  
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
                      <td><s:property value ="location"/></td>
                    
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
                  
                  
                </table>
                   
        
            </s:div>
            
            <div id = "right" >
    
      <form action = "HomePage.jsp" method = "post" style = "margin-left:120px;">
              
         <input type = "submit" value = "Logout">
         
      </form> 
                  
    <br><br><a href = "www.cricinfor.com" style="margin-top:5px; "><img src = "Images/The wall20.jpg" height="340px" width="289px"></a>             
           
 </div>

            <br style="clear: both">

            <s:include  value="CoreBlock/Footer.jsp"></s:include>  
       
        </s:div>    
        
    </body>

</html>
