<%-- 
    Document   : mail_success.jsp
    Created on : 2 Jul, 2015, 7:36:56 PM
    Author     : Arpit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
    
    <body>
        Mail has been sent to...
        <br>
        <s:property value="receiverEmailId" />
        <br>
        From...
        <br>
         <s:property value="senderEmailId" />
    </body>
</html>
