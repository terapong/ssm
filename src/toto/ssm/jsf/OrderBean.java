package toto.ssm.jsf;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import toto.ssm.entity.*;
import toto.ssm.session.VaSession;

@ManagedBean(name = "orderbean")
@ViewScoped
public class OrderBean implements Serializable {
	private static final long serialVersionUID = 1L;
	//Plant zone
	private List<Plant> master;
	private Plant selectedMaster;
	private Plant selectedMasterTable;
	private Plant selectedMasterOverlay;
	private long selectedMasterId;
	private String mode_plant;
	
	//Customer zone
	private List<Customer> customers;
	private Customer selectCustomer;
	private Customer selectCustomerTable;
	private Customer selectCustomerOverlay;
	private String mode_customer;
	
	//Project zone
	private List<Project> projects;
	private Project selectProject;
	private Project selectProjectTable;
	private Project selectProjectOverlay;
	private String mode_project;
	
	//Order zone
	private List<Orders> slave;
	private Orders selectOrder;
	private Orders selectOrderOverlay;
	private String addDisabled;
	private List<OrdersStatus> OrderStatus;
	private String mode_order;
	
	private Calendar cal;
	
	
	@ManagedProperty(value = "#{vaSessionbean}")
	private VaSessionbean vasessionbean;
	
	@EJB private VaSession session;
	
	@PostConstruct
	private void init() {
		cal = Calendar.getInstance();
		master = session.querryAllPlant();
		customers = session.querryAllCustomer();
		projects = session.querryAllProject();
		if(master.isEmpty()) {
			addDisabled = "true";
		} else {
			addDisabled = "false";
			if(selectedMaster == null) {
				selectedMaster = master.get(0);
				//selectedRow = selectedMaster.getEmployees().get(0);
			}
		}
		//slave = session.querryAllOrderByPlantID(selectedMaster.getId());
		selectedMasterId = selectedMaster.getId();
		mode_plant = "ADD";
		mode_customer = "ADD";
		mode_project = "ADD";
		mode_order = "ADD";
		selectedMaster = new Plant();
	}
	
	@PreDestroy
	private void destroy() {
		
	}
	
	public void onRowMasterSelect() {
		System.out.println("Plant name :" + selectedMasterOverlay.getCompany());
	}
	
	public void onRowCustomerSelect() {
		System.out.println("Customer name :" + selectCustomerOverlay.getCompany());
	}
	
	public void onRowProjectSelect() {
		System.out.println("Project name :" + selectProjectOverlay.getProjectName());
	}
	
	public void onRowOrderSelect() {
		System.out.println("Order name :" + selectOrderOverlay.getShipName());
	}

	public void btnNewPlantClick() {
		mode_plant = "ADD";
		selectedMaster = new Plant();
		selectedMaster.setCreateDate(cal.getTime());
		selectedMaster.setUpdateDate(cal.getTime());
		//slave = session.querryAllPlant();
	}
	
	public void btnNewCustomerClick() {
		mode_customer = "ADD";
		selectCustomer= new Customer();
		selectCustomer.setCreateDate(cal.getTime());
		selectCustomer.setUpdateDate(cal.getTime());
	}
	
	public void btnNewProjectClick() {
		mode_project = "ADD";
		selectProject= new Project();
		selectProject.setCreateDate(cal.getTime());
		selectProject.setUpdateDate(cal.getTime());
	}
	
	public void btnSavePlantClick() {
		if(mode_plant.equals("ADD") || mode_plant.equals("EDIT")) {
			session.updatePlant(selectedMaster);
			master = session.querryAllPlant();
			btnNewPlantClick();
			//slave = session.querryAllOrderByPlantID(selectedMaster.getId());
			//selectedMasterId = selectedMaster.getId();
		} 
	}
	
	public void btnSaveCustomerClick() {
		if(mode_customer.equals("ADD") || mode_customer.equals("EDIT")) {
			session.updateCustomer(selectCustomer);
			customers = session.querryAllCustomer();
			btnNewCustomerClick();
			//slave = session.querryAllOrderByPlantID(selectedMaster.getId());
			//selectedMasterId = selectedMaster.getId();
		} 
	}
	
