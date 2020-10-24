/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
import Dao.UserDao;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.util.ResolverUtil;
import dto.Data_Table;
import dto.UserRegistration;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author arpitsharma
 */
public class AddComment extends ActionSupport implements
        Preparable , ModelDriven<Data_Table> , 
        SessionAware
{
    Data_Table ds;
    UserDao ts;
    Datadao dd;
    private List<Data_Table> list;
    Map<String, Object> map1;

    public Datadao getDd() {
        return dd;
    }

    public void setDd(Datadao dd) {
        this.dd = dd;
    }

    public List<Data_Table> getList() {
        return list;
    }

    public void setList(List<Data_Table> list) {
        this.list = list;
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
    public String callAddComment()
    {
        int postid = ds.getPost_id();
        System.out.println("post id in call comment post :"+postid);
        
        list = dd.getPost(postid);
        if(list!=null)
        {
             System.out.println("sabkch sahi sahi1 :" +ds.getPost_id());
         //System.out.println(" pass :"+ur.getPassword());
         
              // map1.put("postid",this.ds);    
        //System.out.println("mapped susscec11"+map1.get("postid"));
            
            
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
   dd=new Datadao();
           
    }

    @Override
    public Data_Table getModel() {
        return ds;
    }

    @Override
    public void setSession(Map<String, Object> map) 
    {
        this.map1= map;
  }

   
    
}
