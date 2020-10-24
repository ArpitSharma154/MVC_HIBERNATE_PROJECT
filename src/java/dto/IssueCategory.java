package dto;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
@Table (name = "issue_category")
public class IssueCategory 
{
  @Id
  @Column
  private int category_id;   
  
  @Column
  private String category_name;
  
  @OneToMany (targetEntity = Data_Table.class,mappedBy = "issuecategory", fetch = FetchType.LAZY)
  private List<Data_Table> datalist = new ArrayList<Data_Table>();

    public List<Data_Table> getDatalist() {
        return datalist;
    }

    public void setDatalist(List<Data_Table> datalist) {
        this.datalist = datalist;
    }

  
  
  public IssueCategory()
  {
      
  }

    public IssueCategory(int category_id) {
        this.category_id = category_id;
    }
  
  public IssueCategory(int category_id,String category_name)
  {
    this.category_id = category_id;
    this.category_name = category_name;
  }

  public int getCategory_id() 
  {
    return category_id;
  }
  public void setCategory_id(int category_id) 
  {
    this.category_id = category_id;
  }

  public String getCategory_name() 
  {
    return category_name;
  }
  
  
  public void setCategory_name(String category_name) 
  {
    this.category_name = category_name;
  }
  
  public String toString()
  {
     return(category_id+" "+category_name); 
  }
}