	public void btnSaveProjectClick() {
		if(mode_project.equals("ADD") || mode_project.equals("EDIT")) {
			session.updateProject(selectProject);
			projects = session.querryAllProject();
			btnNewProjectClick();
			//slave = session.querryAllOrderByPlantID(selectedMaster.getId());
			//selectedMasterId = selectedMaster.getId();
		} 
	}
	
	public void btnEditPlantClick(Plant o) {
		selectedMaster = o;
		selectedMaster.setUpdateDate(cal.getTime());
		mode_plant = "EDIT";
	}
	
	public void btnEditCustomerClick(Customer o) {
		selectCustomer = o;
		selectCustomer.setUpdateDate(cal.getTime());
		mode_plant = "EDIT";
	}
	
	public void btnEditProjectClick(Project o) {
		selectProject = o;
		selectProject.setUpdateDate(cal.getTime());
		mode_project = "EDIT";
	}
	
	public void confirmDeletePlantClick() {
		try {
			session.deletePlant(selectedMaster);
			master = session.querryAllPlant();
			btnNewPlantClick();
		} catch(Exception ex) {
			FacesMessage msg = new FacesMessage();
			msg.setSummary("ไม่สามารถ ลบ ได้");
			msg.setDetail("ไม่สามารถ ลบ ได้ เพราะมี ข้อมูลที่เกี่ยวข้อง");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}
	
	public void confirmDeleteCustomClick() {
		try {
			session.deleteCustomer(selectCustomer);
			customers = session.querryAllCustomer();
			btnNewCustomerClick();
		} catch(Exception ex) {
			FacesMessage msg = new FacesMessage();
			msg.setSummary("ไม่สามารถ ลบ ได้");
			msg.setDetail("ไม่สามารถ ลบ ได้ เพราะมี ข้อมูลที่เกี่ยวข้อง");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}
	
	public void confirmDeleteProjectClick() {
		try {
			session.deleteProject(selectProject);
			customers = session.querryAllCustomer();
			btnNewCustomerClick();
		} catch(Exception ex) {
			FacesMessage msg = new FacesMessage();
			msg.setSummary("ไม่สามารถ ลบ ได้");
			msg.setDetail("ไม่สามารถ ลบ ได้ เพราะมี ข้อมูลที่เกี่ยวข้อง");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}
	
	public void btnDeletePlantClick(Plant o) {
		selectedMaster = o;
		mode_plant = "DELETE";
	}
	
	public void btnDeleteCustomerClick(Customer o) {
		selectCustomer = o;
		mode_customer = "DELETE";
	}
	
	public void btnDeleteProjectClick(Project o) {
		selectProject = o;
		mode_project = "DELETE";
	}
	
	public void btnNewOrderClick() {
//		selectedRow = new Orders();
//		selectedRow.setCustomer(selectedMaster);
//		selectedRow.setCreateDate(cal.getTime());
//		selectedRow.setUpdateDate(cal.getTime());
		//selectedRow.setCreateUser(vasessionbean.getUsername());
	}
	
	public void btnSaveOrderClick() {
//		try {
//			selectedRow.setCustomer(selectedMaster);
//			selectedRow.setUpdateDate(cal.getTime());
//			selectedRow.setEmployees(null);
//			selectedRow.setOrdersStatusOrderses(null);
//			selectedRow.setTaxes(null);
//			session.updateOrders(selectedRow);
//			
//		} catch(Exception ex) {
//			ex.printStackTrace();
//		}
//		init();
	}
	
	public void btnOrderStatusClick(Orders o) {
//		OrderStatus = session.querryAllOrdersStatus();
//		
//		System.out.println("1111111111111111111vvvvvv");
//		//slave order = selectedMaster.getOrders;
	}
	
	public void newAddOrderStatusClick() {
		System.out.println("222222");
	}

	public void btnEditOrderClick(Orders o) {
		selectOrder = o;
	}
	
	public void confirmDeleteOrderClick() {
		try {
			session.deleteOrder(selectOrder);
			init();
		} catch(Exception ex) {
			FacesMessage msg = new FacesMessage();
			msg.setSummary("ไม่สามารถ ลบ ได้");
			msg.setDetail("ไม่สามารถ ลบ ได้ เพราะมี ข้อมูลที่เกี่ยวข้อง");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}
	
	public void btnDeleteOrderClick(Orders o) {
		selectOrder = o;
	}
	
//	public void selMasterChange() {
//		selectedMaster = session.querryCustomerById(selectedMasterId);
//		slave = session.querryAllOrderByCustomerID(selectedMasterId);
//		System.out.println("test");
		//slave = selectedMaster.getOrders();
//		for(Order r : slave) {
//			if(r.getUserName().equals("admin")) {
//				r.setRenderedDelete("false");
//			} else {
//				r.setRenderedDelete("true");
//			}
//		}
//	}

	public List<Plant> getMaster() {
		return master;
	}	

	public void setMaster(List<Plant> master) {
		this.master = master;
	}

	public Plant getSelectedMaster() {
		return selectedMaster;
	}

	public void setSelectedMaster(Plant selectedMaster) {
		this.selectedMaster = selectedMaster;
	}

	public List<Orders> getSlave() {
		return slave;
	}

	public void setSlave(List<Orders> slave) {
		this.slave = slave;
	}

	public Orders getSelectOrder() {
		return selectOrder;
	}

	public void setSelectOrder(Orders selectOrder) {
		this.selectOrder = selectOrder;
	}

	public Orders getSelectOrderOverlay() {
		return selectOrderOverlay;
	}

	public void setSelectOrderOverlay(Orders selectOrderOverlay) {
		this.selectOrderOverlay = selectOrderOverlay;
	}

	public VaSession getSession() {
		return session;
	}

	public void setSession(VaSession session) {
		this.session = session;
	}

	public long getSelectedMasterId() {
		return selectedMasterId;
	}

	public void setSelectedMasterId(long selectedMasterId) {
		this.selectedMasterId = selectedMasterId;
	}

	public VaSessionbean getVasessionbean() {
		return vasessionbean;
	}

	public void setVasessionbean(VaSessionbean vasessionbean) {
		this.vasessionbean = vasessionbean;
	}

	public String getAddDisabled() {
		return addDisabled;
	}

	public void setAddDisabled(String addDisabled) {
		this.addDisabled = addDisabled;
	}

	public List<OrdersStatus> getOrderStatus() {
		return OrderStatus;
	}

	public void setOrderStatus(List<OrdersStatus> orderStatus) {
		OrderStatus = orderStatus;
	}

	public Plant getSelectedMasterTable() {
		return selectedMasterTable;
	}

	public void setSelectedMasterTable(Plant selectedMasterTable) {
		this.selectedMasterTable = selectedMasterTable;
	}

	public String getMode_plant() {
		return mode_plant;
	}

	public void setMode_plant(String mode_plant) {
		this.mode_plant = mode_plant;
	}

	public String getMode_customer() {
		return mode_customer;
	}

	public void setMode_customer(String mode_customer) {
		this.mode_customer = mode_customer;
	}

	public String getMode_order() {
		return mode_order;
	}

	public void setMode_order(String mode_order) {
		this.mode_order = mode_order;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Customer getSelectCustomer() {
		return selectCustomer;
	}

	public void setSelectCustomer(Customer selectCustomer) {
		this.selectCustomer = selectCustomer;
	}

	public Customer getSelectCustomerOverlay() {
		return selectCustomerOverlay;
	}

	public void setSelectCustomerOverlay(Customer selectCustomerOverlay) {
		this.selectCustomerOverlay = selectCustomerOverlay;
	}

	public Customer getSelectCustomerTable() {
		return selectCustomerTable;
	}

	public void setSelectCustomerTable(Customer selectCustomerTable) {
		this.selectCustomerTable = selectCustomerTable;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Project getSelectProject() {
		return selectProject;
	}

	public void setSelectProject(Project selectProject) {
		this.selectProject = selectProject;
	}

	public Project getSelectProjectTable() {
		return selectProjectTable;
	}

	public void setSelectProjectTable(Project selectProjectTable) {
		this.selectProjectTable = selectProjectTable;
	}

	public Project getSelectProjectOverlay() {
		return selectProjectOverlay;
	}

	public void setSelectProjectOverlay(Project selectProjectOverlay) {
		this.selectProjectOverlay = selectProjectOverlay;
	}
	
	public String getMode_project() {
		return mode_project;
	}

	public void setMode_project(String mode_project) {
		this.mode_project = mode_project;
	}

	public Plant getSelectedMasterOverlay() {
		return selectedMasterOverlay;
	}

	public void setSelectedMasterOverlay(Plant selectedMasterOverlay) {
		this.selectedMasterOverlay = selectedMasterOverlay;
	}
}
