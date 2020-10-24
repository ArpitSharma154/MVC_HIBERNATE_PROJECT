package actions;

import dto.UserRegistration;
import Dao.AdminDao;

import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.ModelDriven;

import java.util.List;

public class ViewAllUser implements Preparable,ModelDriven<Object>
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
  
      
  public void prepare() throws Exception 
  {
    user = new UserRegistration();
  }
  
  public Object getModel() 
  {
    return user; 
  }
    
  public String callViewAllUser()
  {
    userlist = AdminDao.viewAll(); 
    
    System.out.println(userlist);
    
    if(userlist != null)
    {
      return "success";
    }  
    else
    {
      return "failure";  
    }
  }
}
