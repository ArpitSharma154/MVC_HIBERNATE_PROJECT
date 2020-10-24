package dto;

import javax.persistence.*;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table (name = "data_table")

public class Data_Table 
{
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int post_id;
    
   
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date1; 
    
    @Column
    private String  image1;
    @Column
    private String location;
    
    @Column
    private String content;
 
    
    
    @ManyToOne ()
    @JoinColumn(name = "user_id")    
    private UserRegistration user;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


  
    
    public UserRegistration getUser() {
        return user;
    }

    public void setUser(UserRegistration user) {
        this.user = user;
    }
    
    
    @ManyToOne()
    @JoinColumn (name = "category_id")
    private IssueCategory issuecategory;

    public IssueCategory getIssuecategory() {
        return issuecategory;
    }

    public void setIssuecategory(IssueCategory issuecategory) {
        this.issuecategory = issuecategory;
    }
   
    
    
    @OneToOne(targetEntity = Response.class ,fetch = FetchType.EAGER)
    @JoinColumn(name = "response_id")
    private Response response;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    @OneToMany(fetch = FetchType.LAZY,targetEntity = Report_Table.class,mappedBy = "data_table")
    private List<Report_Table> reportlist = new ArrayList<Report_Table>();

    public List<Report_Table> getReportlist() {
        return reportlist;
    }

    public void setReportlist(List<Report_Table> reportlist) {
        this.reportlist = reportlist;
    }

   @ManyToMany (fetch = FetchType.LAZY)
   @JoinTable(name = "Response", joinColumns =  {@JoinColumn(name = "user_id")},inverseJoinColumns = {@JoinColumn (name = "response_id")})
   private List<Response> reponse = new ArrayList<>();

    public List<Response> getReponse() {
        return reponse;
    }

    public void setReponse(List<Response> reponse) {
        this.reponse = reponse;
    }
   
   
    
    public Data_Table() {
    }

    public Data_Table(int post_id) {
        this.post_id = post_id;
    }

    public Data_Table(int post_id, Date date1, String image1, String content,String location) {
        this.post_id = post_id;
        this.location = location;
        this.date1 = date1;
        this.image1 = image1;
        this.content = content;
     }

   public Data_Table(int post_id, String image1, String content ,String location) {
        this.post_id = post_id;
        this.location = location;
        this.image1 = image1;
        this.content = content;
    }

   

    public int getPost_id() {
        return post_id;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

  
   
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
 
     public String toString()
    {
         return post_id+"  "+content+"  "+date1+"  "+image1+"  "+
                issuecategory.getCategory_name()+"  "+issuecategory.getCategory_id()+" "+location;

    }
    
   
   
}
