
package Dao;

import actions.RegisterUser;
import dto.UserRegistration;
import java.io.Serializable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UserRegistrationDao {
        public boolean saveUser(UserRegistration ur) 
    {
        SessionFactory sf = FactoryRetriever.SessionFactoryGenerator.getSessionFactory();
        
        Session ses = sf.openSession();
        
        Transaction tx = ses.beginTransaction();
        
        Serializable sz = ses.save(ur);
        
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
    
}
