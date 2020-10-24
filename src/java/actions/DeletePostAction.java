

package actions;

import Dao.UserDao;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.util.ResolverUtil;
import dto.Data_Table;
import dto.UserRegistration;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author arpitsharma
 */
public class DeletePostAction extends ActionSupport implements
        Preparable , ModelDriven<Data_Table> , 
        SessionAware
{
    Data_Table ds;
    UserDao ts;

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
    public String callDeletePost()
    {
        int postid = ds.getPost_id();
        System.out.println("post id in call delete post :"+postid);
        boolean result;
        result = ts.getDeletepost(postid);
        if(result)
        {
            return "success";
        }
        else
        {
            return"failure";
        }
    }
    
    
    @Override
    public void prepare() throws Exception {
   ds = new Data_Table();
   ts = new  UserDao();
           
    }

    @Override
    public Data_Table getModel() {
        return ds;
    }

    @Override
    public void setSession(Map<String, Object> map) {
    }
    
}
