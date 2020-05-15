package toto.ssm.jsf;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import toto.ssm.entity.*;
import toto.ssm.session.VaSession;

@ManagedBean(name = "orderlookupbean")
@ViewScoped
public class OrderLookupBean implements Serializable {
	private static final long serialVersionUID = 1L;
	//Plant zone
	private List<Plant> master;
	private Plant selectedMaster;
	
	//Order zone
	private List<Orders> orders;
	private Orders selectOrder;
	private Orders selectOrderDia;
	
	@ManagedProperty(value = "#{vaSessionbean}")
	private VaSessionbean vasessionbean;
	
	@EJB private VaSession session;

	@PostConstruct 
	public void init() {
		master = session.querryAllPlant();
		if(master.size() != 0) {
			selectedMaster = master.get(0);
			orders = session.querryAllOrderByPlantID(selectedMaster.getId());
		}
	}
	
	@PreDestroy 
	public void destroy() {
		
	}
	
	public void onRowMasterSelect() {
		orders = session.querryAllOrderByPlantID(selectedMaster.getId());
	}
	
	public void btnEditPlantClick(Orders r) {
		selectOrderDia = r;
	}

	public List<Plant> getMaster() {
		return master;
	}

	public void setMaster(List<Plant> master) {
		this.master = master;
	}

	public Plant getSelectedMaster() {
		return selectedMaster;
	}

	public void setSelectedMaster(Plant selectedMaster) {
		this.selectedMaster = selectedMaster;
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

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public Orders getSelectOrder() {
		return selectOrder;
	}

	public void setSelectOrder(Orders selectOrder) {
		this.selectOrder = selectOrder;
	}

	public Orders getSelectOrderDia() {
		return selectOrderDia;
	}

	public void setSelectOrderDia(Orders selectOrderDia) {
		this.selectOrderDia = selectOrderDia;
	}
}
