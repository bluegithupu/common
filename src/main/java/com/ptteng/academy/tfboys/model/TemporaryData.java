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
@Table(name = "temporary_data")
public class TemporaryData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9133356371170044928L;	
	
		
   	 
    private  Long id;
	
  	 
    private  String openID;
	
  	 
    private  String accessToken;
	
  	 
    private  Integer emailCode;
	
  	 
    private  Integer phoneCode;
	
  	 
    private  Integer emailCodeTimes;
	
  	 
    private  Integer phoneCodeTimes;
	
  	 
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
		 	@Column(name = "open_id")
	public String getOpenID() {
		return openID;
	}
	
	
	public void setOpenID(String openID) {
		this.openID = openID;
	}
		 	@Column(name = "access_token")
	public String getAccessToken() {
		return accessToken;
	}
	
	
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
		 	@Column(name = "email_code")
	public Integer getEmailCode() {
		return emailCode;
	}
	
	
	public void setEmailCode(Integer emailCode) {
		this.emailCode = emailCode;
	}
		 	@Column(name = "phone_code")
	public Integer getPhoneCode() {
		return phoneCode;
	}
	
	
	public void setPhoneCode(Integer phoneCode) {
		this.phoneCode = phoneCode;
	}
		 	@Column(name = "email_code_times")
	public Integer getEmailCodeTimes() {
		return emailCodeTimes;
	}
	
	
	public void setEmailCodeTimes(Integer emailCodeTimes) {
		this.emailCodeTimes = emailCodeTimes;
	}
		 	@Column(name = "phone_code_times")
	public Integer getPhoneCodeTimes() {
		return phoneCodeTimes;
	}
	
	
	public void setPhoneCodeTimes(Integer phoneCodeTimes) {
		this.phoneCodeTimes = phoneCodeTimes;
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

