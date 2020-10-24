package actions;

import Dao.UserDao;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import dto.Data_Table;
import dto.IssueCategory;
import java.util.List;

public class CategorywiseAction extends ActionSupport implements
        Preparable , ModelDriven<Data_Table> 
{
    
        Data_Table ds;
    UserDao ts;
    String category;
        List<Data_Table> data;
    public Data_Table getDs() {
        return ds;
    }

    public List<Data_Table> getData() {
        return data;
    }

    public void setData(List<Data_Table> data) {
        this.data = data;
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

   
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

         public String callCategorywiseContent()
    {
                
            IssueCategory is = new IssueCategory();
            //System.out.println(category);
            is.setCategory_name(category);
            //System.out.println("getter value");
            String getcategoryname = is.getCategory_name();
            //System.out.println(is.getCategory_name());
            
            data = ts.getContentCategorywise(getcategoryname);
             System.out.println(data);
        
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
    public void prepare() throws Exception {
          ds =  new Data_Table();
        ts = new UserDao();

    }

    @Override
    public Data_Table getModel() {
            return ds;

    }
    
}
