package Dao;

import dto.Data_Table;
import dto.Report_Table;
import dto.Response;
import dto.UserRegistration;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Datadao 
{
    
     public boolean callsavePost(Data_Table datatable) 
    {
        SessionFactory  sf = FactoryRetriever.SessionFactoryGenerator.getSessionFactory();
        
        Session ses = sf.openSession();
        
        Transaction tx = ses.beginTransaction();
        
        Serializable sz = ses.save(datatable);
        
        tx.commit();
        
        ses.close();
        
        if(sz!=null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
 
     
     
     public List<Data_Table> getPost(int postid) 
    {
        
        
        
        System.out.println("hi1");
       SessionFactory sf = FactoryRetriever.SessionFactoryGenerator.getSessionFactory();
               System.out.println("hi2");

       Session sess = sf.openSession();
               System.out.println(postid);
            //Data_Table ds = new Data_Table();
           // ds.setPost_id(postid);
        Query q = sess.createQuery("from Data_Table where post_id=?");
          
         q.setInteger(0, postid);
         
         
          System.out.println("hi4");

        
        List<Data_Table> list =q.list();
        System.out.println("List is:"+list);
        
         if(list!=null)
        {
            System.out.println("llll");
            return list;
        }
        else
        {
            return null;
        }
        
        
    
    }
     
     
     
     
     
      public boolean authenticateUser(UserRegistration ur) 
    {
        SessionFactory  sf = FactoryRetriever.SessionFactoryGenerator.getSessionFactory();
        
        Session ses = sf.openSession();
        
        System.out.println(ur.getUser_id()+" action "+ur.getPassword());
       // System.out.println(user_id+" ye aaya   "+password);
        Query q= ses.createQuery("from UserRegistration where user_id = ? and password = ?");
        
       //Query q = ses.createQuery("from userregistration where user_id = ? and password = ?");

        q.setString(0,"sp@gmail.com");
        
        q.setString(1, "123");
        
        List<UserRegistration> list = q.list();
        for (UserRegistration user : list) {
            System.out.println(" uid :  "+list);
           // System.out.println(" pwd :  "+password);
          ses.close();
        }
        
        if(list.isEmpty())
        {
            return false;
        }
        else
        {
            return true;
        }
    }

      
       public boolean callAddComment(Response rs) 
    {
        SessionFactory  sf = FactoryRetriever.SessionFactoryGenerator.getSessionFactory();
        
        Session ses = sf.openSession();
        
        Transaction tx = ses.beginTransaction();
        
        Serializable sz = ses.save(rs);
        
        tx.commit();
        
        ses.close();
        
        if(sz!=null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
      
      public boolean addReport(Report_Table rt) 
    {
        SessionFactory  sf = FactoryRetriever.SessionFactoryGenerator.getSessionFactory();
        
        Session ses = sf.openSession();
        
        Transaction tx = ses.beginTransaction();
        
        Serializable sz = ses.save(rt);
        
        tx.commit();
        
        ses.close();
        
        if(sz!=null)
        {
            return true;
        }
        else
        {
            return false;
        }
    } 
     
      
       public boolean callUpdatePost(Data_Table datatable) 
    {
        SessionFactory  sf = FactoryRetriever.SessionFactoryGenerator.getSessionFactory();
        
        Session ses = sf.openSession();
        
        Transaction tx = ses.beginTransaction();
        
        ses.update(datatable);
        
        tx.commit();
        
        ses.close();
        
        if(datatable==null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
