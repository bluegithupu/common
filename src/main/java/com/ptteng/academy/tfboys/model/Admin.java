package com.ptteng.academy.tfboys.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


@Entity
@Table(name = "admin")
public class Admin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4814959779100010496L;	
	
		
   	 
    private  Long id;
	
  	 
    private  Long roleID;
	
  	 
    private  String salt;
	
  	 
    private  String userName;
	
  	 
    private  String passWord;
	
  	 
    private  String phone;
	
  	 
    private  String createBy;
	
  	 
    private  String updateBy;
	
  	 
    private  Long createAt;
	
  	 
    private  Long updateAt;
	
  
	
		 	
         	 	   @Id
     	   @GeneratedValue(strategy = GenerationType.AUTO)
              	@Column(name = "id")
	public Long getId() {
		return id;
	}
	
	
	public void setId(Long id) {
		this.id = id;
	}
		 	@Column(name = "role_id")
	public Long getRoleID() {
		return roleID;
	}
	
	
	public void setRoleID(Long roleID) {
		this.roleID = roleID;
	}
		 	@Column(name = "salt")
	public String getSalt() {
		return salt;
	}
	
	
	public void setSalt(String salt) {
		this.salt = salt;
	}
		 	@Column(name = "username")
	public String getUserName() {
		return userName;
	}
	
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
		 	@Column(name = "password")
	public String getPassWord() {
		return passWord;
	}
	
	
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
		 	@Column(name = "phone")
	public String getPhone() {
		return phone;
	}
	
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
		 	@Column(name = "create_by")
	public String getCreateBy() {
		return createBy;
	}
	
	
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
		 	@Column(name = "update_by")
	public String getUpdateBy() {
		return updateBy;
	}
	
	
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
		 	@Column(name = "create_at")
	public Long getCreateAt() {
		return createAt;
	}
	
	
	public void setCreateAt(Long createAt) {
		this.createAt = createAt;
	}
		 	@Column(name = "update_at")
	public Long getUpdateAt() {
		return updateAt;
	}
	
	
	public void setUpdateAt(Long updateAt) {
		this.updateAt = updateAt;
	}
		
	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}

