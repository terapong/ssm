package toto.ssm.jsf;

import java.io.Serializable;
import java.util.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.application.FacesMessage;

import toto.ssm.entity.*;
import toto.ssm.session.VaSession;

@ManagedBean(name = "recipebean")
@ViewScoped
public class RecipeBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Orders> master;
	private Orders selectMasterRow;
	private List<Recipe> slave;
	private Recipe selectedRow;
	private Calendar cal;
	
	@ManagedProperty(value = "#{vaSessionbean}")
	private VaSessionbean vasessionbean;
	
	@EJB private VaSession session;
	
	@PostConstruct
	private void init() {
		cal = Calendar.getInstance();
		master = session.querryAllOrder();
		if(master.size() == 0) {
			selectMasterRow = new Orders();
			slave = new ArrayList<Recipe>();
		} else {
			selectMasterRow = master.get(0);
			slave = session.querryAllRecipeByOrderId(selectMasterRow);
		}
		
	}
	
	@PreDestroy
	private void destroy() {
		
	}
	
	public void onRowRecipeSelect() {
		System.out.println("onRowRecipeSelect yyyyyyy");
	}
	
	public void btnNewClick() {
		selectedRow = new Recipe();
		selectedRow.setUpdateDate(cal.getTime());
		selectedRow.setCreateDate(cal.getTime());
		//selectedRow.setCreateUser(vasessionbean.getUsername());
	}
	
	public void btnSaveClick() {
		session.updateRecipe(selectedRow);
		init();
	}
	
	public void btnEditClick(Recipe o) {
		selectedRow = o;
	}
	
	public void confirmDeleteClick() {
		try {
			session.deleteRecipe(selectedRow);
			init();
		} catch(Exception ex) {
			FacesMessage msg = new FacesMessage();
			msg.setSummary("ไม่สามารถ ลบ ได้");
			msg.setDetail("ไม่สามารถ ลบ ได้ เพราะมี ข้อมูลที่เกี่ยวข้อง");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}
	
	public void btnDeleteClick(Recipe o) {
		selectedRow = o;
	}

	public List<Recipe> getSlave() {
		return slave;
	}

	public void setSlave(List<Recipe> slave) {
		this.slave = slave;
	}

	public Recipe getSelectedRow() {
		return selectedRow;
	}

	public void setSelectedRow(Recipe selectedRow) {
		this.selectedRow = selectedRow;
	}

	public VaSessionbean getVasessionbean() {
		return vasessionbean;
	}

	public void setVasessionbean(VaSessionbean vasessionbean) {
		this.vasessionbean = vasessionbean;
	}
}