package actions;

import Dao.UserDao;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import dto.Data_Table;
import java.util.Date;
import java.util.List;

/**
 *
 * @author arpitsharma
 */
public class DatewiseAction extends ActionSupport implements
        Preparable , ModelDriven<Data_Table>
{
          Data_Table ds;
    UserDao ts;
    Date date;
  List<Data_Table> data;

    public Date getDate() {
        return date;
    }

    public List<Data_Table> getData() {
        return data;
    }

    public void setData(List<Data_Table> data) {
        this.data = data;
    }

    public void setDate(Date date) {
        this.date = date;
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

          public String callDatewisewiseContent()
    {
              //  System.out.println("post date"+date);
              if(date==null)
              {
                  return "failure";
              }
             ds.setDate1(date);
            Date date1 = ds.getDate1();
           // System.out.println(date1);
            data = ts.getDatewise(date1);
             //System.out.println(data);
        
        if(data!=null)
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

    }

    @Override
    public Data_Table getModel() 
    {
        return ds;
    }
    
}
