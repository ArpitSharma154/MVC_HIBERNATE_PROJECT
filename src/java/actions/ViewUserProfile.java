package actions;

import dto.*;
import Dao.AdminDao;

import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.ModelDriven;

import java.util.List;

public class ViewUserProfile implements Preparable,ModelDriven<Object>
{
    
  List<UserRegistration> userlist;

  public List<UserRegistration> getUserlist() 
  {
    return userlist;
  }
  public void setUserlist(List<UserRegistration> userlist) 
  {
    this.userlist = userlist;
  }
  
  UserRegistration user;

  public UserRegistration getUser() 
  {
    return user;
  }
  public void setUser(UserRegistration user) 
  {
    this.user = user;
  }
  
  public void prepare()
  {
    user = new UserRegistration();
  }
  public Object getModel()
  {
    return user;  
  }
  
  public String callViewUserProfile()
  {
     System.out.println("user_id "+user.getUser_id());

     user = AdminDao.viewProfile(user.getUser_id());
     
     System.out.println("list dnncnl "+user);
     
     if(user != null)
     {
       return "success";  
     }
     else
     {
       return "failure";  
     }
  }
}
