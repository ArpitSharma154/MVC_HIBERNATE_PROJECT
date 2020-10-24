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
import dto.Report_Table;
import java.util.List;

/**
 *
 * @author arpitsharma
 */
public class ReportAction extends ActionSupport implements
        Preparable , ModelDriven<Report_Table>
{
    Report_Table rs ;  
    UserDao ts;
    List<Report_Table> report;

    public Report_Table getRs() {
        return rs;
    }

    public void setRs(Report_Table rs) {
        this.rs = rs;
    }

    public UserDao getTs() {
        return ts;
    }

    public void setTs(UserDao ts) {
        this.ts = ts;
    }

    public List<Report_Table> getReport() {
        return report;
    }   

    public void setReport(List<Report_Table> report) {
        this.report = report;
    }

    
    public String callReport()
    {
        report = ts.getReport();
       // System.out.println(report);
        if(report!=null)
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
        rs = new Report_Table();
        ts = new UserDao();
    }

    @Override
    public Report_Table getModel() 
    {
        return rs;
    }
    
}
