
package actions;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import Dao.UserRegistrationDao;
import dto.*;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

public class RegisterUser extends ActionSupport implements Preparable,
      ModelDriven<UserRegistration> , SessionAware
{ 
    UserRegistration  ur;
    UserRegistrationDao urd;
     Map<String,Object> map;

    public UserRegistration getUr() {
        return ur;
    }

    public void setUr(UserRegistration ur) {
        this.ur = ur;
    }
    public String callSaveUser()
    {
        System.out.println("value of beans=="+ur.getUser_id());
        boolean result = urd.saveUser(this.ur);
        
        if(result)
        {
           
            return SUCCESS;
        }
        else
        {
            return ERROR;
        }
    }

    @Override
    public UserRegistration getModel() {
        return ur;
       
    }

    @Override
    public void setSession(Map<String, Object> map) {
    this.map=map;
    }

    @Override
    public void prepare() throws Exception {
        ur=new UserRegistration();
        urd=new UserRegistrationDao();
    }
}   

