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

@ManagedBean(name = "projectbean")
@ViewScoped
public class ProjectBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Project> slave;
	private Project selectedRow;
	private Project selectedRowTable;
	private Calendar cal;
	
	@ManagedProperty(value = "#{VaSessionbean}")
	private VaSessionbean vasessionbean;
	
	@EJB private VaSession session;
	
	@PostConstruct
	private void init() {
		cal = Calendar.getInstance();
		slave = session.querryAllProject();
		btnNewClick();
	}
	
	@PreDestroy
	private void destroy() {
		
	}
	
	public void btnNewClick() {
		selectedRow = new Project();
		selectedRow.setUpdateDate(cal.getTime());
		selectedRow.setCreateDate(cal.getTime());
		//selectedRow.setCreateUser(vasessionbean.getUsername());
	}
	
	public void btnCancleClick() {
		btnNewClick();
	}
	
	public void btnSaveClick() {
		session.updateProject(selectedRow);
		init();
	}
	
	public void btnEditClick(Project o) {
		selectedRow = o;
	}
	
	public void confirmDeleteClick() {
		try {
			session.deleteProject(selectedRow);
			init();
		} catch(Exception ex) {
			FacesMessage msg = new FacesMessage();
			msg.setSummary("ไม่สามารถ ลบ ได้");
			msg.setDetail("ไม่สามารถ ลบ ได้ เพราะมี ข้อมูลที่เกี่ยวข้อง");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}
	
	public void btnDeleteClick(Project o) {
		selectedRow = o;
	}

	public List<Project> getSlave() {
		return slave;
	}

	public void setSlave(List<Project> slave) {
		this.slave = slave;
	}

	public Project getSelectedRow() {
		return selectedRow;
	}

	public void setSelectedRow(Project selectedRow) {
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Project getSelectedRowTable() {
		return selectedRowTable;
	}

	public void setSelectedRowTable(Project selectedRowTable) {
		this.selectedRowTable = selectedRowTable;
	}
}
