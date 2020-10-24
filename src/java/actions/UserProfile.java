package actions;
import com.opensymphony.xwork2.Preparable;
import Dao.UserLoginDao;
import Dao.UserProfileDao;
import dto.UserRegistration;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
public class UserProfile implements Preparable, SessionAware{
   Map<String,Object> map;
    UserProfileDao upd;
UserRegistration ur;
        

            
    public String callUserProfile()
    {
        
        String id =(String) map.get("userid");
        ur= upd.UserProfile(id);
    
    
    if(ur!=null)
        {map.put("Profile", ur);
            System.out.println("maqpppp su 11   "+ur);
            return "success";
        }
        else
        {
            return "failure";
        }
    
    
  }
 @Override
    public void prepare() throws Exception {
        upd=new UserProfileDao();
        ur=new UserRegistration();
    }

    @Override
    public void setSession(Map<String, Object> map) {
       this.map=map;
    }
}
