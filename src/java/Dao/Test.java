package Dao;

import dto.*;
import java.io.Serializable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Test
{
    public static void main(String[] args) 
    {
       SessionFactory sf = FactoryRetriever.SessionFactoryGenerator.getSessionFactory();
       Session sess = sf.openSession();
     
       AdminLogin ad = new AdminLogin();
      
       UserRegistration us = new UserRegistration();
       
       IssueCategory is = new  IssueCategory();
       
       Data_Table da = new Data_Table();
        
       Response re = new   Response();
              
       Report_Table rt = new  Report_Table();
       
       sess.close();
    }
}