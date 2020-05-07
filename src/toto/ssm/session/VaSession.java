package toto.ssm.session;

import java.io.Serializable;
import java.util.List;
import java.util.logging.*;
import javax.ejb.*;
import toto.ssm.entity.*;
import javax.persistence.*;

@Stateless
@LocalBean
public class VaSession implements Serializable{
	//private static final long serialVersionUID = 1L;
	private static final transient Logger log = Logger.getLogger("VaSession");
	
	@PersistenceContext(unitName="ssmPU")
	EntityManager em;

	public List<Privilege> querryAllPrivilege() {
		return em.createNativeQuery("select * from privileges", Privilege.class).getResultList();
	}
	
	public Privilege querryPrivilegeById(long id) {
		return em.find(Privilege.class, id);
	}
	
	public void updatePrivilege(Privilege r) {
		em.merge(r);
	}
	
	public void deletePrivilege(Privilege r) throws Exception {
		r = querryPrivilegeById(r.getId());
		em.remove(r);
	}
	
	public List<Employee> querryAllEmployee() {
		return em.createNativeQuery("select * from employees", Employee.class).getResultList(); 
	}
	
	public List<Employee> querryEmployeeByPrivilegeID(long id) {
		return em.createNativeQuery("select * from employees where privilege_id = " + id, Employee.class).getResultList();
	}
	
	public Employee querryEmployeeById(long id) {
		return em.find(Employee.class, id );
	}
	
	public void updateEmployee(Employee u) {
		em.merge(u);
	}
	
	public void deleteEmployee(Employee u) throws Exception {
		u = querryEmployeeById(u.getId());
		em.remove(u);
	}
	
	public List<Customer> querryAllCustomer() {
		return em.createNativeQuery("select * from customer", Customer.class).getResultList();
	}
	
	public Customer querryCustomerById(long id) {
		return em.find(Customer.class, id );
	}
	
	public void updateCustomer(Customer c) {
		em.merge(c);
	}
	
	public void deleteCustomer(Customer c) {
		c = querryCustomerById(c.getId());
		em.remove(c);
	}
	
	public List<OrdersTaxStatus> querryAllOrdersTaxStatus() {
		return em.createNativeQuery("select * from orders_tax_status", OrdersTaxStatus.class).getResultList();
	}
	
	public OrdersTaxStatus querryOrdersTaxStatusById(long id) {
		return em.find(OrdersTaxStatus.class, id );
	}
	
	public void updateOrderTaxStatus(OrdersTaxStatus c) {
		em.merge(c);
	}
	
	public void deleteOrderTaxStatus(OrdersTaxStatus c) {
		c = querryOrdersTaxStatusById(c.getId());
		em.remove(c);
	}
	
	public List<OrdersStatus> querryAllOrderID() {
		return em.createNativeQuery("select * from orders_status", OrdersStatus.class).getResultList();
	}
	
	public List<OrdersStatus> querryAllOrdersStatus() {
		return em.createNativeQuery("select * from orders_status", OrdersStatus.class).getResultList();
	}
	
	public List<OrdersStatus> querryAllOrdersStatusByOrderID(Long id) {
		return em.createNativeQuery("select * from status_id where status_id =" + id, OrdersStatus.class).getResultList();
	}
	
	public OrdersStatus querryOrdersStatusById(long id) {
		return em.find(OrdersStatus.class, id );
	}
	
	public void updateOrderStatus(OrdersStatus c) {
		em.merge(c);
	}
	
	public void deleteOrderStatus(OrdersStatus c) {
		c = querryOrdersStatusById(c.getId());
		em.remove(c);
	}
	
	public List<SalesReport> querryAllSalesReport() {
		return em.createNativeQuery("select * from sales_reports", OrdersStatus.class).getResultList();
	}
	
	public SalesReport querrySalesReporstById(long id) {
		return em.find(SalesReport.class, id );
	}
	
	public void updateSalesReport(SalesReport c) {
		em.merge(c);
	}
	
	public void deleteSalesReport(SalesReport c) {
		c = querrySalesReporstById(c.getId());
		em.remove(c);
	}
	
	public List<InventoryTransactionType> querryAllInventoryTransactionType() {
		return em.createNativeQuery("select * from inventory_transaction_types", InventoryTransactionType.class).getResultList();
	}
	
	public InventoryTransactionType querryInventoryTransactionTypeById(long id) {
		return em.find(InventoryTransactionType.class, id );
	}
	
	public void updateInventoryTransactionType(InventoryTransactionType c) {
		em.merge(c);
	}
	
	public void deleteInventoryTransactionType(InventoryTransactionType c) {
		c = querryInventoryTransactionTypeById(c.getId());
		em.remove(c);
	}
	
	public List<PurchaseOrderStatus> querryAllPurchaseOrderStatus() {
		return em.createNativeQuery("select * from purchase_order_status", PurchaseOrderStatus.class).getResultList();
	}
	
	public PurchaseOrderStatus querryPurchaseOrderStatusById(long id) {
		return em.find(PurchaseOrderStatus.class, id );
	}
	
	public void updatePurchaseOrderStatus(PurchaseOrderStatus c) {
		em.merge(c);
	}
	
	public void deletePurchaseOrderStatus(PurchaseOrderStatus c) {
		c = querryPurchaseOrderStatusById(c.getId());
		em.remove(c);
	}
	
	public List<Order> querryAllOrder() {
		return em.createNativeQuery("select * from order", PurchaseOrderStatus.class).getResultList();
	}
	
	public List<Order> querryAllOrderByCustomerID(Long id) {
		return em.createNativeQuery("select * from orders where customer_id = " + id, Order.class).getResultList();
	}
	
	public Order querryOrderById(long id) {
		return em.find(Order.class, id );
	}
	
	public void updateOrders(Order c) {
		em.merge(c);
	}
	
	public void deleteOrder(Order c) {
		c = querryOrderById(c.getId());
		em.remove(c);
	}
}
