package actions;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import Dao.*;
import dto.*;
import java.util.Map;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.SessionAware;

public class UpdateUser extends HttpServlet implements Preparable,
      ModelDriven<UserRegistration> , SessionAware
 {
    HttpServletRequest req;
    UserProfileUpdateDao upu;
    UserRegistration  ur;
     Map<String,Object> map;
     

        public void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException
  { 

 ur= new UserRegistration(req.getParameter("password"), req.getParameter("user_name")
          ,req.getParameter("user_number"), req.getParameter("country")
          , req.getParameter("state"), req.getParameter("city"), req.getParameter("street")
          ,req.getParameter("house_number"),req.getParameter("gender")
          ,req.getParameter("user_relation"),Integer.parseInt(req.getParameter("age")));
      
  }
    public String callUpdateUser()
    {       boolean result = upu.saveUser(this.ur);
        
        if(result)
        {System.out.println("Ok update map");
           map.remove(ur);
           map.put("Profile", this.ur);
                   
                   //("Profile", this.ur);
            return SUCCESS;
        }
        else
        {
            return ERROR;
        }
    
    
    }

    @Override
    public void prepare() throws Exception {
  ur =new UserRegistration();
  upu=new UserProfileUpdateDao();
    }

    @Override
    public UserRegistration getModel() {
        return ur; }

    @Override
    public void setSession(Map<String, Object> map) {
    this.map=map;
    }
}
