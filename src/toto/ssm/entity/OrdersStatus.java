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
 * OrdersStatus generated by hbm2java
 */
@Entity
@Table(name="orders_status"
    ,catalog="ssm_test"
)
public class OrdersStatus  implements java.io.Serializable {


     private long id;
     private Date createDate;
     private String createUser;
     private String statusName;
     private Date updateDate;
     private Set ordersOrdersStatuses = new HashSet(0);
     private Set ordersStatusOrderses = new HashSet(0);

    public OrdersStatus() {
    }

	
    public OrdersStatus(long id) {
        this.id = id;
    }
    public OrdersStatus(long id, Date createDate, String createUser, String statusName, Date updateDate, Set ordersOrdersStatuses, Set ordersStatusOrderses) {
       this.id = id;
       this.createDate = createDate;
       this.createUser = createUser;
       this.statusName = statusName;
       this.updateDate = updateDate;
       this.ordersOrdersStatuses = ordersOrdersStatuses;
       this.ordersStatusOrderses = ordersStatusOrderses;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="ordersStatus")
    public Set getOrdersOrdersStatuses() {
        return this.ordersOrdersStatuses;
    }
    
    public void setOrdersOrdersStatuses(Set ordersOrdersStatuses) {
        this.ordersOrdersStatuses = ordersOrdersStatuses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="ordersStatus")
    public Set getOrdersStatusOrderses() {
        return this.ordersStatusOrderses;
    }
    
    public void setOrdersStatusOrderses(Set ordersStatusOrderses) {
        this.ordersStatusOrderses = ordersStatusOrderses;
    }




}


