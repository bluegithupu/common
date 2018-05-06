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
@Table(name = "user")
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2606888175750338560L;	
	
		
   	 
    private  Long id;
	
  	 
    private  String openID;
	
  	 
    private  String phone;
	
  	 
    private  String email;
	
  	 
    private  String passWord;
	
  	 
    private  String nickName;
	
  	 
    private  Integer grade;
	
  	 
    private  String avatar;
	
  	 
    private  String adress;
	
  	 
    private  Integer status;
	
  	 
    private  Integer sex;
	
  	 
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
		 	@Column(name = "phone")
	public String getPhone() {
		return phone;
	}
	
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
		 	@Column(name = "email")
	public String getEmail() {
		return email;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
		 	@Column(name = "password")
	public String getPassWord() {
		return passWord;
	}
	
	
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
		 	@Column(name = "nick_name")
	public String getNickName() {
		return nickName;
	}
	
	
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
		 	@Column(name = "grade")
	public Integer getGrade() {
		return grade;
	}
	
	
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
		 	@Column(name = "avatar")
	public String getAvatar() {
		return avatar;
	}
	
	
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
		 	@Column(name = "adress")
	public String getAdress() {
		return adress;
	}
	
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
		 	@Column(name = "status")
	public Integer getStatus() {
		return status;
	}
	
	
	public void setStatus(Integer status) {
		this.status = status;
	}
		 	@Column(name = "sex")
	public Integer getSex() {
		return sex;
	}
	
	
	public void setSex(Integer sex) {
		this.sex = sex;
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

