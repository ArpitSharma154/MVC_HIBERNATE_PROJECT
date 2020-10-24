package Dao;
import actions.RegisterUser;
import dto.UserRegistration;
import java.io.Serializable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UserProfileUpdateDao {

    public boolean saveUser(UserRegistration ur) {
        SessionFactory sf = FactoryRetriever.SessionFactoryGenerator.getSessionFactory();
        Session ses = sf.openSession();
       
        //Object ob =ur;
        
        Transaction tx = ses.beginTransaction();
        
        ses.update(ur);
        
        tx.commit();
        
        ses.close();
        
        if(ur==null)
        {
            return false;
        }
        else
        {
            return true;
        }
   }
    
}
