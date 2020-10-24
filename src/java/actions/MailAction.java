package actions;

import Dao.AdminDao;

import com.opensymphony.xwork2.ActionSupport;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dto.*;

import java.util.Properties;

import javax.mail.Message;

import javax.mail.MessagingException;

import javax.mail.PasswordAuthentication;

import javax.mail.Session;

import javax.mail.Transport;

import javax.mail.internet.InternetAddress;

import javax.mail.internet.MimeMessage;


public class MailAction extends ActionSupport implements Preparable, ModelDriven<MyMail> 
{

  private MyMail myMail ;

  public MyMail getMyMail() 
  {
    return myMail;
  }
  public void setMyMail(MyMail myMail) 
  {
    this.myMail = myMail;
  }

  UserRegistration user;   

  public UserRegistration getUser() 
  {
    return user;
  }
  public void setUser(UserRegistration user) 
  {
    this.user = user;
  }

  @Override
  public String execute() throws Exception
  {

    System.out.println("sabse pehle "+myMail); 
    
    user = AdminDao.recoverPassword(myMail.getReceiverEmailId());
    
    System.out.println("in mainaction password = "+user);
     
    String password = user.getPassword();
    
    System.err.println("are getpass k baad bhiyao "+password);
    
    myMail.setContent("Your ch@tsocial passord is -: "+password);
    
    System.out.println("are bade ab to batado: "+myMail);
    
   Properties props = new Properties();
   props.put("mail.smtp.host", "smtp.gmail.com");
   props.put("mail.smtp.socketFactory.port", "465"); 
   props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
   props.put("mail.smtp.auth", "true");
   props.put("mail.smtp.port", "465");

   Session session1 = Session.getDefaultInstance(props,
      new javax.mail.Authenticator() 
      {
        protected PasswordAuthentication getPasswordAuthentication()
        {
          return new PasswordAuthentication(myMail.getGmailUserName(), myMail.getGmailUserPass());
        }
      });
   try 
   {
     Message message = new MimeMessage(session1);
     message.setFrom(new InternetAddress(myMail.getSenderEmailId()));
     message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(myMail.getReceiverEmailId()));
     message.setSubject(myMail.getSubject());
     message.setText(myMail.getContent());

     System.out.println("bhiyao p/w kya he: "+myMail.getContent());
     
   //  Transport.send(message);
   }
   catch (MessagingException e) 
   {
     throw new RuntimeException(e);
   }

   return super.execute();
 }

 @Override
 public MyMail getModel() {
  return myMail;
 }

    @Override
    public void prepare() throws Exception 
    {
      myMail = new  MyMail();
      user = new UserRegistration();
    }

}
