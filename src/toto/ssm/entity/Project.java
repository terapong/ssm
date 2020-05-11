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
@Table(name="project")
public class Project  implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	
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

    public Project() {
    }

	
    public Project(long id) {
        this.id = id;
    }
   
    @TableGenerator(
            name="SSMGen", 
            table="ID_GEN", 
            pkColumnName="GEN_KEY", 
            valueColumnName="GEN_VALUE", 
            pkColumnValue="OPROJECT_ID", 
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
}