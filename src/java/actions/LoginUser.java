
package actions;

import com.opensymphony.xwork2.Preparable;
import Dao.UserLoginDao;
import dto.UserRegistration;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

public class LoginUser implements Preparable, SessionAware {
    Map<String,Object> map;
    private String user_id;
    private String password;
    UserLoginDao uld;
    List <UserRegistration>list;
    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String callLoginUser()
    {
  
        String uname =uld.loginUser(this.user_id,this.password);
        
    if(uname!=null)
    {     map.put("userid",this.user_id); 
    map.put("username",uname);
        System.out.println("mapped susscec"+map.get("userid"));
    return "success";
 
    }
    else
    {
    return "error";}
    
    }

    @Override
    public void prepare() throws Exception {
      uld=new UserLoginDao();
   }

    @Override
    public void setSession(Map<String, Object> map) {
        this.map=map; }
}
