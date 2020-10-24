package dto;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table()
public class Report_Table 
{

@Id
@GeneratedValue()
@Column()
private int rport_id;

@Column
private Date date;

@Column
private String reason;


  

@OneToOne(targetEntity = Data_Table.class,fetch = FetchType.EAGER)
@JoinColumn(name = "post_id")
private Data_Table data_table;

    public Data_Table getData_table() {
        return data_table;
    }

    public void setData_table(Data_Table data_table) {
        this.data_table = data_table;
    }


    public int getRport_id() {
        return rport_id;
    }

    public Report_Table()
    {
        
    }
    public Report_Table(int rport_id) {
        this.rport_id = rport_id;
    }

    public Report_Table(Date date) {
        this.date = date;
    }

    public void setRport_id(int rport_id) {
        this.rport_id = rport_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
      public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

 
    
    public String toString()
    {
       return (rport_id+" "+date+" "+data_table.getPost_id()+""+data_table.getImage1()+""+data_table.getDate1());
    }
}
