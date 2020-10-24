/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package actions;

import Dao.Datadao;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import dto.Data_Table;
import dto.IssueCategory;
import dto.UserRegistration;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class SavePost extends ActionSupport implements
        ServletRequestAware, Preparable , ModelDriven<Data_Table> , SessionAware 
{
    
    
    
    Map<String,Object> map;

    
    String category;
    IssueCategory is;
    Data_Table datatable;
    Datadao datadao;

    public IssueCategory getIs() {
        return is;
    }

    public void setIs(IssueCategory is) {
        this.is = is;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
   
    
     public String getCategory() {
        return category;
    }

    public void setCategory(String category) 
    {
        this.category = category;
    }
    public Data_Table getDatatable() {
        return datatable;
    }

    public void setDatatable(Data_Table datatable) {
        this.datatable = datatable;
    }
  
    
    
    
    HttpServletRequest hsr;
    
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

    public String callsavePost() throws IOException
    {
        
        Object id = map.get("userid");
        System.out.println("userid :"+id);
        
        System.out.println("Fake Path:"+"  "+this.myFile);
        System.out.println("Name:"+"  "+this.myFileFileName);
        System.out.println("Content Type:"+"  "+this.myFileContentType);
        
        String serverfilepath = hsr.getSession().getServletContext().getRealPath("/");
        
        System.out.println("Server Path:"+"  "+serverfilepath);
        
        File fileToCreate  = new File(serverfilepath , this.myFileFileName);
        
        FileUtils.copyFile(this.myFile, fileToCreate);
        
        //System.out.println("  hello   ");
      
        SessionFactory  sf = FactoryRetriever.SessionFactoryGenerator.getSessionFactory();
        
        Session ses = sf.openSession();
        
        Query q = ses.createQuery("select category_id from IssueCategory where category_name=?");
        q.setString(0,category);
        
          List  <Integer> list=q.list();
          
         int i=list.get(0);
        ses.close();
        
        IssueCategory iss =new IssueCategory(i);
        UserRegistration ur1=new UserRegistration((String) id);
         datatable.setIssuecategory(iss);
         datatable.setImage1(myFileFileName);
         datatable.setUser(ur1);
         
          
       
         
        boolean result = datadao.callsavePost(this.datatable);
        
        if(result)
        {
           // map.put("adminobject", this.admin);
            return SUCCESS;
        }
        else
        {
            return ERROR;
        }
        
        //return SUCCESS;
    
    }
    @Override
    public void setServletRequest(HttpServletRequest hsr) 
    {
        this.hsr = hsr;
    }
    
    
    
    
    

    @Override
    public void prepare() throws Exception
    {
     datatable = new Data_Table();
    
     datadao = new Datadao();
     
    }

    @Override
    public Data_Table getModel() {
        return datatable;
    }

    @Override
    public void setSession(Map<String, Object> map)
    {
        this.map=map;
   }
     public String getsession()
    {
        String test;
        test=(String)map.get("user_id");
        
        System.out.println(test);
        return test;
    }
    
}
