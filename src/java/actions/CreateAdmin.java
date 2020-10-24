package actions;

import dto.AdminLogin;
import Dao.AdminDao;

import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.ModelDriven;

public class CreateAdmin implements Preparable, ModelDriven<Object>
{
  AdminLogin admin;  
  
  public AdminLogin getAdminLogin()
  {
    return admin;    
  }
  
  public void setAdminLogin(AdminLogin admin)
  {
    this.admin = admin;  
  }
  
  @Override
  public void prepare()
  {
    admin = new AdminLogin();   
  }
  
  @Override
  public Object getModel()
  {
    return admin;  
  }
  
  public String callCreateAdmin()
  {
    System.out.println(admin);  
    boolean b = AdminDao.insertAdmin(admin);
    
    if(b)
    {
      return  "success";  
    }
    else
    {
      return "failure";  
    }
  }
}
