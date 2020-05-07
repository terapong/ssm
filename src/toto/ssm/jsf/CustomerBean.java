package toto.ssm.jsf;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.application.FacesMessage;

import toto.ssm.entity.*;
import toto.ssm.session.VaSession;

@ManagedBean(name = "customerbean")
@ViewScoped
public class CustomerBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Customer> slave;
	private Customer selectedRow;
	private Calendar cal;
	
	@ManagedProperty(value = "#{VaSessionbean}")
	private VaSessionbean vasessionbean;
	
	@EJB private VaSession session;
	
	@PostConstruct
	private void init() {
		cal = Calendar.getInstance();
		slave = session.querryAllCustomer();
	}
	
	@PreDestroy
	private void destroy() {
		
	}
	
	public void btnNewClick() {
		selectedRow = new Customer();
		selectedRow.setUpdateDate(cal.getTime());
	}
	
	public void btnSaveClick() {
		session.updateCustomer(selectedRow);
		init();
	}
	
	public void btnEditClick(Customer o) {
		selectedRow = o;
	}
	
	public void confirmDeleteClick() {
		try {
			session.deleteCustomer(selectedRow);
			init();
		} catch(Exception ex) {
			FacesMessage msg = new FacesMessage();
			msg.setSummary("ไม่สามารถ ลบ ได้");
			msg.setDetail("ไม่สามารถ ลบ ได้ เพราะมี ข้อมูลที่เกี่ยวข้อง");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}
	
	public void btnDeleteClick(Customer o) {
		selectedRow = o;
	}

	public List<Customer> getSlave() {
		return slave;
	}

	public void setSlave(List<Customer> slave) {
		this.slave = slave;
	}

	public Customer getSelectedRow() {
		return selectedRow;
	}

	public void setSelectedRow(Customer selectedRow) {
		this.selectedRow = selectedRow;
	}

	public VaSessionbean getVasessionbean() {
		return vasessionbean;
	}

	public void setVasessionbean(VaSessionbean vasessionbean) {
		this.vasessionbean = vasessionbean;
	}
}
