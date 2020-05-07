package toto.ssm.jsf;

import java.io.Serializable;
import java.util.*;

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
import toto.util.FWUtil;

@ManagedBean(name = "employeebean")
@ViewScoped
public class EmployeeBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Privileges> master;
	private Privileges selectedMaster;
	private long selectedMasterId;
	private Set<Employees> slave;
	private Employees selectedRow;
	
	private String addDisabled;
	private String tempPass;
	
	private Calendar cal;
	
	@ManagedProperty(value = "#{VaSessionbean}")
	private VaSessionbean vasessionbean;
	
	@EJB private VaSession session;
	
	@PostConstruct
	private void init() {
		cal = Calendar.getInstance();
		master = session.querryAllPrivilege();
		if(master.isEmpty()) {
			addDisabled = "true";
		} else {
			addDisabled = "false";
			if(selectedMaster == null) {
				selectedMaster = master.get(0);
				//selectedRow = selectedMaster.getEmployees().get(0);
			}
			slave = session.querryEmployeeByPrivilegeID(selectedMaster.getId());
			selectedMasterId = selectedMaster.getId();
			
			for(Employees r : slave) {
				if(r.getUsername().equals("admin")) {
					r.setRenderedDelete("false");
				} else {
					r.setRenderedDelete("true");
				}
			}
		}
	}
	
	@PreDestroy
	private void destroy() {
		
	}
	
	public void btnNewClick() {
		selectedRow = new Employees();
		selectedRow.setPrivileges(selectedMaster);
		selectedRow.setCreateDate(cal.getTime());
		selectedRow.setUpdateDate(cal.getTime());
	}
	
	public void btnSaveClick() {
		try {
			if(tempPass != null || !tempPass.equals("")) {
				tempPass = FWUtil.byteArrayToHexString(FWUtil.computeHash(tempPass));
			}
			
			if(!tempPass.equals(selectedRow.getPassword())) {
				selectedRow.setPassword(tempPass);
			}
			tempPass = null;
			selectedRow.setUpdateDate(cal.getTime());
			selectedRow.setCity("city");
			selectedRow.setZipPostalCode("40002");
			selectedRow.setCountryRegion("th");
			selectedRow.setJobTitle("Engineer");
			selectedRow.setAttachments("Attachments");
			selectedRow.setStateProvince("StateProvince");
			session.updateEmployee(selectedRow);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		init();
	}

		public void btnEditClick(Employees o) {
		selectedRow = o;
	}
	
	public void confirmDeleteClick() {
		try {
			session.deleteEmployee(selectedRow);
			init();
		} catch(Exception ex) {
			FacesMessage msg = new FacesMessage();
			msg.setSummary("ไม่สามารถ ลบ ได้");
			msg.setDetail("ไม่สามารถ ลบ ได้ เพราะมี ข้อมูลที่เกี่ยวข้อง");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}
	
	public void btnDeleteClick(Employees o) {
		selectedRow = o;
	}
	
	public void selMasterChange() {
		selectedMaster = session.querryPrivilegeById(selectedMasterId);
		slave = selectedMaster.getEmployeeses();
		for(Employees r : slave) {
			if(r.getUsername().equals("admin")) {
				r.setRenderedDelete("false");
			} else {
				r.setRenderedDelete("true");
			}
		}
	}

	public List<Privileges> getMaster() {
		return master;
	}

	public void setMaster(List<Privileges> master) {
		this.master = master;
	}

	public Privileges getSelectedMaster() {
		return selectedMaster;
	}

	public void setSelectedMaster(Privileges selectedMaster) {
		this.selectedMaster = selectedMaster;
	}

	public long getSelectedMasterId() {
		return selectedMasterId;
	}

	public void setSelectedMasterId(long selectedMasterId) {
		this.selectedMasterId = selectedMasterId;
	}

	public Set<Employees> getSlave() {
		return slave;
	}

	public void setSlave(Set<Employees> slave) {
		this.slave = slave;
	}

	public Employees getSelectedRow() {
		return selectedRow;
	}

	public void setSelectedRow(Employees selectedRow) {
		this.selectedRow = selectedRow;
	}

	public String getAddDisabled() {
		return addDisabled;
	}

	public void setAddDisabled(String addDisabled) {
		this.addDisabled = addDisabled;
	}

	public String getTempPass() {
		return tempPass;
	}

	public void setTempPass(String tempPass) {
		this.tempPass = tempPass;
	}

	public VaSessionbean getVasessionbean() {
		return vasessionbean;
	}

	public void setVasessionbean(VaSessionbean vasessionbean) {
		this.vasessionbean = vasessionbean;
	}
}
