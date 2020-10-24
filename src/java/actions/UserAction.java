package actions;

import Dao.UserDao;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import dto.UserRegistration;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author arpitsharma
 */
public class UserAction extends ActionSupport implements
        Preparable , ModelDriven<UserRegistration> , 
        SessionAware
{
    UserRegistration us;
    UserDao ts;
    List<UserRegistration> user;
    Map<String, Object> map;

    public UserRegistration getUs() {
        return us;
    }

    public void setUs(UserRegistration us) {
        this.us = us;
    }

   
    public UserDao getTs() {
        return ts;
    }

    public void setTs(UserDao ts) {
        this.ts = ts;
    }

    public List<UserRegistration> getUser() {
        return user;
    }

    public void setUser(List<UserRegistration> user) {
        this.user = user;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
    
    public String callGetUser()
    {
        user = ts.getUser();
        
         if(user!=null)
         {
             return "success";
         }
         else
         {
             return "failure";
         }  
    }
    public String callDeleteUser()
    {
        boolean result = ts.deleteUser(us.getUser_id());
        
        if(result)
        {
            return "success";
        }
        else
        {
            return "failure";
        }
    }
            public String callProfile()
        {
            us = ts.UserProfile(us.getUser_id());
            if(us!=null)
             {
                 return "success";
             }
             else
             {
                 return "failure";
             }  

        }

    
    

    
    
    
    
    
    @Override
    public void prepare() throws Exception {
        us =  new UserRegistration();
        ts = new UserDao();
    }

    @Override
    public UserRegistration getModel() {
        return us;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.map = map;
    }
}