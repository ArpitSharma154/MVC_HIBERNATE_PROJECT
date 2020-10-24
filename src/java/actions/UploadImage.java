/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package actions;

import Dao.UserDao;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import dto.Data_Table;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author root
 */
public class UploadImage extends ActionSupport implements
        ServletRequestAware, Preparable , ModelDriven<Data_Table> , SessionAware 
{
   
    Data_Table data;
    
    UserDao ts;

    
    
     Map<String,Object> map;

    public Data_Table getData() {
        return data;
    }

    public void setData(Data_Table data) {
        this.data = data;
    }

    public UserDao getTs() {
        return ts;
    }

    public void setTs(UserDao ts) {
        this.ts = ts;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public HttpServletRequest getHsr() {
        return hsr;
    }

    public void setHsr(HttpServletRequest hsr) {
        this.hsr = hsr;
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

   
    public String savePost() throws IOException
    {
        
        
        System.out.println("Fake Path:"+"  "+this.myFile);
        System.out.println("Name:"+"  "+this.myFileFileName);
        System.out.println("Content Type:"+"  "+this.myFileContentType);
        
        String serverfilepath = hsr.getSession().getServletContext().getRealPath("/");
        
        System.out.println("Server Path:"+"  "+serverfilepath);
        
        File fileToCreate  = new File(serverfilepath , this.myFileFileName);
        
        FileUtils.copyFile(this.myFile, fileToCreate);
        
         data.setImage1(myFileFileName);
        
        boolean result = ts.saveData(this.data);
        
        if(result)
        {
           // map.put("adminobject", this.admin);
            return "success";
        }
        else
        {
            return "failure";
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
     data = new Data_Table();
     ts = new UserDao();
    }

    @Override
    public Data_Table getModel() {
        return data;
    }

    @Override
    public void setSession(Map<String, Object> map)
    {
        this.map=map;
   }
    
    
}
