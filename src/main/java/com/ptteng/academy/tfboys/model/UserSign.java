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
@Table(name = "user_sign")
public class UserSign implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4377784710097765376L;	
	
		
   	 
    private  Long id;
	
  	 
    private  Long userID;
	
  	 
    private  Integer totalSign;
	
  	 
    private  Integer maxSign;
	
  	 
    private  Integer continuousNumber;
	
  	 
    private  String recordSign;
	
  	 
    private  Integer bean;
	
  	 
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
		 	@Column(name = "user_id")
	public Long getUserID() {
		return userID;
	}
	
	
	public void setUserID(Long userID) {
		this.userID = userID;
	}
		 	@Column(name = "total_sign")
	public Integer getTotalSign() {
		return totalSign;
	}
	
	
	public void setTotalSign(Integer totalSign) {
		this.totalSign = totalSign;
	}
		 	@Column(name = "max_sign")
	public Integer getMaxSign() {
		return maxSign;
	}
	
	
	public void setMaxSign(Integer maxSign) {
		this.maxSign = maxSign;
	}
		 	@Column(name = "continuous_number")
	public Integer getContinuousNumber() {
		return continuousNumber;
	}
	
	
	public void setContinuousNumber(Integer continuousNumber) {
		this.continuousNumber = continuousNumber;
	}
		 	@Column(name = "record_sign")
	public String getRecordSign() {
		return recordSign;
	}
	
	
	public void setRecordSign(String recordSign) {
		this.recordSign = recordSign;
	}
		 	@Column(name = "bean")
	public Integer getBean() {
		return bean;
	}
	
	
	public void setBean(Integer bean) {
		this.bean = bean;
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

