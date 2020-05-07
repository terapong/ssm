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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import toto.ssm.session.*;
import toto.ssm.entity.Employee;
import toto.util.FWUtil;

@ManagedBean(name = "indexbean")
@ViewScoped
public class IndexBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private static final ResourceBundle resources = ResourceBundle.getBundle("resources.Index");
	private static final ResourceBundle indexR = ResourceBundle.getBundle("resources.Index");
	private Employee employee;
	private long employeeId;
	private List<Employee> employees;
	private String username;
	private String password;
	private String oldPass;
	private String newPass;
	private String newPassAgain;
	private Calendar cal;
	
	@ManagedProperty(value = "#{vasessionbean}")
	private VaSessionbean vasessionbean;
	
	@EJB private VaSession session;
	
	@PostConstruct
	private void init() {
		cal = Calendar.getInstance();
		employees = session.querryAllEmployee();
		if(employees.size() != 0) {
			employee = employees.get(0);
			username = employee.getUserName();
			vasessionbean.setEmployee(employee);
			vasessionbean.setUsername(username);
			employeeId = employee.getId();
		}
	}
	
	@PreDestroy
	private void destroy() {
		
	}
	
	public void selEmployeeChange() {
		employee = session.querryEmployeeById(employeeId);
		vasessionbean.setEmployee(employee);
		vasessionbean.setUsername(username);
	}
	
	public String loginClick() {
		try {
			if(employee != null) {
				password = FWUtil.byteArrayToHexString(FWUtil.computeHash(password));
				 
				if(password.equals(employee.getPassword())) {
					employee.setUpdateDate(cal.getTime());
					session.updateEmployee(employee);
					return "main.jsf";
				} else {
					FacesMessage msg = new FacesMessage();
					msg.setSummary(resources.getString("LoginFail.Summary"));
					msg.setDetail(resources.getString("LoginFail.Description"));
					msg.setSeverity(FacesMessage.SEVERITY_ERROR);
					FacesContext.getCurrentInstance().addMessage(null, msg);	
				}
			} else {
				FacesMessage msg = new FacesMessage();
				msg.setSummary(resources.getString("LoginFail.Summary"));
				msg.setDetail(resources.getString("LoginFail.Description"));
				msg.setSeverity(FacesMessage.SEVERITY_ERROR);
				FacesContext.getCurrentInstance().addMessage(null, msg);
			}
		} catch(Exception ex) {
			FacesMessage msg = new FacesMessage();
			msg.setSummary(resources.getString("LoginFail.Summary"));
			msg.setDetail(resources.getString("LoginFail.Description"));
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage(null, msg);
			ex.printStackTrace();
		}
		return "null";
	}
	
	public String logout() {
		employee = vasessionbean.getEmployee();
		FacesContext context = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
        try {
            request.logout();
        } catch (ServletException e) {
            context.addMessage(null, new FacesMessage("Logout failed!"));
        } 
        context.getExternalContext().invalidateSession();
        return "index?facesRedirect=true";
    }
	
	public void changPassClick() {
		employee = vasessionbean.getEmployee();
		try {
			String password = FWUtil.byteArrayToHexString(FWUtil.computeHash(oldPass));
			if(employee.getPassword().compareTo(password) == 0) {
				if(newPass.compareTo(newPassAgain) == 0) {
					employee.setPassword(FWUtil.byteArrayToHexString(FWUtil.computeHash(newPass)));
					session.updateEmployee(employee);
				} else {
					FacesMessage msg = new FacesMessage(indexR.getString("ChangePassword.NewConfirmMismatch"));
		    		FacesContext.getCurrentInstance().addMessage(null, msg);
		    		FacesContext.getCurrentInstance().validationFailed();
				}
			} else {
				FacesMessage msg = new FacesMessage(indexR.getString("ChangePassword.OldIncorrect"));
	    		FacesContext.getCurrentInstance().addMessage(null, msg);
	    		FacesContext.getCurrentInstance().validationFailed();
			}
		} catch(Exception ex) {
			FacesMessage msg = new FacesMessage(indexR.getString("ChangePassword.SystemFailure"));
    		FacesContext.getCurrentInstance().addMessage(null, msg);
    		FacesContext.getCurrentInstance().validationFailed();
			ex.printStackTrace();
		}
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOldPass() {
		return oldPass;
	}

	public void setOldPass(String oldPass) {
		this.oldPass = oldPass;
	}

	public String getNewPass() {
		return newPass;
	}

	public void setNewPass(String newPass) {
		this.newPass = newPass;
	}

	public String getNewPassAgain() {
		return newPassAgain;
	}

	public void setNewPassAgain(String newPassAgain) {
		this.newPassAgain = newPassAgain;
	}

	public VaSessionbean getVasessionbean() {
		return vasessionbean;
	}

	public void setVasessionbean(VaSessionbean vasessionbean) {
		this.vasessionbean = vasessionbean;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
