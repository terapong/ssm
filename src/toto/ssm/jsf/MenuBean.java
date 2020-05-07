package toto.ssm.jsf;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import org.primefaces.event.CloseEvent;

import toto.ssm.session.*;

@ManagedBean(name = "menubean")
@ViewScoped
public class MenuBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value = "#{vasessionbean}")
	private VaSessionbean vaSessionbean;
	
	@EJB private VaSession session;
	
	public String handleClose(CloseEvent event) {
//		List<NodeMCU> hs = session.queryAllNodeMCU();
//		if(hs.isEmpty()) {
//			vaSessionbean.setContentCenter("blank.xhtml");
//		} else {
//			vaSessionbean.setContentCenter("log.xhtml");
//		}
		return "main?facesRedirect=true";
	}
	
	public String privilegeClick() {
		vaSessionbean.setProgramName("Privilege data");
		vaSessionbean.setContentCenter("admin/privilege.xhtml");
		return "main?facesRedirect=true";
	}
	
	public String employeeClick() {
		vaSessionbean.setProgramName("Employee data");
		vaSessionbean.setContentCenter("admin/employee.xhtml");
		return "main?facesRedirect=true";
	}
	
	public String customerClick() {
		vaSessionbean.setProgramName("Customer data");
		vaSessionbean.setContentCenter("admin/customer.xhtml");
		return "main?facesRedirect=true";
	}
	
	public String orderClick() {
		vaSessionbean.setProgramName("Customer orders");
		vaSessionbean.setContentCenter("admin/order.xhtml");
		return "main?facesRedirect=true";
	}
	
	public String docketClick() {
		vaSessionbean.setProgramName("Docket data");
		vaSessionbean.setContentCenter("admin/docket.xhtml");
		return "main?facesRedirect=true";
	}
	
	public String ordersTaxStatusClick() {
		vaSessionbean.setProgramName("Orders tax status data");
		vaSessionbean.setContentCenter("admin/ordersTaxStatus.xhtml");
		return "main?facesRedirect=true";
	}
	
	public String ordersStatusClick() {
		vaSessionbean.setProgramName("Orders status data");
		vaSessionbean.setContentCenter("admin/ordersStatus.xhtml");
		return "main?facesRedirect=true";
	}
	
	public String inventoryTtranSactionTypesClick() {
		vaSessionbean.setProgramName("Inventory tranSaction Types data");
		vaSessionbean.setContentCenter("admin/inventoryTtranSactionTypesClick.xhtml");
		return "main?facesRedirect=true";
	}
	
	public String topicClick() {
		vaSessionbean.setProgramName("Topic report");
		vaSessionbean.setContentCenter("admin/topic.xhtml");
		return "main?facesRedirect=true";
	}
	
	public String orderDetailClick() {
		vaSessionbean.setProgramName("Order detail report");
		vaSessionbean.setContentCenter("admin/orderDetail.xhtml");
		return "main?facesRedirect=true";
	}
	
	public String purchseorderstatusClick() {
		vaSessionbean.setProgramName("Purchase order report");
		vaSessionbean.setContentCenter("admin/purchaseOrderStatus.xhtml");
		return "main?facesRedirect=true";
	}
	
	public String PoClick() {
		vaSessionbean.setProgramName("PO report");
		vaSessionbean.setContentCenter("report/reportPO.xhtml");
		return "main?facesRedirect=true";
	}
	
	public String TransportClick() {
		vaSessionbean.setProgramName("Transport report");
		vaSessionbean.setContentCenter("report/reportTax.xhtml");
		return "main?facesRedirect=true";
	}
	
	public String TaxClick() {
		vaSessionbean.setProgramName("Topic report");
		vaSessionbean.setContentCenter("report/reportTransport.xhtml");
		return "main?facesRedirect=true";
	}
	
	public String plcClick() {
		vaSessionbean.setProgramName("Add PLC");
		vaSessionbean.setContentCenter("admin/plc.xhtml");
		return "main?facesRedirect=true";
	}

	public VaSessionbean getVaSessionbean() {
		return vaSessionbean;
	}

	public void setVaSessionbean(VaSessionbean vaSessionbean) {
		this.vaSessionbean = vaSessionbean;
	}
}