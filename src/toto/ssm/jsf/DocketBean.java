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

@ManagedBean(name = "docketbean")
@ViewScoped
public class DocketBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Customer> master;
	private Customer selectedMaster;
	private long selectedMasterId;
	private List<Order> slave;
	private Order selectedRow;
	
	private Calendar cal;
	
	@ManagedProperty(value = "#{VaSessionbean}")
	private VaSessionbean vasessionbean;
	
	@EJB private VaSession session;
	
	@PostConstruct
	private void init() {
		cal = Calendar.getInstance();
		master = session.querryAllCustomer();
		selectedMaster = master.get(0);
		slave = session.querryAllOrderByCustomerID(selectedMaster.getId());
//		if(master.isEmpty()) {
//			addDisabled = "true";
//		} else {
//			addDisabled = "false";
//			if(selectedMaster == null) {
//				selectedMaster = master.get(0);
//				//selectedRow = selectedMaster.getEmployees().get(0);
//			}
//			slave = session.querryEmployeeByPrivilegeID(selectedMaster.getId());
//			selectedMasterId = selectedMaster.getId();
//			
//			for(Employee r : slave) {
//				if(r.getUserName().equals("admin")) {
//					r.setRenderedDelete("false");
//				} else {
//					r.setRenderedDelete("true");
//				}
//			}
//		}
	}
	
	@PreDestroy
	private void destroy() {
		
	}
	
	public void btnNewClick() {
		selectedRow = new Order();
		selectedRow.setCustomer(selectedMaster);
		selectedRow.setCreateDate(cal.getTime());
		selectedRow.setUpdateDate(cal.getTime());
	}
	
	public void btnSaveClick() {
		try {
			selectedRow.setCustomer(selectedMaster);
			selectedRow.setUpdateDate(cal.getTime());
			selectedRow.setEmployee(null);
			selectedRow.setOrdersStatus(null);
			selectedRow.setTaxes(null);
			session.updateOrders(selectedRow);
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		init();
	}

		public void btnEditClick(Order o) {
		selectedRow = o;
	}
	
	public void confirmDeleteClick() {
		try {
			session.deleteOrder(selectedRow);
			init();
		} catch(Exception ex) {
			FacesMessage msg = new FacesMessage();
			msg.setSummary("ไม่สามารถ ลบ ได้");
			msg.setDetail("ไม่สามารถ ลบ ได้ เพราะมี ข้อมูลที่เกี่ยวข้อง");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}
	
	public void btnDeleteClick(Order o) {
		selectedRow = o;
	}
	
	public void selMasterChange() {
		selectedMaster = session.querryCustomerById(selectedMasterId);
		slave = session.querryAllOrderByCustomerID(selectedMasterId);
		System.out.println("test");
		//slave = selectedMaster.getOrders();
//		for(Order r : slave) {
//			if(r.getUserName().equals("admin")) {
//				r.setRenderedDelete("false");
//			} else {
//				r.setRenderedDelete("true");
//			}
//		}
	}

	public List<Customer> getMaster() {
		return master;
	}	

	public void setMaster(List<Customer> master) {
		this.master = master;
	}

	public Customer getSelectedMaster() {
		return selectedMaster;
	}

	public void setSelectedMaster(Customer selectedMaster) {
		this.selectedMaster = selectedMaster;
	}

	public List<Order> getSlave() {
		return slave;
	}

	public void setSlave(List<Order> slave) {
		this.slave = slave;
	}

	public Order getSelectedRow() {
		return selectedRow;
	}

	public void setSelectedRow(Order selectedRow) {
		this.selectedRow = selectedRow;
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
}
