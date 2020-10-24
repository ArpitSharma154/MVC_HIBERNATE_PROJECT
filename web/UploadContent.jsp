<%-- 
    Document   : AddComment
    Created on : Jul 5, 2015, 5:36:18 AM
    Author     : Arpit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s"  uri = "/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <sx:head />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
          <%@taglib prefix="s" uri="/struts-tags" %>
        <link href="CssBlock/OurCss.css" rel="stylesheet">
    </head>
    <body>
        
        <s:div id="main">
        
            <s:include value="CoreBlock/Header.jsp"></s:include>
            <s:include value="CoreBlock/Menu.jsp"></s:include>
       
         <s:div id="center" ></s:div>
         <s:submit value="Logout" cssStyle="margin:right;color:Black;font: bold normal normal large monospace;background-color:#009966;margin-top:5px;margin-right:5px;"></s:submit>
         <s:label    cssStyle="margin-left:480px;font-size:22px;" value="ADD A POST"/>
        
         <s:div   cssStyle="margin-left:400px;margin-right:20px;font-size:18px;"> 
        
              
             <s:form action="imageUpload" enctype="multipart/form-data" method="post" cssStyle="color=#ffccc">
                  
            <s:file name="myFile" label="Select Image" />
            
           
            
            <s:select  label="Category " name = "category" cssStyle = "margin-left:0px;font-size:18px;"  
                 list="{'Select Issue','Garbage','Stray Animal','Road','Electricity','Corruption'}" ></s:select>
            <p><sx:datetimepicker label="Date"  name="date1" displayFormat="dd-MM-yyyy" required="true" /></p>
             <p> <s:textarea label="Discription" name="content" cols="20" rows="10" cssStyle="position:relative" />
           </p><p><s:submit name="submit" value="Add Post" align="center" cssStyle="position:relative"/>
          </p></s:form>
                            
 
          </s:div>
          <s:include value="CoreBlock/Footer.jsp"></s:include>   
        </s:div>
      </body>
       
</html>
