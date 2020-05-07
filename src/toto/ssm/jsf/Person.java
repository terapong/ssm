package toto.ssm.jsf;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String surName;
	private String ORDERID;
	private String ORDERDATE;
	private String FREIGHT;
	private String SHIPNAME;
	private String SHIPCITY;
	private String SHIPCOUNTRY;
	private String admix1ap;
	private String admix2ap;
	private String admix3ap;
	private String admix4ap;
	private String agg1mix;
	private String agg2mix;
	private String agg3mix;
	private String agg4mix;
	private String agg1sp;
	private String agg2sp;
	private String agg3sp;
	private String agg4sp;
	private String cemt1mix;
	private String cemt2mix;
	private String cemt3mix;
	private String cemt4mix;
	private String cemt1sp;
	private String cemt2sp;
	private String cemt3sp;
	private String cemt4sp;
	private String moist1;
	private String moist2;
	private String moist3;
	private String moist4;
	private String countdoc;
	private String wc;
	private String driver;
	private String dptype;
	private String datebatch;
	private String docketno;
	private String docketref;
	private String finished;
	private String fuel;
	private String price;
	private String qf;
	private String qw;
	private String qn;
	private String qtybatch;
	private String qtydocket;
	private String qtynet;
	private String qtyperbatch;
	private String qtytruck;
	private String remark;
	private String status;
	private String temp0;
	private String temp1;
	private String time_ex;
	private String time_load;
	private String totalcost;
	private String uploaded;
	private String vat;
	private String watersp;
	private String create_date;
	private String create_user;
	private String update_date;
	
	public Person(int id, String name, String surName) {
		super();
		this.id = id;
		this.name = name;
		this.surName = surName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getORDERID() {
		return ORDERID;
	}
	public void setORDERID(String oRDERID) {
		ORDERID = oRDERID;
	}
	public String getORDERDATE() {
		return ORDERDATE;
	}
	public void setORDERDATE(String oRDERDATE) {
		ORDERDATE = oRDERDATE;
	}
	public String getFREIGHT() {
		return FREIGHT;
	}
	public void setFREIGHT(String fREIGHT) {
		FREIGHT = fREIGHT;
	}
	public String getSHIPNAME() {
		return SHIPNAME;
	}
	public void setSHIPNAME(String sHIPNAME) {
		SHIPNAME = sHIPNAME;
	}
	public String getSHIPCITY() {
		return SHIPCITY;
	}
	public void setSHIPCITY(String sHIPCITY) {
		SHIPCITY = sHIPCITY;
	}
	public String getSHIPCOUNTRY() {
		return SHIPCOUNTRY;
	}
	public void setSHIPCOUNTRY(String sHIPCOUNTRY) {
		SHIPCOUNTRY = sHIPCOUNTRY;
	}
	public String getAdmix1ap() {
		return admix1ap;
	}
	public void setAdmix1ap(String admix1ap) {
		this.admix1ap = admix1ap;
	}
	public String getAdmix2ap() {
		return admix2ap;
	}
	public void setAdmix2ap(String admix2ap) {
		this.admix2ap = admix2ap;
	}
	public String getAdmix3ap() {
		return admix3ap;
	}
	public void setAdmix3ap(String admix3ap) {
		this.admix3ap = admix3ap;
	}
	public String getAdmix4ap() {
		return admix4ap;
	}
	public void setAdmix4ap(String admix4ap) {
		this.admix4ap = admix4ap;
	}
	public String getAgg1mix() {
		return agg1mix;
	}
	public void setAgg1mix(String agg1mix) {
		this.agg1mix = agg1mix;
	}
	public String getAgg2mix() {
		return agg2mix;
	}
	public void setAgg2mix(String agg2mix) {
		this.agg2mix = agg2mix;
	}
	public String getAgg3mix() {
		return agg3mix;
	}
	public void setAgg3mix(String agg3mix) {
		this.agg3mix = agg3mix;
	}
	public String getAgg4mix() {
		return agg4mix;
	}
	public void setAgg4mix(String agg4mix) {
		this.agg4mix = agg4mix;
	}
	public String getAgg1sp() {
		return agg1sp;
	}
	public void setAgg1sp(String agg1sp) {
		this.agg1sp = agg1sp;
	}
	public String getAgg2sp() {
		return agg2sp;
	}
	public void setAgg2sp(String agg2sp) {
		this.agg2sp = agg2sp;
	}
	public String getAgg3sp() {
		return agg3sp;
	}
	public void setAgg3sp(String agg3sp) {
		this.agg3sp = agg3sp;
	}
	public String getAgg4sp() {
		return agg4sp;
	}
	public void setAgg4sp(String agg4sp) {
		this.agg4sp = agg4sp;
	}
	public String getCemt1mix() {
		return cemt1mix;
	}
	public void setCemt1mix(String cemt1mix) {
		this.cemt1mix = cemt1mix;
	}
	public String getCemt2mix() {
		return cemt2mix;
	}
	public void setCemt2mix(String cemt2mix) {
		this.cemt2mix = cemt2mix;
	}
	public String getCemt3mix() {
		return cemt3mix;
	}
	public void setCemt3mix(String cemt3mix) {
		this.cemt3mix = cemt3mix;
	}
	public String getCemt4mix() {
		return cemt4mix;
	}
	public void setCemt4mix(String cemt4mix) {
		this.cemt4mix = cemt4mix;
	}
	public String getCemt1sp() {
		return cemt1sp;
	}
	public void setCemt1sp(String cemt1sp) {
		this.cemt1sp = cemt1sp;
	}
	public String getCemt2sp() {
		return cemt2sp;
	}
	public void setCemt2sp(String cemt2sp) {
		this.cemt2sp = cemt2sp;
	}
	public String getCemt3sp() {
		return cemt3sp;
	}
	public void setCemt3sp(String cemt3sp) {
		this.cemt3sp = cemt3sp;
	}
	public String getCemt4sp() {
		return cemt4sp;
	}
	public void setCemt4sp(String cemt4sp) {
		this.cemt4sp = cemt4sp;
	}
	public String getCountdoc() {
		return countdoc;
	}
	public void setCountdoc(String countdoc) {
		this.countdoc = countdoc;
	}
	public String getWc() {
		return wc;
	}
	public void setWc(String wc) {
		this.wc = wc;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getDptype() {
		return dptype;
	}
	public void setDptype(String dptype) {
		this.dptype = dptype;
	}
	public String getDatebatch() {
		return datebatch;
	}
	public void setDatebatch(String datebatch) {
		this.datebatch = datebatch;
	}
	public String getDocketno() {
		return docketno;
	}
	public void setDocketno(String docketno) {
		this.docketno = docketno;
	}
	public String getDocketref() {
		return docketref;
	}
	public void setDocketref(String docketref) {
		this.docketref = docketref;
	}
	public String getFinished() {
		return finished;
	}
	public void setFinished(String finished) {
		this.finished = finished;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public String getMoist1() {
		return moist1;
	}
	public void setMoist1(String moist1) {
		this.moist1 = moist1;
	}
	public String getMoist2() {
		return moist2;
	}
	public void setMoist2(String moist2) {
		this.moist2 = moist2;
	}
	public String getMoist3() {
		return moist3;
	}
	public void setMoist3(String moist3) {
		this.moist3 = moist3;
	}
	public String getMoist4() {
		return moist4;
	}
	public void setMoist4(String moist4) {
		this.moist4 = moist4;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getQf() {
		return qf;
	}
	public void setQf(String qf) {
		this.qf = qf;
	}
	public String getQw() {
		return qw;
	}
	public void setQw(String qw) {
		this.qw = qw;
	}
	public String getQn() {
		return qn;
	}
	public void setQn(String qn) {
		this.qn = qn;
	}
	public String getQtybatch() {
		return qtybatch;
	}
	public void setQtybatch(String qtybatch) {
		this.qtybatch = qtybatch;
	}
	public String getQtydocket() {
		return qtydocket;
	}
	public void setQtydocket(String qtydocket) {
		this.qtydocket = qtydocket;
	}
	public String getQtynet() {
		return qtynet;
	}
	public void setQtynet(String qtynet) {
		this.qtynet = qtynet;
	}
	public String getQtyperbatch() {
		return qtyperbatch;
	}
	public void setQtyperbatch(String qtyperbatch) {
		this.qtyperbatch = qtyperbatch;
	}
	public String getQtytruck() {
		return qtytruck;
	}
	public void setQtytruck(String qtytruck) {
		this.qtytruck = qtytruck;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTemp0() {
		return temp0;
	}
	public void setTemp0(String temp0) {
		this.temp0 = temp0;
	}
	public String getTemp1() {
		return temp1;
	}
	public void setTemp1(String temp1) {
		this.temp1 = temp1;
	}
	public String getTime_ex() {
		return time_ex;
	}
	public void setTime_ex(String time_ex) {
		this.time_ex = time_ex;
	}
	public String getTime_load() {
		return time_load;
	}
	public void setTime_load(String time_load) {
		this.time_load = time_load;
	}
	public String getTotalcost() {
		return totalcost;
	}
	public void setTotalcost(String totalcost) {
		this.totalcost = totalcost;
	}
	public String getUploaded() {
		return uploaded;
	}
	public void setUploaded(String uploaded) {
		this.uploaded = uploaded;
	}
	public String getVat() {
		return vat;
	}
	public void setVat(String vat) {
		this.vat = vat;
	}
	public String getWatersp() {
		return watersp;
	}
	public void setWatersp(String watersp) {
		this.watersp = watersp;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	public String getCreate_user() {
		return create_user;
	}
	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}
	public String getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}
}
