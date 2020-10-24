package actions;

import dto.*;
import Dao.AdminDao;

import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.ModelDriven;

public class DeleteUser implements Preparable,ModelDriven<Object>
{
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
  
  public String callDeleteUser()
  {
    System.out.println(" user = "+user);
    
    boolean b = AdminDao.deleteUserProfile(user.getUser_id());
    
    System.out.println("b in delete"+b);
    
    if(b)
    {
      return "success";  
    }
    else
    {
       return "false";    
    }
  }
}
