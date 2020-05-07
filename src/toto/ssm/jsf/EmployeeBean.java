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

import toto.ssm.entity.Employee;
import toto.ssm.entity.Privilege;
import toto.ssm.session.VaSession;
import toto.util.FWUtil;

@ManagedBean(name = "employeebean")
@ViewScoped
public class EmployeeBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Privilege> master;
	private Privilege selectedMaster;
	private long selectedMasterId;
	private List<Employee> slave;
	private Employee selectedRow;
	
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
			
			for(Employee r : slave) {
				if(r.getUserName().equals("admin")) {
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
		selectedRow = new Employee();
		selectedRow.setPrivilege(selectedMaster);
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

		public void btnEditClick(Employee o) {
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
	
	public void btnDeleteClick(Employee o) {
		selectedRow = o;
	}
	
	public void selMasterChange() {
		selectedMaster = session.querryPrivilegeById(selectedMasterId);
		slave = selectedMaster.getEmployees();
		for(Employee r : slave) {
			if(r.getUserName().equals("admin")) {
				r.setRenderedDelete("false");
			} else {
				r.setRenderedDelete("true");
			}
		}
	}

	public List<Privilege> getMaster() {
		return master;
	}

	public void setMaster(List<Privilege> master) {
		this.master = master;
	}

	public Privilege getSelectedMaster() {
		return selectedMaster;
	}

	public void setSelectedMaster(Privilege selectedMaster) {
		this.selectedMaster = selectedMaster;
	}

	public long getSelectedMasterId() {
		return selectedMasterId;
	}

	public void setSelectedMasterId(long selectedMasterId) {
		this.selectedMasterId = selectedMasterId;
	}

	public List<Employee> getSlave() {
		return slave;
	}

	public void setSlave(List<Employee> slave) {
		this.slave = slave;
	}

	public Employee getSelectedRow() {
		return selectedRow;
	}

	public void setSelectedRow(Employee selectedRow) {
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
