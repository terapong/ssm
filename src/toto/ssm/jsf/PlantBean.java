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

@ManagedBean(name = "plantbean")
@ViewScoped
public class PlantBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Plant> slave;
	private Plant selectedRow;
	private Calendar cal;
	
	@ManagedProperty(value = "#{VaSessionbean}")
	private VaSessionbean vasessionbean;
	
	@EJB private VaSession session;
	
	@PostConstruct
	private void init() {
		cal = Calendar.getInstance();
		slave = session.querryAllPlant();
		if(slave.size() != 0) {
			selectedRow = slave.get(0);
		} else {
			selectedRow = new Plant();
		}
	}
	
	@PreDestroy
	private void destroy() {
		
	}
	
	public void btnNewClick() {
		System.out.println("btnNewClick :");
		selectedRow = new Plant();
		selectedRow.setUpdateDate(cal.getTime());
		selectedRow.setCreateDate(cal.getTime());
		//selectedRow.setCreateUser(vasessionbean.getUsername());
	}
	
	public void btnSaveClick() {
		session.updatePlant(selectedRow);
		init();
	}
	
	public void btnEditClick(Plant o) {
		selectedRow = o;
	}
	
	public void confirmDeleteClick() {
		try {
			session.deletePlant(selectedRow);
			init();
		} catch(Exception ex) {
			FacesMessage msg = new FacesMessage();
			msg.setSummary("ไม่สามารถ ลบ ได้");
			msg.setDetail("ไม่สามารถ ลบ ได้ เพราะมี ข้อมูลที่เกี่ยวข้อง");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}
	
	public void btnDeleteClick(Plant o) {
		selectedRow = o;
	}

	public List<Plant> getSlave() {
		return slave;
	}

	public void setSlave(List<Plant> slave) {
		this.slave = slave;
	}

	public Plant getSelectedRow() {
		return selectedRow;
	}

	public void setSelectedRow(Plant selectedRow) {
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
}
