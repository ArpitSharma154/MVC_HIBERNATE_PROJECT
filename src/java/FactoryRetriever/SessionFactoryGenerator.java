package FactoryRetriever;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class SessionFactoryGenerator 
{
  public static SessionFactory getSessionFactory()
  {
    AnnotationConfiguration cfg = new AnnotationConfiguration();
    
    cfg = cfg.addAnnotatedClass(dto.AdminLogin.class);
    cfg = cfg.addAnnotatedClass(dto.UserRegistration.class);
    cfg = cfg.addAnnotatedClass(dto.IssueCategory.class);
    cfg = cfg.addAnnotatedClass(dto.Data_Table.class);
    cfg = cfg.addAnnotatedClass(dto.Response.class);
    cfg = cfg.addAnnotatedClass(dto.Report_Table.class);
    cfg = cfg.configure();
    SessionFactory sf = cfg.buildSessionFactory();
    return sf;
  }
}
