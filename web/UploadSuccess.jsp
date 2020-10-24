<%-- 
    Document   : Success
    Created on : 4 Jul, 2015, 2:57:35 PM
    Author     : Arpit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    
    <body>
        Uploaded File Details are:
        <br>
       PATH: <s:property value="myFile" />
       NAME: <s:property value="myFileFileName" />
       Content Type: <s:property value="myFileContentType" />
    </body>
</html>
