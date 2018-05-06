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
@Table(name = "video")
public class Video implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3742029375110410240L;	
	
		
   	 
    private  Long id;
	
  	 
    private  String title;
	
  	 
    private  Integer type;
	
  	 
    private  Integer grade;
	
  	 
    private  Integer subject;
	
  	 
    private  Integer teacherID;
	
  	 
    private  Integer status;
	
  	 
    private  String url;
	
  	 
    private  String cover;
	
  	 
    private  String summary;
	
  	 
    private  String content;
	
  	 
    private  Integer collectedNumber;
	
  	 
    private  Integer likedNumber;
	
  	 
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
		 	@Column(name = "title")
	public String getTitle() {
		return title;
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}
		 	@Column(name = "type")
	public Integer getType() {
		return type;
	}
	
	
	public void setType(Integer type) {
		this.type = type;
	}
		 	@Column(name = "grade")
	public Integer getGrade() {
		return grade;
	}
	
	
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
		 	@Column(name = "subject")
	public Integer getSubject() {
		return subject;
	}
	
	
	public void setSubject(Integer subject) {
		this.subject = subject;
	}
		 	@Column(name = "teacher_id")
	public Integer getTeacherID() {
		return teacherID;
	}
	
	
	public void setTeacherID(Integer teacherID) {
		this.teacherID = teacherID;
	}
		 	@Column(name = "status")
	public Integer getStatus() {
		return status;
	}
	
	
	public void setStatus(Integer status) {
		this.status = status;
	}
		 	@Column(name = "url")
	public String getUrl() {
		return url;
	}
	
	
	public void setUrl(String url) {
		this.url = url;
	}
		 	@Column(name = "cover")
	public String getCover() {
		return cover;
	}
	
	
	public void setCover(String cover) {
		this.cover = cover;
	}
		 	@Column(name = "summary")
	public String getSummary() {
		return summary;
	}
	
	
	public void setSummary(String summary) {
		this.summary = summary;
	}
		 	@Column(name = "content")
	public String getContent() {
		return content;
	}
	
	
	public void setContent(String content) {
		this.content = content;
	}
		 	@Column(name = "collected_number")
	public Integer getCollectedNumber() {
		return collectedNumber;
	}
	
	
	public void setCollectedNumber(Integer collectedNumber) {
		this.collectedNumber = collectedNumber;
	}
		 	@Column(name = "liked_number")
	public Integer getLikedNumber() {
		return likedNumber;
	}
	
	
	public void setLikedNumber(Integer likedNumber) {
		this.likedNumber = likedNumber;
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

