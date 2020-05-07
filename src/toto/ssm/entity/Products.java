package toto.ssm.entity;
// Generated May 7, 2020 10:21:16 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
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
 * Products generated by hbm2java
 */
@Entity
@Table(name="products")
public class Products  implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
     private String attachments;
     private String category;
     private Date createDate;
     private String createUser;
     private String description;
     private String discontinued;
     private BigDecimal listPrice;
     private Integer minimumReorderQuantity;
     private String productCode;
     private String productName;
     private String quantityPerUnit;
     private Integer reorderLevel;
     private BigDecimal standardCost;
     private String supplierIds;
     private Integer targetLevel;
     private Date updateDate;
     private Set<InventoryTransactions> inventoryTransactionses = new HashSet<InventoryTransactions>(0);
     private Set<PurchaseOrderDetails> purchaseOrderDetailses = new HashSet<PurchaseOrderDetails>(0);
     private Set<OrderDetails> orderDetailses = new HashSet<OrderDetails>(0);

    public Products() {
    }

	
    public Products(long id) {
        this.id = id;
    }
    public Products(long id, String attachments, String category, Date createDate, String createUser, String description, String discontinued, BigDecimal listPrice, Integer minimumReorderQuantity, String productCode, String productName, String quantityPerUnit, Integer reorderLevel, BigDecimal standardCost, String supplierIds, Integer targetLevel, Date updateDate, Set<InventoryTransactions> inventoryTransactionses, Set<PurchaseOrderDetails> purchaseOrderDetailses, Set<OrderDetails> orderDetailses) {
       this.id = id;
       this.attachments = attachments;
       this.category = category;
       this.createDate = createDate;
       this.createUser = createUser;
       this.description = description;
       this.discontinued = discontinued;
       this.listPrice = listPrice;
       this.minimumReorderQuantity = minimumReorderQuantity;
       this.productCode = productCode;
       this.productName = productName;
       this.quantityPerUnit = quantityPerUnit;
       this.reorderLevel = reorderLevel;
       this.standardCost = standardCost;
       this.supplierIds = supplierIds;
       this.targetLevel = targetLevel;
       this.updateDate = updateDate;
       this.inventoryTransactionses = inventoryTransactionses;
       this.purchaseOrderDetailses = purchaseOrderDetailses;
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

    
    @Column(name="attachments")
    public String getAttachments() {
        return this.attachments;
    }
    
    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

    
    @Column(name="category")
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
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

    
    @Column(name="description")
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="discontinued")
    public String getDiscontinued() {
        return this.discontinued;
    }
    
    public void setDiscontinued(String discontinued) {
        this.discontinued = discontinued;
    }

    
    @Column(name="list_price")
    public BigDecimal getListPrice() {
        return this.listPrice;
    }
    
    public void setListPrice(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }

    
    @Column(name="minimum_reorder_quantity")
    public Integer getMinimumReorderQuantity() {
        return this.minimumReorderQuantity;
    }
    
    public void setMinimumReorderQuantity(Integer minimumReorderQuantity) {
        this.minimumReorderQuantity = minimumReorderQuantity;
    }

    
    @Column(name="product_code")
    public String getProductCode() {
        return this.productCode;
    }
    
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    
    @Column(name="product_name")
    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }

    
    @Column(name="quantity_per_unit")
    public String getQuantityPerUnit() {
        return this.quantityPerUnit;
    }
    
    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    
    @Column(name="reorder_level")
    public Integer getReorderLevel() {
        return this.reorderLevel;
    }
    
    public void setReorderLevel(Integer reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    
    @Column(name="standard_cost")
    public BigDecimal getStandardCost() {
        return this.standardCost;
    }
    
    public void setStandardCost(BigDecimal standardCost) {
        this.standardCost = standardCost;
    }

    
    @Column(name="supplier_ids")
    public String getSupplierIds() {
        return this.supplierIds;
    }
    
    public void setSupplierIds(String supplierIds) {
        this.supplierIds = supplierIds;
    }

    
    @Column(name="target_level")
    public Integer getTargetLevel() {
        return this.targetLevel;
    }
    
    public void setTargetLevel(Integer targetLevel) {
        this.targetLevel = targetLevel;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="update_date", length=19)
    public Date getUpdateDate() {
        return this.updateDate;
    }
    
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="products")
    public Set<InventoryTransactions> getInventoryTransactionses() {
        return this.inventoryTransactionses;
    }
    
    public void setInventoryTransactionses(Set<InventoryTransactions> inventoryTransactionses) {
        this.inventoryTransactionses = inventoryTransactionses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="products")
    public Set<PurchaseOrderDetails> getPurchaseOrderDetailses() {
        return this.purchaseOrderDetailses;
    }
    
    public void setPurchaseOrderDetailses(Set<PurchaseOrderDetails> purchaseOrderDetailses) {
        this.purchaseOrderDetailses = purchaseOrderDetailses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="products")
    public Set<OrderDetails> getOrderDetailses() {
        return this.orderDetailses;
    }
    
    public void setOrderDetailses(Set<OrderDetails> orderDetailses) {
        this.orderDetailses = orderDetailses;
    }




}


