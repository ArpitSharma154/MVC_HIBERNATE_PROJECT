
package Dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;



import dto.UserRegistration;
public class UserLoginDao {
    public String loginUser(String user_id,String password)
    { UserRegistration ur=new UserRegistration();
    SessionFactory  sf = FactoryRetriever.SessionFactoryGenerator.getSessionFactory();
        
        Session ses = sf.openSession();
       ur=(UserRegistration) ses.get(UserRegistration.class,user_id);
        if(ur!=null)
        {
            if(ur.getPassword().equals(password))
            {return ur.getUser_name();}
            else{return null;}
        }
        else
        {
            return null;
        }
    
    
    
    
    
    }
    
}
