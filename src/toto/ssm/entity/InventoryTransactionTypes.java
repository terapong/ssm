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
 * InventoryTransactionTypes generated by hbm2java
 */
@Entity
@Table(name="inventory_transaction_types"
    ,catalog="ssm_test"
)
public class InventoryTransactionTypes  implements java.io.Serializable {


     private long id;
     private Date createDate;
     private String createUser;
     private String typeName;
     private Date updateDate;
     private Set inventoryTransactionses = new HashSet(0);

    public InventoryTransactionTypes() {
    }

	
    public InventoryTransactionTypes(long id) {
        this.id = id;
    }
    public InventoryTransactionTypes(long id, Date createDate, String createUser, String typeName, Date updateDate, Set inventoryTransactionses) {
       this.id = id;
       this.createDate = createDate;
       this.createUser = createUser;
       this.typeName = typeName;
       this.updateDate = updateDate;
       this.inventoryTransactionses = inventoryTransactionses;
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

    
    @Column(name="type_name")
    public String getTypeName() {
        return this.typeName;
    }
    
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="update_date", length=19)
    public Date getUpdateDate() {
        return this.updateDate;
    }
    
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="inventoryTransactionTypes")
    public Set getInventoryTransactionses() {
        return this.inventoryTransactionses;
    }
    
    public void setInventoryTransactionses(Set inventoryTransactionses) {
        this.inventoryTransactionses = inventoryTransactionses;
    }




}

