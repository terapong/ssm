package toto.ssm.entity;
// Generated May 7, 2020 10:21:16 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OrdersStatusOrdersId generated by hbm2java
 */
@Embeddable
public class OrdersStatusOrdersId  implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private long ordersStatusId;
     private long ordersId;

    public OrdersStatusOrdersId() {
    }

    public OrdersStatusOrdersId(long ordersStatusId, long ordersId) {
       this.ordersStatusId = ordersStatusId;
       this.ordersId = ordersId;
    }
   


    @Column(name="OrdersStatus_id", nullable=false)
    public long getOrdersStatusId() {
        return this.ordersStatusId;
    }
    
    public void setOrdersStatusId(long ordersStatusId) {
        this.ordersStatusId = ordersStatusId;
    }


    @Column(name="orders_id", nullable=false)
    public long getOrdersId() {
        return this.ordersId;
    }
    
    public void setOrdersId(long ordersId) {
        this.ordersId = ordersId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof OrdersStatusOrdersId) ) return false;
		 OrdersStatusOrdersId castOther = ( OrdersStatusOrdersId ) other; 
         
		 return (this.getOrdersStatusId()==castOther.getOrdersStatusId())
 && (this.getOrdersId()==castOther.getOrdersId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getOrdersStatusId();
         result = 37 * result + (int) this.getOrdersId();
         return result;
   }   


}


