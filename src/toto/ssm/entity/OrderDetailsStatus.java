package toto.ssm.entity;
// Generated May 7, 2020 10:21:16 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * OrderDetailsStatus generated by hbm2java
 */
@Entity
@Table(name="order_details_status")
public class OrderDetailsStatus  implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
     private Date createDate;
     private String createUser;
     private String statusName;
     private Date updateDate;
     private List<OrderDetails> orderDetailses = new ArrayList<OrderDetails>(0);

    public OrderDetailsStatus() {
    }

	
    public OrderDetailsStatus(long id) {
        this.id = id;
    }
    public OrderDetailsStatus(long id, Date createDate, String createUser, String statusName, Date updateDate, List<OrderDetails> orderDetailses) {
       this.id = id;
       this.createDate = createDate;
       this.createUser = createUser;
       this.statusName = statusName;
       this.updateDate = updateDate;
       this.orderDetailses = orderDetailses;
    }
   
    @TableGenerator(
            name="SSMGen", 
            table="ID_GEN", 
            pkColumnName="GEN_KEY", 
            valueColumnName="GEN_VALUE", 
            pkColumnValue="ORDERDETAILSTATUS_ID", 
            allocationSize=1)
    @Id 
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.TABLE, generator="SSMGen")
    public long getId() {
        return this.id;
    }
    
    public void ListId(long id) {
        this.id = id;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_date", length=19)
    public Date getCreateDate() {
        return this.createDate;
    }
    
    public void ListCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    
    @Column(name="create_user")
    public String getCreateUser() {
        return this.createUser;
    }
    
    public void ListCreateUser(String createUser) {
        this.createUser = createUser;
    }

    
    @Column(name="status_name")
    public String getStatusName() {
        return this.statusName;
    }
    
    public void ListStatusName(String statusName) {
        this.statusName = statusName;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="update_date", length=19)
    public Date getUpdateDate() {
        return this.updateDate;
    }
    
    public void ListUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="orderDetailsStatus")
    public List<OrderDetails> getOrderDetailses() {
        return this.orderDetailses;
    }
    
    public void ListOrderDetailses(List<OrderDetails> orderDetailses) {
        this.orderDetailses = orderDetailses;
    }


	public void setId(long id) {
		this.id = id;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}


	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}


	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}


	public void setOrderDetailses(List<OrderDetails> orderDetailses) {
		this.orderDetailses = orderDetailses;
	}




}


