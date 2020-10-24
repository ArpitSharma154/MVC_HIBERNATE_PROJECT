package actions;

import Dao.UserDao;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import dto.Data_Table;
import dto.Report_Table;
import dto.UserRegistration;
import java.util.List;

/**
 *
 * @author arpitsharma
 */
public class ReportpostAction extends ActionSupport implements
        Preparable , ModelDriven<Report_Table>
{
    Data_Table ds;
    UserDao ts;
    List<Data_Table> data;
    Report_Table rt;

    public List<Data_Table> getData() {
        return data;
    }

    public void setData(List<Data_Table> data) {
        this.data = data;
    }

    
    public Report_Table getRt() {
        return rt;
    }

    public void setRt(Report_Table rt) {
        this.rt = rt;
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

   
         public String callReportPost()
        {           
            //System.out.println(ds.getPost_id());
            ds = ts.reportPost(rt.getData_table().getPost_id());
            System.out.println("data in report post"+ds);
            if(ds!=null)
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
        ds = new  Data_Table();
        ts = new UserDao();
        rt = new Report_Table();
    }

   
    @Override
    public Report_Table getModel() {
        return rt;
    }
    
}
