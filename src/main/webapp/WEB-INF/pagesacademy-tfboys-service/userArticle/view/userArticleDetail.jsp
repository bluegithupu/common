<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>
    <input type="hidden" value="userArticle" id="current_nav">
	<div id="userArticleDetailApp" ng-app="userArticleDetailApp">
		<div ng-controller="userArticleDetailController">
			
			<div class="portlet">
			    <div class="portlet-title">
			        <div class="caption"><i class="fa fa-cogs"></i>
											  	<c:choose>
					   		<c:when test="${id > 0}">编辑</c:when> 
					   	    <c:otherwise>新增</c:otherwise>
				   	    </c:choose>		
					</div>
			    </div>
		
		
			    <form class="form-horizontal" role="form" name="userArticleForm">
			   	 	
				  
				 				 
				 				      <input type="hidden" name="id" id="userArticleId" ng-model="userArticle.id" ng-bind="userArticle.id" value="${id}">
			      				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="userID" class="col-sm-2 control-label">用户id</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="userID" ng-model="userArticle.userID" ng-bind="userArticle.userID" placeholder="请输入用户id" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="articleID" class="col-sm-2 control-label">文章id</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="articleID" ng-model="userArticle.articleID" ng-bind="userArticle.articleID" placeholder="请输入文章id" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="collectionStatus" class="col-sm-2 control-label">收藏状态</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="collectionStatus" ng-model="userArticle.collectionStatus" ng-bind="userArticle.collectionStatus" placeholder="请输入收藏状态" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="likedStatus" class="col-sm-2 control-label">点赞状态</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="likedStatus" ng-model="userArticle.likedStatus" ng-bind="userArticle.likedStatus" placeholder="请输入点赞状态" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="createBy" class="col-sm-2 control-label">创建人</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="createBy" ng-model="userArticle.createBy" ng-bind="userArticle.createBy" placeholder="请输入创建人" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="updateBy" class="col-sm-2 control-label">更新人</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="updateBy" ng-model="userArticle.updateBy" ng-bind="userArticle.updateBy" placeholder="请输入更新人" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            					  <div class="form-group">
			        <div class="col-sm-offset-2 col-sm-10">
			          <button class="btn btn-primary col-sm-2" type="submit" ng-click="updateUserArticle(userArticle)">保存</button>
			          <a class="btn btn-primary col-sm-2 col-sm-offset-2" ng-href="/web/c/userArticle">取消</a>
			        </div>
			      </div>
			     
			    </form>
			 </div>
		 </div>
	 </div>
	 
	 <script src="/r/js-src/web/academy-tfboys-service/userArticle/userArticleDetail.js"></script>
