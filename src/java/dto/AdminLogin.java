
package dto;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table (name = "AdminLogin")

public class AdminLogin
{
  @Id
  @Column
  private String admin_id;
  
  @Column
  private String adminpassword;
  
  public AdminLogin()
  {
      
  }
  public AdminLogin(String admin_id,String adminpassword) 
  {
   this.admin_id = admin_id;
   this.adminpassword = adminpassword;
  }

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword;
    }

public String toString()
{
    return (admin_id+" "+adminpassword);
}
}
