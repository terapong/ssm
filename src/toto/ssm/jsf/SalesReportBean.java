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

@ManagedBean(name = "salesreportbean")
@ViewScoped
public class SalesReportBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<SalesReports> slave;
	private SalesReports selectedRow;
	private Calendar cal;
	
	@ManagedProperty(value = "#{VaSessionbean}")
	private VaSessionbean vasessionbean;
	
	@EJB private VaSession session;
	
	@PostConstruct
	private void init() {
		cal = Calendar.getInstance();
		slave = session.querryAllSalesReport();
	}

	@PreDestroy
	private void destroy() {
		
	}
	
	public void btnNewClick() {
		selectedRow = new SalesReports();
		selectedRow.setUpdateDate(cal.getTime());
		selectedRow.setCreateDate(cal.getTime());
	}
	
	public void btnSaveClick() {
		session.updateSalesReport(selectedRow);
		init();
	}
	
	public void btnEditClick(SalesReports o) {
		selectedRow = o;
	}
	
	public void confirmDeleteClick() {
		try {
			session.deleteSalesReport(selectedRow);
			init();
		} catch(Exception ex) {
			FacesMessage msg = new FacesMessage();
			msg.setSummary("ไม่สามารถ ลบ ได้");
			msg.setDetail("ไม่สามารถ ลบ ได้ เพราะมี ข้อมูลที่เกี่ยวข้อง");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}
	
	public void btnDeleteClick(SalesReports o) {
		selectedRow = o;
	}

	public List<SalesReports> getSlave() {
		return slave;
	}

	public void setSlave(List<SalesReports> slave) {
		this.slave = slave;
	}

	public SalesReports getSelectedRow() {
		return selectedRow;
	}

	public void setSelectedRow(SalesReports selectedRow) {
		this.selectedRow = selectedRow;
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
