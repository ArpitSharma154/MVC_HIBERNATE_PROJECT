
package actions;
/*
import Dao.Datadao;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import dto.Data_Table;
import dto.Response;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;


public class AddComment extends ActionSupport implements Preparable , ModelDriven<Response> , 
        SessionAware
{   Response rs;
    
    Data_Table dt;
    
    List<Data_Table> data;
    
    Datadao datadao;
    Map<String, Object> map;

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<Data_Table> getData() {
        return data;
    }

    public void setData(List<Data_Table> data) {
        this.data = data;
    }

    public Response getRs() {
        return rs;
    }

    public void setRs(Response rs) {
        this.rs = rs;
    }

    public Data_Table getDt() {
        return dt;
    }

    public void setDt(Data_Table dt) {
        this.dt = dt;
    }
    
    
    
    
    
     public String callAddComment()
     {
        int postid = dt.getPost_id();
        System.out.println("post id in call  addo comment " +postid);
        //dt.setPost_id(postid);
        data = datadao.getPost(postid);
        System.out.println("the data in call user post list"+data);
     
     return "success";
       
     }

    @Override
    public void prepare() throws Exception
    {
        rs=new Response();
        dt=new Data_Table();
    }

    @Override
    public Response getModel()
    {
        return rs;
        }

    @Override
    public void setSession(Map<String, Object> map) {
        this.map=map;
       }
    
    
    
}
*/

import Dao.Datadao;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.util.ResolverUtil;
import dto.Data_Table;
import dto.Report_Table;
import dto.Response;
import java.util.Date;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author arpitsharma
 */
public class ReportAbuse extends ActionSupport implements
        Preparable , ModelDriven<Report_Table> , 
        SessionAware
{ 
    String reason;
    Date date;
    int post_id;
    Data_Table ds;
    Datadao dd;
    Report_Table rt;
       
    Map<String, Object> map;

    public Report_Table getRt() {
        return rt;
    }

    public void setRt(Report_Table rt) {
        this.rt = rt;
    }

   

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }
    
   

   
    public String callReportAbuse()
    {
      
        
        // Object id = map.get("userid");
        // System.out.println("user id  :"+map.get(id));        
     
        System.out.println("comment for save  "+reason);
        System.out.println(" date11  "+date);
        System.out.println("postid :"+post_id);
        ds.setPost_id(post_id);
        System.out.println(" pid "+ds.getPost_id());
        ds=new Data_Table(post_id);
        rt.setData_table(ds);
        
        boolean result = dd.addReport(rt);
        
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
    rt=new Report_Table();
    ds = new Data_Table();
 
    dd=new Datadao();
   
           
    }

    @Override
    public Report_Table getModel() {
        return rt;
    }

    @Override
    public void setSession(Map<String, Object> map) 
    {
        this.map= map;
    }
    
}
