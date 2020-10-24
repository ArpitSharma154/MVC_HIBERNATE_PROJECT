package Dao;

import dto.*;

import FactoryRetriever.SessionFactoryGenerator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.hibernate.Transaction;

import java.io.Serializable;

import java.util.List;

public class AdminDao 
{
  public static boolean insertAdmin(AdminLogin admin)
  {
     SessionFactory sf = SessionFactoryGenerator.getSessionFactory();
     Session sess = sf.openSession();
     
     Transaction tx = sess.beginTransaction();
     
     Serializable sz = sess.save(admin);
     
     tx.commit();
     
     sess.close();
     
     if(sz != null)
     {
      return true;
     }
     else
     {
        return false; 
     }
  }
  
  public static AdminLogin authenticateAdmin(AdminLogin admin)
  {
     SessionFactory sf = SessionFactoryGenerator.getSessionFactory();
     Session sess = sf.openSession();
 
     System.out.println("svvs"+admin.getAdmin_id());
     
     /*Query q = sess.createQuery("from AdminLogin where admin_id = ? and adminpassword = ?");
     q.setString(0,admin.getAdmin_id());
     q.setString(1,admin.getAdminpassword());
   
     List<AdminLogin> l = q.list();*/
     
    AdminLogin adminlog = (AdminLogin)sess.get(AdminLogin.class,admin.getAdmin_id());

    System.out.println(adminlog);
    System.out.println("get called....");  

    sess.close();
    
    return adminlog;
       
  }
  
  public static List viewAll()
  {
      
     SessionFactory sf = SessionFactoryGenerator.getSessionFactory();
     Session sess = sf.openSession();
     
     Query q = sess.createQuery("from UserRegistration");
     List<UserRegistration> l = q.list();

     System.out.println("in dao"+l);
     
     sess.close();
     
     return l;
  }
  
  public static UserRegistration viewProfile(String user_id)
  {
    SessionFactory sf = SessionFactoryGenerator.getSessionFactory();
    Session sess = sf.openSession();
   
    System.out.println("dao user_id"+user_id);
    
    UserRegistration userprofile = (UserRegistration)sess.get(UserRegistration.class,user_id);

    System.out.println(userprofile);
    System.out.println("get called....");  

    sess.close();
    
    return userprofile;
  }
  
  public static boolean deleteUserProfile(String user_id)
  {
    SessionFactory sf = SessionFactoryGenerator.getSessionFactory();
    Session sess = sf.openSession();
    
    System.out.println("delete's user_id"+user_id);
    
    UserRegistration user = new UserRegistration();
    user.setUser_id(user_id);
    
    Transaction tx = sess.beginTransaction();
    
    sess.delete(user);
    
    tx.commit();
    
    sess.close();
    
    return true;
  }
  
  public static List<Report_Table> displayReport()
  {
    SessionFactory sf = SessionFactoryGenerator.getSessionFactory();
    Session sess = sf.openSession();
  
    Query q = sess.createQuery("select data_table from Report_Table");
    List<Report_Table> reportlist = q.list();
    
    System.out.println("in dao "+reportlist);
     
    sess.close();
    
    return reportlist;
  }
  
  public static UserRegistration recoverPassword(String receiver_id)
  {
      
    System.out.println("in dao receiver id - "+receiver_id);  
    
    SessionFactory sf = SessionFactoryGenerator.getSessionFactory();
    Session sess = sf.openSession();
    
    UserRegistration us = (UserRegistration)sess.get(UserRegistration.class,receiver_id);
    
    System.out.println("after get pass - "+us);
    
    sess.close();
    
    return us;  
  }
}
