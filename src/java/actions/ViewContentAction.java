package actions;

import Dao.UserDao;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import dto.Data_Table;
import java.util.List;

public class ViewContentAction extends ActionSupport implements
        Preparable , ModelDriven<Data_Table>  
        
{
    Data_Table ds;
    UserDao ts;
    List<Data_Table> data;

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
    
    
     public String callContentView()
    {
        System.out.println("Hello1");
        data = ts.getContent();
        System.out.println("Hello2");
             System.out.println(data);
        
        if(data!=null)
         {
             System.out.println(data.toString());
             return "success";
         }
         else
         {
             return "failure";
         }  
    
    }


    @Override
    public void prepare() throws Exception {
        ds =  new Data_Table();
        ts = new UserDao();
        
    }
    
    @Override
    public Data_Table getModel()
    {
        return ds;
    }

}
