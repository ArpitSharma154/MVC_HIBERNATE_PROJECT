package actions;

import Dao.UserDao;

import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.ModelDriven;
import dto.UserRegistration;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

public class CheckUser implements Preparable,ModelDriven<Object> ,SessionAware 
{
   
    UserRegistration ur;
   UserDao ts;
   List<UserRegistration> ad;
    Map<String, Object> map;

    public UserDao getTs() {
        return ts;
    }

    public void setTs(UserDao ts) {
        this.ts = ts;
    }

    public List<UserRegistration> getAd() {
        return ad;
    }

    public void setAd(List<UserRegistration> ad) {
        this.ad = ad;
    }

    public UserRegistration getUr() {
        return ur;
    }

    public void setUr(UserRegistration ur) {
        this.ur = ur;
    }
   

    @Override
  public void prepare()
  {
    
    ur=new UserRegistration();
    ts = new UserDao();
            
  }
    @Override
  public Object getModel()
  {
    return ur;  
  }
  
  public String callCheckUser()
  {
      ur.setUser_id("sp@gmail.com");
      ur.setPassword("123");
     System.out.println("admin ka  id "+ur.getUser_id()); 
      System.out.println("admin ka pass"+ur.getPassword());
     UserRegistration a  = ts.authenticateUser(ur);
      
      if(a.getUser_id().equals(ur.getUser_id())&&(a.getPassword().equals(ur.getPassword())))
     {
         
         System.out.println("sabkch sahi sahi :" +ur.getUser_id());
         System.out.println(" pass :"+ur.getPassword());
         
          map.put("userid",this.ur);    
        System.out.println("mapped susscec"+map.get("userid"));
         return "success"; 
     }
     else
     {
       return "failure";  
     }
  }

    @Override
    public void setSession(Map<String, Object> map) {
   this.map=map;
    }
}
