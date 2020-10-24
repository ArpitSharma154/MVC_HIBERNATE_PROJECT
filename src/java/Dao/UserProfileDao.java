
package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import dto.*;

public class UserProfileDao {
       public UserRegistration UserProfile( String uid) {
        SessionFactory sf = FactoryRetriever.SessionFactoryGenerator.getSessionFactory();
        
        Session ses = sf.openSession();
        
        UserRegistration ur = (UserRegistration) ses.get(UserRegistration.class,uid );
        
        if(ur!=null)
        {
            return ur;
        }
        else
        {
            return null;
        }
        
    }
    
}
