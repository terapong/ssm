package toto.ssm.entity;
// Generated May 7, 2020 10:21:16 AM by Hibernate Tools 4.3.1


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Customer generated by hbm2java
 */
@Entity
@Table(name="customer")
public class Customer  implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
     private String address;
     private String attachments;
     private String businessPhone;
     private String city;
     private String company;
     private String countryRegion;
     private Date createDate;
     private String createUser;
     private String emailAddress;
     private String faxNumber;
     private String firstName;
     private String homePhone;
     private String jobTitle;
     private String lastName;
     private String mobilePhone;
     private String notes;
     private String stateProvince;
     private Date updateDate;
     private String webPage;
     private String zipPostalCode;
     private List<Orders> orderses = new ArrayList<Orders>(0);

    public Customer() {
    }

	
    public Customer(long id) {
        this.id = id;
    }
    public Customer(long id, String address, String attachments, String businessPhone, String city, String company, String countryRegion, Date createDate, String createUser, String emailAddress, String faxNumber, String firstName, String homePhone, String jobTitle, String lastName, String mobilePhone, String notes, String stateProvince, Date updateDate, String webPage, String zipPostalCode, List<Orders> orderses) {
       this.id = id;
       this.address = address;
       this.attachments = attachments;
       this.businessPhone = businessPhone;
       this.city = city;
       this.company = company;
       this.countryRegion = countryRegion;
       this.createDate = createDate;
       this.createUser = createUser;
       this.emailAddress = emailAddress;
       this.faxNumber = faxNumber;
       this.firstName = firstName;
       this.homePhone = homePhone;
       this.jobTitle = jobTitle;
       this.lastName = lastName;
       this.mobilePhone = mobilePhone;
       this.notes = notes;
       this.stateProvince = stateProvince;
       this.updateDate = updateDate;
       this.webPage = webPage;
       this.zipPostalCode = zipPostalCode;
       this.orderses = orderses;
    }
   
    @TableGenerator(
            name="SSMGen", 
            table="ID_GEN", 
            pkColumnName="GEN_KEY", 
            valueColumnName="GEN_VALUE", 
            pkColumnValue="CUSTOMER_ID", 
            allocationSize=1)
    @Id 
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.TABLE, generator="SSMGen")
    public long getId() {
        return this.id;
    }
    
    public void ListId(long id) {
        this.id = id;
    }

    
    @Column(name="address", length=500)
    public String getAddress() {
        return this.address;
    }
    
    public void ListAddress(String address) {
        this.address = address;
    }

    
    @Column(name="attachments", length=500)
    public String getAttachments() {
        return this.attachments;
    }
    
    public void ListAttachments(String attachments) {
        this.attachments = attachments;
    }

    
    @Column(name="business_phone", length=20)
    public String getBusinessPhone() {
        return this.businessPhone;
    }
    
    public void ListBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }

    
    @Column(name="city", length=100)
    public String getCity() {
        return this.city;
    }
    
    public void ListCity(String city) {
        this.city = city;
    }

    
    @Column(name="company", length=200)
    public String getCompany() {
        return this.company;
    }
    
    public void ListCompany(String company) {
        this.company = company;
    }

    
    @Column(name="country_region")
    public String getCountryRegion() {
        return this.countryRegion;
    }
    
    public void ListCountryRegion(String countryRegion) {
        this.countryRegion = countryRegion;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_date", length=19)
    public Date getCreateDate() {
        return this.createDate;
    }
    
    public void ListCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    
    @Column(name="create_user")
    public String getCreateUser() {
        return this.createUser;
    }
    
    public void ListCreateUser(String createUser) {
        this.createUser = createUser;
    }

    
    @Column(name="email_address")
    public String getEmailAddress() {
        return this.emailAddress;
    }
    
    public void ListEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    
    @Column(name="fax_number")
    public String getFaxNumber() {
        return this.faxNumber;
    }
    
    public void ListFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    
    @Column(name="first_name")
    public String getFirstName() {
        return this.firstName;
    }
    
    public void ListFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="home_phone")
    public String getHomePhone() {
        return this.homePhone;
    }
    
    public void ListHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

	public void setAddress(String address) {
		this.address = address;
	}


	public void setAttachments(String attachments) {
		this.attachments = attachments;
	}


	public void setBusinessPhone(String businessPhone) {
		this.businessPhone = businessPhone;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public void setCountryRegion(String countryRegion) {
		this.countryRegion = countryRegion;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}


	public void setNotes(String notes) {
		this.notes = notes;
	}


	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}


	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}


	public void setWebPage(String webPage) {
		this.webPage = webPage;
	}


	public void setZipPostalCode(String zipPostalCode) {
		this.zipPostalCode = zipPostalCode;
	}


	public void setOrderses(List<Orders> orderses) {
		this.orderses = orderses;
	}


	@Column(name="job_title")
    public String getJobTitle() {
        return this.jobTitle;
    }
    
    public void ListJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    
    @Column(name="last_name")
    public String getLastName() {
        return this.lastName;
    }
    
    public void ListLastName(String lastName) {
        this.lastName = lastName;
    }

    
    @Column(name="mobile_phone")
    public String getMobilePhone() {
        return this.mobilePhone;
    }
    
    public void ListMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    
    @Column(name="notes")
    public String getNotes() {
        return this.notes;
    }
    
    public void ListNotes(String notes) {
        this.notes = notes;
    }

    
    @Column(name="state_province")
    public String getStateProvince() {
        return this.stateProvince;
    }
    
    public void ListStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="update_date", length=19)
    public Date getUpdateDate() {
        return this.updateDate;
    }
    
    public void ListUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    
    @Column(name="web_page")
    public String getWebPage() {
        return this.webPage;
    }
    
    public void ListWebPage(String webPage) {
        this.webPage = webPage;
    }

    
    @Column(name="zip_postal_code")
    public String getZipPostalCode() {
        return this.zipPostalCode;
    }
    
    public void ListZipPostalCode(String zipPostalCode) {
        this.zipPostalCode = zipPostalCode;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="customer")
    public List<Orders> getOrderses() {
        return this.orderses;
    }
    
    public void ListOrderses(List<Orders> orderses) {
        this.orderses = orderses;
    }


	public void setId(long id) {
		this.id = id;
	}




}


