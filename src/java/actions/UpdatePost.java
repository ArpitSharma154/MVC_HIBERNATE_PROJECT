/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package actions;

/*
import Dao.Datadao;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import dao.*;
import dto.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.SessionAware;

public class UpdatePost extends HttpServlet implements Preparable,
      ModelDriven<Data_Table> , SessionAware
 {
    HttpServletRequest req;
     HttpServletRequest hsr;
    Datadao dd;
    Data_Table  dt;
     Map<String,Object> map;
     
     
      private File myFile;
    
    private String myFileFileName;
    
    private String myFileContentType;

    public File getMyFile() {
        return myFile;
    }

    public void setMyFile(File image1) {
        this.myFile = image1;
    }

    public String getMyFileFileName() {
        return myFileFileName;
    }

    public void setMyFileFileName(String myFileFileName) {
        this.myFileFileName = myFileFileName;
    }

    public String getMyFileContentType() {
        return myFileContentType;
    }

    public void setMyFileContentType(String myFileContentType) {
        this.myFileContentType = myFileContentType;
    }
     

        public void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException
  { 

     //  HttpServletRequest hsr;
    
   

   // public String callsavePost() throws IOException
   // {
        
        Object id = map.get("userid");
        System.out.println("userid :"+id);
        
        System.out.println("Fake Path:"+"  "+this.myFile);
        System.out.println("Name:"+"  "+this.myFileFileName);
        System.out.println("Content Type:"+"  "+this.myFileContentType);
        
        String serverfilepath = hsr.getSession().getServletContext().getRealPath("/");
        
        System.out.println("Server Path:"+"  "+serverfilepath);
        
        File fileToCreate  = new File(serverfilepath , this.myFileFileName);
        
        FileUtils.copyFile(this.myFile, fileToCreate);
      
      
      
      dt=new Data_Table(Integer.parseInt(req.getParameter("postid")),req.getParameter("myFileFileName") ,req.getParameter( "content2"));
      
 //dt= new (req.getParameter("password"), req.getParameter("user_name")
   //       ,req.getParameter("user_number"), req.getParameter("country")
   ///       , req.getParameter("state"), req.getParameter("city"), req.getParameter("street")
   //       ,req.getParameter("house_number"),req.getParameter("gender")
    //      ,req.getParameter("user_relation"),Integer.parseInt(req.getParameter("age")));
      
  }
    public String callUpdatePost()
    {       boolean result = dd.callsavePost(this.dt);
        
        if(result)
        {  //System.out.println("Ok update map");
         //  map.remove(ur);
          // map.put("Profile", this.ur);
                   
                   //("Profile", this.ur);
            return SUCCESS;
        }
        else
        {
            return ERROR;
        }
    
    
    }

    @Override
    public void prepare() throws Exception {
  dt =new Data_Table();
  dd=new Datadao();
    }

    @Override
    public Data_Table getModel() {
        return dt; }

    @Override
    public void setSession(Map<String, Object> map) {
    this.map=map;
    }
}
























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
/////////////////////////////////////////////////////////////////////
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

public class UpdatePost extends ActionSupport implements
        Preparable , ModelDriven<Data_Table> , 
        SessionAware
{
    Data_Table ds;
    UserDao ts;
    Datadao dd;
    private List<Data_Table> list;

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
    public String callUpdatePost()
    {
        int postid = ds.getPost_id();
        System.out.println("post id in call update post :"+postid);
        
        list = dd.getPost(postid);
        if(list!=null)
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
   dd=new Datadao();
           
    }

    @Override
    public Data_Table getModel() {
        return ds;
    }

    @Override
    public void setSession(Map<String, Object> map) {
    }
    
}  
