package toto.ssm.jsf;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;

import toto.ssm.entity.*;
import toto.ssm.session.VaSession;

@ManagedBean(name = "vasessionbean")
@SessionScoped
public class VaSessionbean implements Serializable{
	private static final long serialVersionUID = 1L;

	private Employees employee;
	private java.lang.String username;
	private java.lang.String programName;
	private java.lang.String contentCenter = "admin/orderLookup.xhtml";

	@EJB private VaSession session;
	
	@PostConstruct
	public void init() {
		List<Plant> plants = session.querryAllPlant();
		if(plants.size() == 0) {
			contentCenter = "admin/order.xhtml";
		} else {
			contentCenter = "admin/orderLookup.xhtml";
//			List<Orders> os = session.querryAllOrderByPlantID(plants.get(0).getId());
//			if(os == null) {
//				
//			}
		}
		
	}
	
	@PreDestroy
	public void destroy() {
	}
	
	public Employees getEmployee() {
		return employee;
	}

	public void setEmployee(Employees employee) {
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

	public VaSession getSession() {
		return session;
	}

	public void setSession(VaSession session) {
		this.session = session;
	}
}
