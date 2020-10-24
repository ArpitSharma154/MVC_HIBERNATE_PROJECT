package actions;

import Dao.UserDao;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import dto.Data_Table;
import dto.UserRegistration;

/**
 *
 * @author arpitsharma
 */
public class Deletereporteduser extends ActionSupport implements Preparable ,ModelDriven<Data_Table>
{
    Data_Table ds;
    UserDao ts;
    UserRegistration us;
    public Data_Table getDs() {
        return ds;
    }

    public UserRegistration getUs() {
        return us;
    }

    public void setUs(UserRegistration us) {
        this.us = us;
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
    
    
        public String callDeletereportUser()
    {
        System.out.println("user_id of reported user"+ds.getUser().getUser_id());
        boolean result = ts.deletereportedUser(ds.getUser().getUser_id());
        
        if(result)
        {
            return "success";
        }
        else
        {
            return "failure";
        }
    }


    @Override
    public void prepare() throws Exception 
    {
        ds =  new Data_Table();
        ts = new UserDao();
        us = new UserRegistration();
    }

    @Override
    public Data_Table getModel() 
    {
        return ds;
    }

}
