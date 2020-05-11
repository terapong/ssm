package toto.ssm.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="recipe")
public class Recipe  implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
    private String address;
    private String attachments;
    private String businessPhone;
    private String city;
    private String company;
    private String countryRegion;
    private String emailAddress;
    private String faxNumber;
    private String firstName;
    private String homePhone;
    private String jobTitle;
    private String lastName;
    private String mobilePhone;
    private String notes;
    private String stateProvince;
    private String webPage;
    private String zipPostalCode;
    //private List<Orders> orderses = new ArrayList<Orders>(0);
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_date", length=19)
     private Date createDate;
	
	@Column(name="create_user")
     private String createUser;
	
	@Column(name="project_name")
     private String projectName;
     
     @Temporal(TemporalType.TIMESTAMP)
     @Column(name="update_date", length=19)
     private Date updateDate;

    public Recipe() {
    }

	
    public Recipe(long id) {
        this.id = id;
    }
   
    @TableGenerator(
            name="SSMGen", 
            table="ID_GEN", 
            pkColumnName="GEN_KEY", 
            valueColumnName="GEN_VALUE", 
            pkColumnValue="RECIPE_ID", 
            allocationSize=1)
    @Id 
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.TABLE, generator="SSMGen")
    public long getId() {
        return this.id;
    }

	public void setId(long id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	public String getCreateUser() {
		return createUser;
	}


	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public Date getUpdateDate() {
		return updateDate;
	}


	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getAttachments() {
		return attachments;
	}


	public void setAttachments(String attachments) {
		this.attachments = attachments;
	}


	public String getBusinessPhone() {
		return businessPhone;
	}


	public void setBusinessPhone(String businessPhone) {
		this.businessPhone = businessPhone;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getCountryRegion() {
		return countryRegion;
	}


	public void setCountryRegion(String countryRegion) {
		this.countryRegion = countryRegion;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getFaxNumber() {
		return faxNumber;
	}


	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getHomePhone() {
		return homePhone;
	}


	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}


	public String getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getMobilePhone() {
		return mobilePhone;
	}


	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}


	public String getNotes() {
		return notes;
	}


	public void setNotes(String notes) {
		this.notes = notes;
	}


	public String getStateProvince() {
		return stateProvince;
	}


	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}


	public String getWebPage() {
		return webPage;
	}


	public void setWebPage(String webPage) {
		this.webPage = webPage;
	}


	public String getZipPostalCode() {
		return zipPostalCode;
	}


	public void setZipPostalCode(String zipPostalCode) {
		this.zipPostalCode = zipPostalCode;
	}
}
