

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
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class SaveUpdatePost extends ActionSupport implements
        ServletRequestAware, Preparable ,  SessionAware 
{
    HttpServletRequest hsr;
    
    private File myFile;
    
    private String myFileFileName;
    
    private String myFileContentType;
    
    Map<String,Object> map;

    
    int post_id;
    String category;
    Date date1;
    String content;
    //String user_id;

    
    
    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    IssueCategory is;
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

    public String callSaveUpdatePost() throws IOException
    {     
        
        System.out.println("hi-----------1");
        System.out.println("Fake Path:"+"  "+this.myFile);
        System.out.println("Name:"+"  "+this.myFileFileName);
        System.out.println("Content Type:"+"  "+this.myFileContentType);
        System.out.println("hi-----------2");
        String serverfilepath = hsr.getSession().getServletContext().getRealPath("/");
        System.out.println("hi-----------3");
        System.out.println("Server Path:"+"  "+serverfilepath);
        System.out.println("hi-----------4");
        File fileToCreate  = new File(serverfilepath , this.myFileFileName);
        System.out.println("hi-----------5");
        FileUtils.copyFile(this.myFile, fileToCreate);
        System.out.println("hi-----------6");
        //System.out.println("  hello   ");
      
        SessionFactory  sf = FactoryRetriever.SessionFactoryGenerator.getSessionFactory();
        System.out.println("hi-----------7");
        Session ses = sf.openSession();
        System.out.println("hi-----------8");
        Query q = ses.createQuery("from IssueCategory where category_name=?");
        q.setString(0,category);
        System.out.println("post id in data_table in update->"+post_id);
        Query q1 = ses.createQuery("from Data_Table where post_id=?");
        q1.setInteger(0,post_id);
        List<Data_Table> l1 = q1.list();
        Data_Table db1 = l1.get(0);
        System.out.println("hi-----------9");
          List<IssueCategory> list=q.list();
         System.out.println("hi-----------10"); 
         IssueCategory I =list.get(0);
         System.out.println("hi-----------11");
        //System.out.println("   "+i);
        //System.out.println("  mila kch ddaafafaf  "+list.get(0));
        
        IssueCategory iss =new IssueCategory(I.getCategory_id());
       // UserRegistration ur2 = new UserRegistration(user_id);
          //   System.out.println("user_id in beans"+ur2.getUser_id());
   
//String ui=getsession();
        //System.out.println(ui);
         db1.setIssuecategory(iss);
         db1.setImage1(myFileFileName);
         db1.setDate1(date1);
        db1.setContent(content);
        ses.close();
         boolean result = datadao.callUpdatePost(db1);
        
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
    
     datadao = new Datadao();
     
    }

  
    @Override
    public void setSession(Map<String, Object> map)
    {
        this.map=map;
   }
    
    
}
