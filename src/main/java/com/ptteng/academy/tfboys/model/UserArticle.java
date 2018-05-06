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
@Table(name = "user_article")
public class UserArticle implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5146804745780399104L;	
	
		
   	 
    private  Long id;
	
  	 
    private  Long userID;
	
  	 
    private  Long articleID;
	
  	 
    private  Integer collectionStatus;
	
  	 
    private  Integer likedStatus;
	
  	 
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
		 	@Column(name = "article_id")
	public Long getArticleID() {
		return articleID;
	}
	
	
	public void setArticleID(Long articleID) {
		this.articleID = articleID;
	}
		 	@Column(name = "collection_status")
	public Integer getCollectionStatus() {
		return collectionStatus;
	}
	
	
	public void setCollectionStatus(Integer collectionStatus) {
		this.collectionStatus = collectionStatus;
	}
		 	@Column(name = "liked_status")
	public Integer getLikedStatus() {
		return likedStatus;
	}
	
	
	public void setLikedStatus(Integer likedStatus) {
		this.likedStatus = likedStatus;
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

