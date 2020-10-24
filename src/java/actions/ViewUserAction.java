package actions;

import Dao.UserDao;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import dto.Data_Table;
import dto.UserRegistration;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author arpitsharma
 */
public class ViewUserAction extends ActionSupport implements Preparable,ModelDriven<Data_Table>, SessionAware
{
    UserRegistration us;
    Data_Table ds;
    UserDao ts;
    List<Data_Table> data;
    Map<String, Object> map;

    public UserRegistration getUs() {
        return us;
    }

    public void setUs(UserRegistration us) {
        this.us = us;
    }

    public Data_Table getDs() {
        return ds;
    }

    public void setDs(Data_Table ds) {
        this.ds = ds;
    }

    public UserDao getTs() {
        return ts;
    }

    public void setTs(UserDao ts) {
        this.ts = ts;
    }

    public List<Data_Table> getData() {
        return data;
    }

    public void setData(List<Data_Table> data) {
        this.data = data;
    }
    
    public String callUserPost()
    {
    //String user = ds.setUser(us.setUser_id("arpitsharma154@gmail.com"));
     //  us.setUser_id("sp@gmail.com");
         System.out.println("  vvvv ");
         Object id = map.get("userid");
         System.out.println("user id  :"+map.get(id));        
     // UserRegistration ur1=new UserRegistration((String) id);
        us.setUser_id((String) id);
     
     String user = us.getUser_id();
     data = ts.getUserPost(user);
     System.out.println("the data in call user post list"+data);
     
     return "success";
    }
    
    @Override
    public void prepare() throws Exception 
    {
        ds = new Data_Table();
        ts = new UserDao();
        us = new UserRegistration();
    }

    
    
    @Override
    public Data_Table getModel() 
    {
        return ds;
    }

    @Override
    public void setSession(Map<String, Object> map)
    {
    this.map=map;
    
    }
    
}
