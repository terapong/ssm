package toto.ssm.entity;
// Generated May 7, 2020 10:21:16 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * OrderDetails generated by hbm2java
 */
@Entity
@Table(name="order_details"
    ,catalog="ssm_test"
)
public class OrderDetails  implements java.io.Serializable {


     private long id;
     private OrderDetailsStatus orderDetailsStatus;
     private Orders orders;
     private Products products;
     private Date createDate;
     private String createUser;
     private Date dateAllocated;
     private double discount;
     private Integer inventoryId;
     private Integer purchaseOrderId;
     private BigDecimal quantity;
     private BigDecimal unitPrice;
     private Date updateDate;

    public OrderDetails() {
    }

	
    public OrderDetails(long id, double discount) {
        this.id = id;
        this.discount = discount;
    }
    public OrderDetails(long id, OrderDetailsStatus orderDetailsStatus, Orders orders, Products products, Date createDate, String createUser, Date dateAllocated, double discount, Integer inventoryId, Integer purchaseOrderId, BigDecimal quantity, BigDecimal unitPrice, Date updateDate) {
       this.id = id;
       this.orderDetailsStatus = orderDetailsStatus;
       this.orders = orders;
       this.products = products;
       this.createDate = createDate;
       this.createUser = createUser;
       this.dateAllocated = dateAllocated;
       this.discount = discount;
       this.inventoryId = inventoryId;
       this.purchaseOrderId = purchaseOrderId;
       this.quantity = quantity;
       this.unitPrice = unitPrice;
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

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="status_id")
    public OrderDetailsStatus getOrderDetailsStatus() {
        return this.orderDetailsStatus;
    }
    
    public void setOrderDetailsStatus(OrderDetailsStatus orderDetailsStatus) {
        this.orderDetailsStatus = orderDetailsStatus;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="order_id")
    public Orders getOrders() {
        return this.orders;
    }
    
    public void setOrders(Orders orders) {
        this.orders = orders;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="product_id")
    public Products getProducts() {
        return this.products;
    }
    
    public void setProducts(Products products) {
        this.products = products;
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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_allocated", length=19)
    public Date getDateAllocated() {
        return this.dateAllocated;
    }
    
    public void setDateAllocated(Date dateAllocated) {
        this.dateAllocated = dateAllocated;
    }

    
    @Column(name="discount", nullable=false, precision=22, scale=0)
    public double getDiscount() {
        return this.discount;
    }
    
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    
    @Column(name="inventory_id")
    public Integer getInventoryId() {
        return this.inventoryId;
    }
    
    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    
    @Column(name="purchase_order_id")
    public Integer getPurchaseOrderId() {
        return this.purchaseOrderId;
    }
    
    public void setPurchaseOrderId(Integer purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    
    @Column(name="quantity")
    public BigDecimal getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    
    @Column(name="unit_price")
    public BigDecimal getUnitPrice() {
        return this.unitPrice;
    }
    
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
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

