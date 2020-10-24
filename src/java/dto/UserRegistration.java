package dto;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
@Table()

public class UserRegistration 
{  
  @Id
  @Column
  private String user_id;
  
  @Column
  private String password;
  
  @Column 
  private String user_name;
 
  @Column
  private String user_number;
   
  @Column
  private String country;
  
  @Column
  private String state;
   
  @Column
  private String city;
   
  @Column
  private String street;
   
  @Column
  private String house_number;
   
  @Column
  private String gender;
   
  @Column
  private String user_relation;
  
  @Column
  private int age;

  

  
 
  @OneToMany (targetEntity = Data_Table.class,mappedBy = "user", fetch = FetchType.LAZY)
  private List<Data_Table> datalist = new ArrayList<Data_Table>();

  public List<Data_Table> getDatalist() 
  {
    return datalist;
  }
  public void setDatalist(List<Data_Table> datalist) 
  {
    this.datalist = datalist;
  }

   @ManyToMany (fetch = FetchType.LAZY)
   @JoinTable(name = "Response", joinColumns =  {@JoinColumn(name = "user_id")},inverseJoinColumns = {@JoinColumn (name = "response_id")})
  private List<Response> response  = new ArrayList<>();

    public List<Response> getResponse() {
        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }
   
   
   
  
  public UserRegistration()
  {
      
  }
  
  public UserRegistration(String user_id)
  {
    this.user_id = user_id;  
  }

  public UserRegistration(String password, String user_name, String user_number, String country, String state, String city, String street, String house_number, String gender, String user_relation, int age) 
  {
    this.password = password;
    this.user_name = user_name;
    this.user_number = user_number;
    this.country = country;
    this.state = state;
    this.city = city;
    this.street = street;
    this.house_number = house_number;
    this.gender = gender;
    this.user_relation = user_relation;
    this.age = age;
  }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_number() {
        return user_number;
    }

    public void setUser_number(String user_number) {
        this.user_number = user_number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse_number() {
        return house_number;
    }

    public void setHouse_number(String house_number) {
        this.house_number = house_number;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUser_relation() {
        return user_relation;
    }

    public void setUser_relation(String user_relation) {
        this.user_relation = user_relation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
   public String toString()
  {
     return user_id+user_name+user_number+user_relation;
  
  }
  
  
}
