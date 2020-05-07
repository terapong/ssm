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

import toto.ssm.entity.Privilege;
import toto.ssm.session.VaSession;

@ManagedBean(name = "privilegebean")
@ViewScoped
public class PrivilegeBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Privilege> slave;
	private Privilege selectedRow;
	private Calendar cal;
	
	private String renderedDelete;
	
	@ManagedProperty(value = "#{VaSessionbean}")
	private VaSessionbean vasessionbean;
	
	@EJB private VaSession session;
	
	@PostConstruct
	private void init() {
		cal = Calendar.getInstance();
		slave = session.querryAllPrivilege();
		for(Privilege r : slave) {
			if(r.getEmployees().isEmpty()) {
				r.setRenderedDelete("true");
			} else {
				r.setRenderedDelete("false");
			}
		}
	}

	@PreDestroy
	private void destroy() {
		
	}
	
	public void btnNewClick() {
		selectedRow = new Privilege();
		selectedRow.setCreateDate(cal.getTime());
		selectedRow.setUpdateDate(cal.getTime());
	}
	
	public void btnSaveClick() {
		selectedRow.setUpdateDate(cal.getTime());
		session.updatePrivilege(selectedRow);
		init();
	}
	
	public void btnEditClick(Privilege o) {
		selectedRow = o;
	}
	
	public void confirmDeleteClick() {
		try {
			session.deletePrivilege(selectedRow);
			init();
		} catch(Exception ex) {
			FacesMessage msg = new FacesMessage();
			msg.setSummary("ไม่สามารถ ลบ ได้");
			msg.setDetail("ไม่สามารถ ลบ ได้ เพราะมี ข้อมูลที่เกี่ยวข้อง");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}
	
	public List<Privilege> getSlave() {
		return slave;
	}

	public void setSlave(List<Privilege> slave) {
		this.slave = slave;
	}

	public Privilege getSelectedRow() {
		return selectedRow;
	}

	public void setSelectedRow(Privilege selectedRow) {
		this.selectedRow = selectedRow;
	}

	public String getRenderedDelete() {
		return renderedDelete;
	}

	public void setRenderedDelete(String renderedDelete) {
		this.renderedDelete = renderedDelete;
	}

	public void btnDeleteClick(Privilege o) {
		selectedRow = o;
	}

	public VaSessionbean getVasessionbean() {
		return vasessionbean;
	}

	public void setVasessionbean(VaSessionbean vasessionbean) {
		this.vasessionbean = vasessionbean;
	} 
}
