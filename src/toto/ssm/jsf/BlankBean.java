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

import toto.ssm.entity.Customer;
import toto.ssm.entity.Order;
import toto.ssm.entity.OrdersStatus;
import toto.ssm.entity.XtblDocket;
import toto.ssm.session.VaSession;

@ManagedBean(name = "blankbean")
@ViewScoped
public class BlankBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Customer> master;
	private Customer selectedMaster;
	private long selectedMasterId;
	
	private Calendar cal;
	
	@ManagedProperty(value = "#{VaSessionbean}")
	private VaSessionbean vasessionbean;
	
	@EJB private VaSession session;
	
	@PostConstruct
	private void init() {
		cal = Calendar.getInstance();
		master = session.querryAllCustomer();
	}
	
	@PreDestroy
	private void destroy() {
		
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

	public VaSession getSession() {
		return session;
	}

	public void setSession(VaSession session) {
		this.session = session;
	}
	
	
}
