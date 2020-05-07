package toto.ssm.entity;
// Generated May 7, 2020 10:21:16 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * OrderDetailsStatus generated by hbm2java
 */
@Entity
@Table(name="order_details_status"
    ,catalog="ssm_test"
)
public class OrderDetailsStatus  implements java.io.Serializable {


     private long id;
     private Date createDate;
     private String createUser;
     private String statusName;
     private Date updateDate;
     private Set orderDetailses = new HashSet(0);

    public OrderDetailsStatus() {
    }

	
    public OrderDetailsStatus(long id) {
        this.id = id;
    }
    public OrderDetailsStatus(long id, Date createDate, String createUser, String statusName, Date updateDate, Set orderDetailses) {
       this.id = id;
       this.createDate = createDate;
       this.createUser = createUser;
       this.statusName = statusName;
       this.updateDate = updateDate;
       this.orderDetailses = orderDetailses;
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

    
    @Column(name="status_name")
    public String getStatusName() {
        return this.statusName;
    }
    
    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="update_date", length=19)
    public Date getUpdateDate() {
        return this.updateDate;
    }
    
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="orderDetailsStatus")
    public Set getOrderDetailses() {
        return this.orderDetailses;
    }
    
    public void setOrderDetailses(Set orderDetailses) {
        this.orderDetailses = orderDetailses;
    }




}

