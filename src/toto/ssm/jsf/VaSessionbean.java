package toto.ssm.jsf;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import toto.ssm.entity.*;

@ManagedBean(name = "vasessionbean")
@SessionScoped
public class VaSessionbean implements Serializable{
	private static final long serialVersionUID = 1L;

	private Employee employee;
	private java.lang.String username;
	private java.lang.String programName;
	//private String contentCenter = "log.xhtml";
	private java.lang.String contentCenter = "blank.xhtml";
	
	@PostConstruct
	public void init() {
	}
	
	@PreDestroy
	public void destroy() {
	}
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public java.lang.String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public java.lang.String getContentCenter() {
		return contentCenter;
	}
	public void setContentCenter(String contentCenter) {
		this.contentCenter = contentCenter;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}
	
	
}
