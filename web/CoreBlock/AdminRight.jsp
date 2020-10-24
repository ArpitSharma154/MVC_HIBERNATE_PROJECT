<%@taglib prefix="s" uri="/struts-tags"%>
<s:div id = "right">
                    <br><br><br>
                     <s:url action = "viewAllUser" id = "mu">
                         <s:param name = "" value = ""> </s:param>
                     </s:url>    
                     <s:a href = "%{mu}">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspManage User</s:a><br><br>

                     <a href="ContentCategorywise.jsp">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspsearch  categorywise </a>
                      <br><br>
                     <a href="ContentDatewise.jsp">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspsearch  datewise </a>
                     <br> <br>
                     <s:url action = "viewReport" id = "vr">
                         <s:param name = "" value = ""> </s:param>
                      </s:url>    
                      <s:a href = "%{vr}">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspView Reports</s:a><br><br>
  
                      <s:url action = "openCreateAdminPage" id = "ca">
                         <s:param name = "" value = ""> </s:param>
                      </s:url>    
                      <s:a href = "%{ca}">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspCreate Another Admin</s:a><br><br>
  
            </s:div>
            <br style="clear: both">