<%@taglib prefix="s" uri="/struts-tags"%>
<div id="menu">
    <ul>
               
        <li> <s:url action="ViewContent1" id="uh">
                <s:param name = "post_id" value = "post_id"> </s:param>
            </s:url>
            <s:a href="%{uh}">Home</s:a></li>
               <li><s:url action ="userProfile" id="up">
                   
               </s:url>
                    <s:a href="%{up}">Profile</s:a>
            </li>
                             
               <li><s:url action="ViewUserpost" id="vup">
               <s:param name = "user_id" value = "user_id"> </s:param></s:url>
                <s:a href="%{vup}">My Post</s:a>  </li>
                <li><a href="AddPost.jsp"> Add Post</a></li>
               <li style="margin-left: 70px" > Welcome   <s:property value="#session.username"></s:property> </li>
    </ul>
</div>  