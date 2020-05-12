package toto.ssm.session;

import java.io.Serializable;
import java.util.List;
import javax.ejb.*;
import toto.ssm.entity.*;
import javax.persistence.*;

@Stateless
@LocalBean
public class VaSession implements Serializable{
	private static final long serialVersionUID = 1L;
	//private static final transient Logger log  Logger.getLogger("VaSession");
	
	@PersistenceContext(unitName="ssm_test_exportPU")
	EntityManager em;
	
	public List<Suppliers> querryAllSuppliers() {
		return em.createNativeQuery("select * from Suppliers", Suppliers.class).getResultList();
	}
	
	public Suppliers querrySuppliersById(long id) {
		return em.find(Suppliers.class, id);
	}
	public void updateSuppliers(Suppliers p) {
		em.merge(p);
	}
	
	public void deleteSuppliers(Suppliers p) {
		p = querrySuppliersById(p.getId());
		em.remove(p);
	}

	public List<Project> querryAllProject() {
		return em.createNativeQuery("select * from Project", Project.class).getResultList();
	}
	
	public Project querryProjectById(long id) {
		return em.find(Project.class, id);
	}
	
	public void updateProject(Project p) {
		em.merge(p);
	}
	
	public void deleteProject(Project p) {
		p = querryProjectById(p.getId());
		em.remove(p);
	}
	
	public List<Plant> querryAllPlant() {
		return em.createNativeQuery("select * from plant", Plant.class).getResultList();
	}
	
	public Plant querryPlantById(long id) {
		return em.find(Plant.class, id);
	}
	
	public void updatePlant(Plant p) {
		em.merge(p);
	}
	
	public void deletePlant(Plant p) {
		p = querryPlantById(p.getId());
		em.remove(p);
	}
	
	public List<Privileges> querryAllPrivilege() {
		return em.createNativeQuery("select * from privileges", Privileges.class).getResultList();
	}
	
	public Privileges querryPrivilegeById(long id) {
		return em.find(Privileges.class, id);
	}
	
	public void updatePrivilege(Privileges r) {
		em.merge(r);
	}
	
	public void deletePrivilege(Privileges r) throws Exception {
		r = querryPrivilegeById(r.getId());
		em.remove(r);
	}
	
	public List<Employees> querryAllEmployee() {
		return em.createNativeQuery("select * from employees", Employees.class).getResultList(); 
	}
	
	public List<Employees> querryEmployeeByPrivilegeID(long id) {
		return (List) em.createNativeQuery("select * from employees where privilege_id = " + id, Employees.class).getResultList();
	}
	
	public Employees querryEmployeeById(long id) {
		return em.find(Employees.class, id );
	}
	
	public void updateEmployee(Employees u) {
		em.merge(u);
	}
	
	public void deleteEmployee(Employees u) throws Exception {
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
	
	public List<SalesReports> querryAllSalesReport() {
		return em.createNativeQuery("select * from sales_reports", SalesReports.class).getResultList();
	}
	
	public SalesReports querrySalesReporstById(long id) {
		return em.find(SalesReports.class, id );
	}
	
	public void updateSalesReport(SalesReports c) {
		em.merge(c);
	}
	
	public void deleteSalesReport(SalesReports c) {
		c = querrySalesReporstById(c.getId());
		em.remove(c);
	}
	
	public List<InventoryTransactionTypes> querryAllInventoryTransactionType() {
		return em.createNativeQuery("select * from inventory_transaction_types", InventoryTransactionTypes.class).getResultList();
	}
	
	public InventoryTransactionTypes querryInventoryTransactionTypeById(long id) {
		return em.find(InventoryTransactionTypes.class, id );
	}
	
	public void updateInventoryTransactionType(InventoryTransactionTypes c) {
		em.merge(c);
	}
	
	public void deleteInventoryTransactionType(InventoryTransactionTypes c) {
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
	
	public List<Orders> querryAllOrder() {
		return em.createNativeQuery("select * from orders", Orders.class).getResultList();
	}
	
	public List<Orders> querryAllOrderByCustomerID(Long id) {
		return em.createNativeQuery("select * from orders where customer_id = " + id, Orders.class).getResultList();
	}
	
	public List<Orders> querryAllOrderByPlantID(Long id) {
		return em.createNativeQuery("select * from orders where plant_id = " + id, Orders.class).getResultList();
	}
	
	public Orders querryOrderById(long id) {
		return em.find(Orders.class, id );
	}
	
	public void updateOrders(Orders c) {
		em.merge(c);
	}
	
	public void deleteOrder(Orders c) {
		c = querryOrderById(c.getId());
		em.remove(c);
	}
}
