package toto.ssm.entity;
// Generated May 7, 2020 10:21:16 AM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SalesReports generated by hbm2java
 */
@Entity
@Table(name="sales_reports")
public class SalesReports  implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
     private Date createDate;
     private String createUser;
     private String defaultvalue;
     private String display;
     private String filterRowSource;
     private String groupBy;
     private String title;
     private Date updateDate;

    public SalesReports() {
    }

	
    public SalesReports(long id) {
        this.id = id;
    }
    public SalesReports(long id, Date createDate, String createUser, String defaultvalue, String display, String filterRowSource, String groupBy, String title, Date updateDate) {
       this.id = id;
       this.createDate = createDate;
       this.createUser = createUser;
       this.defaultvalue = defaultvalue;
       this.display = display;
       this.filterRowSource = filterRowSource;
       this.groupBy = groupBy;
       this.title = title;
       this.updateDate = updateDate;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_date", length=19)
    public Date getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    
    @Column(name="create_user")
    public String getCreateUser() {
        return this.createUser;
    }
    
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    
    @Column(name="defaultvalue")
    public String getDefaultvalue() {
        return this.defaultvalue;
    }
    
    public void setDefaultvalue(String defaultvalue) {
        this.defaultvalue = defaultvalue;
    }

    
    @Column(name="display")
    public String getDisplay() {
        return this.display;
    }
    
    public void setDisplay(String display) {
        this.display = display;
    }

    
    @Column(name="filter_row_source")
    public String getFilterRowSource() {
        return this.filterRowSource;
    }
    
    public void setFilterRowSource(String filterRowSource) {
        this.filterRowSource = filterRowSource;
    }

    
    @Column(name="group_by")
    public String getGroupBy() {
        return this.groupBy;
    }
    
    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    
    @Column(name="title")
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="update_date", length=19)
    public Date getUpdateDate() {
        return this.updateDate;
    }
    
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }




}


