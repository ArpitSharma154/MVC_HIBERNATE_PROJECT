package Dao;

import FactoryRetriever.SessionFactoryGenerator;
import dto.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestDao
{
    private Object session;

    public List<AdminLogin> saveAdmin(String adid,String adpass)
    {
       SessionFactory sf = FactoryRetriever.SessionFactoryGenerator.getSessionFactory();
       Session sess = sf.openSession();
        
        Query q =sess.createQuery("from AdminCreate where admin_id=? and adminpassword=?");
        q.setString(0,adid);
        q.setString(1,adpass);
        List<AdminLogin> list = q.list();
        return list;
    }
            public List<UserRegistration> getUser() {
   
       SessionFactory sf = FactoryRetriever.SessionFactoryGenerator.getSessionFactory();
       Session sess = sf.openSession();
        
        Query q = sess.createQuery("from UserRegistration");
        
        List<UserRegistration> list = q.list();
        
        return list;
    
    }
                public UserRegistration UserProfile(String us) {
       SessionFactory sf = FactoryRetriever.SessionFactoryGenerator.getSessionFactory();
       Session sess = sf.openSession();
       
               UserRegistration us1 = (UserRegistration) sess.get(UserRegistration.class,us);
        if(us1!=null)
        {
            return us1;
        }
        else
        {
            return null;
        }

        
    }
                  public  AdminLogin authenticateAdmin(AdminLogin admin)
  {
     SessionFactory sf = SessionFactoryGenerator.getSessionFactory();
     Session sess = sf.openSession();
     System.out.println("svvs"+admin.getAdmin_id());
     
     /*Query q = sess.createQuery("from AdminLogin where admin_id = ? and adminpassword = ?");
     q.setString(0,admin.getAdmin_id());
     q.setString(1,admin.getAdminpassword());
   */
    AdminLogin admin1 = (AdminLogin)sess.get(AdminLogin.class,admin.getAdmin_id());
    return admin1;
        
  }
  

            public boolean deleteUser(String user_id) 
        {
        
       SessionFactory sf = FactoryRetriever.SessionFactoryGenerator.getSessionFactory();
       Session sess = sf.openSession();
        UserRegistration rs = new UserRegistration();
        
        rs.setUser_id(user_id);
        
        Transaction tx = sess.beginTransaction();
        
        sess.delete(rs);
        
        tx.commit();
        
        sess.close();
        
        return true; 
    }

                 public boolean saveData(Data_Table data) 
    {
        SessionFactory  sf = FactoryRetriever.SessionFactoryGenerator.getSessionFactory();
        
        Session ses = sf.openSession();
        //Query q=ses.createQuery("select category_id from issue_category where category_name='garbage'");
        //System.out.println("id="+q);
        
        Transaction tx = ses.beginTransaction();
        
        Serializable sz = ses.save(data);
        
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

            
            public List<Data_Table> getContentCategorywise( String ca) 
    {
        
        
       SessionFactory sf = FactoryRetriever.SessionFactoryGenerator.getSessionFactory();
       Session sess = sf.openSession();
        System.out.println("the value of catagory name inside getContentCategory");
        System.out.println(ca);
        
        
        Query q = sess.createQuery("select category_id from IssueCategory where category_name=?");
        q.setString(0, ca);
  
        List list = q.list();
        System.out.println("te values in category list");
        System.out.println("List is:"+list);
        
        //Integer i1 = (Integer) list.get(0);
        
        //int i = i1.intValue();
        Query q1 = sess.createQuery("from Data_Table where category_id=?");
        q1.setInteger(0, (int) list.get(0));
        List<Data_Table> list1 = q1.list();
        return list1;
    
    }
         
           public List<Data_Table> getContent() 
    {
        
        System.out.println("hi1");
       SessionFactory sf = FactoryRetriever.SessionFactoryGenerator.getSessionFactory();
               System.out.println("hi2");

       Session sess = sf.openSession();
               System.out.println("hi3");

        
        Query q = sess.createQuery("from Data_Table");
                System.out.println("hi4");

        
        List<Data_Table> list =q.list();
        System.out.println("List is:"+list);
        
        return list;
    
    }
         public List<Data_Table>  getDatewise(Date date1)
         {
            SessionFactory sf = FactoryRetriever.SessionFactoryGenerator.getSessionFactory();
            Session sess = sf.openSession();
            System.out.println(date1);
            Query q = sess.createQuery("from Data_Table where date1=?");      
            q.setDate(0,date1);
            List<Data_Table> list1 = q.list();
            return list1;
         }

    public List<Report_Table> getReport()
    {
          SessionFactory sf = FactoryRetriever.SessionFactoryGenerator.getSessionFactory();
          Session sess = sf.openSession();
          Query q = sess.createQuery("from Report_Table");      
           List<Report_Table> list = q.list();
           return list;
          
    }
       public Data_Table reportPost(int postid ) {
       SessionFactory sf = FactoryRetriever.SessionFactoryGenerator.getSessionFactory();
       Session sess = sf.openSession();
       System.out.println("reportpost method data"+postid);
          Data_Table ds = (Data_Table) sess.get(Data_Table.class,postid);
       if(ds!=null)
        {
            return ds;
        }
        else
        {
            return null;
        }

       
     
    }
       public List getPassword(String id)
       {
       SessionFactory sf = FactoryRetriever.SessionFactoryGenerator.getSessionFactory();
       Session sess = sf.openSession();
       Query q = sess.createQuery("select password from UserRegistration where user_id=?");
       q.setString(0,id);
       List<String> list = q.list();
       String str=list.get(0);
       System.out.println(str);
       
       
       sess.close();
       return list;
       }
       public boolean deletereportedUser(String user_id) 
        {
          //  System.out.println(user_id);
       SessionFactory sf = FactoryRetriever.SessionFactoryGenerator.getSessionFactory();
       Session sess = sf.openSession();
       
       UserRegistration rs = new UserRegistration();
        
        rs.setUser_id(user_id);
        
        Transaction tx = sess.beginTransaction();
        
        sess.delete(rs);
        
        tx.commit();
        
        
        
        sess.close();
        
        return true; 
    }
        public List<Data_Table> getUserPost(String user_id) 
        {
                 System.out.println(user_id);
                 SessionFactory sf = FactoryRetriever.SessionFactoryGenerator.getSessionFactory();
                Session sess = sf.openSession();
                Query q = sess.createQuery("from Data_Table where user_id=?");      
            q.setString(0,user_id);
            List<Data_Table> list1 = q.list();
            System.out.println(list1);
            return list1;
 
      
        }
                public boolean getDeletepost(int postid) 
        {
        
       SessionFactory sf = FactoryRetriever.SessionFactoryGenerator.getSessionFactory();
       Session sess = sf.openSession();
       // UserRegistration rs = new UserRegistration();
        Data_Table ds = new Data_Table();
        ds.setPost_id(postid);
        
        Transaction tx = sess.beginTransaction();
        
        sess.delete(ds);
        
        tx.commit();
        
        sess.close();
        
        return true; 
    }

}