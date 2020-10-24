package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity 
@Table (name = "response")

public class Response implements Serializable
{
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private int response_id;
    
    @Column
    private int post_id;
    
    @Column
    private String comment;
    
    @Column
   
    private Date date;
    
    @Column
    private String user_id;

    @ManyToMany (fetch = FetchType.LAZY)
    @JoinTable(name = "Response", joinColumns =  {@JoinColumn(name = "response_id")},inverseJoinColumns = {@JoinColumn (name = "user_id")})
    
    private List<UserRegistration> user;

    public List<UserRegistration> getUser() {
        return user;
    }

    public void setUser(List<UserRegistration> user) {
        this.user = user;
    }
   

   
    @ManyToMany (fetch = FetchType.LAZY)
    @JoinTable(name = "Response", joinColumns =  {@JoinColumn(name = "response_id")},inverseJoinColumns = {@JoinColumn (name = "post_id")})
    private List<Data_Table> data_table = new ArrayList<>();

    public List<Data_Table> getData_table() {
        return data_table;
    }

    public void setData_table(List<Data_Table> data_table) {
        this.data_table = data_table;
    }
    
 public Response()
 {
 }
    public Response(Date date) {
        this.date = date;
    }

    public Response(int post_id) {
        this.post_id = post_id;
    }

    
    
   
    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }
     public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getResponse_id() {
        return response_id;
    }

    public void setResponse_id(int response_id) {
        this.response_id = response_id;
    }

   
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

   
    public String toString()
    {
        return (response_id+"  "+date+" "+comment+" "+user+""+data_table);
    }
}
