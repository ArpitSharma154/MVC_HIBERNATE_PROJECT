
package actions;


import Dao.Datadao;
import Dao.UserDao;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.util.ResolverUtil;
import dto.Data_Table;
import dto.Response;
import dto.UserRegistration;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Date;


public class SaveComment extends ActionSupport implements
        Preparable , ModelDriven<Response> , 
        SessionAware
{ 
    String comment;
    Date date;
    int post_id;
    Data_Table ds;
    Datadao dd;
    Response rs;
       
    Map<String, Object> map;

    public Response getRs() {
        return rs;
    }

    public void setRs(Response rs) {
        this.rs = rs;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
    
    

   
    public String callSaveComment()
    {
      
        System.out.println("  vvvv ");
         String id =(String) map.get("userid");
         System.out.println("user id  :"+map.get(id));        
     // UserRegistration ur1=new UserRegistration((String) id);
        rs.setUser_id( id);
        System.out.println("comment for save  "+comment);
        System.out.println(" date11  "+date);
        System.out.println("postid :"+post_id);
       
        boolean result = dd.callAddComment(rs);
        
        if(result)
        {
         
            return SUCCESS;
        }
        else
        {
            return ERROR;
        }
    }
    
    
    @Override
    public void prepare() throws Exception {
    rs=new Response();
    ds = new Data_Table();
 
    dd=new Datadao();
   
           
    }

    @Override
    public Response getModel() {
        return rs;
    }

    @Override
    public void setSession(Map<String, Object> map) 
    {
        this.map= map;
    }
    
}
