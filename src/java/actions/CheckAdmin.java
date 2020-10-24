package actions;

import dto.AdminLogin;
import Dao.AdminDao;

import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.ModelDriven;


public class CheckAdmin implements Preparable,ModelDriven<Object>
{
   
   AdminLogin admin;

    public AdminLogin getAdmin() {
        return admin;
    }

    public void setAdmin(AdminLogin admin) {
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
  
  public String callCheckAdmin()
  {
     System.out.println("admin ka  id "+admin); 
     
     AdminLogin ad = AdminDao.authenticateAdmin(admin); 
     System.out.println("b ki value "+ad);
     
     if(ad == null)
     {
       return "failure";  
     }
     else
     {
       if(ad.getAdminpassword().equals(admin.getAdminpassword()))
       {
         return "success";  
       }
       else
       {
         return "failure";  
       }
     }
  }
}
