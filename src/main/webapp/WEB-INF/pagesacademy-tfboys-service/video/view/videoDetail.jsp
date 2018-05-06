<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>
    <input type="hidden" value="video" id="current_nav">
	<div id="videoDetailApp" ng-app="videoDetailApp">
		<div ng-controller="videoDetailController">
			
			<div class="portlet">
			    <div class="portlet-title">
			        <div class="caption"><i class="fa fa-cogs"></i>
											  	<c:choose>
					   		<c:when test="${id > 0}">编辑</c:when> 
					   	    <c:otherwise>新增</c:otherwise>
				   	    </c:choose>		
					</div>
			    </div>
		
		
			    <form class="form-horizontal" role="form" name="videoForm">
			   	 	
				  
				 				 
				 				      <input type="hidden" name="id" id="videoId" ng-model="video.id" ng-bind="video.id" value="${id}">
			      				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="title" class="col-sm-2 control-label">标题</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="title" ng-model="video.title" ng-bind="video.title" placeholder="请输入标题" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="type" class="col-sm-2 control-label">banner/car</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="type" ng-model="video.type" ng-bind="video.type" placeholder="请输入banner/car" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="grade" class="col-sm-2 control-label">年级</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="grade" ng-model="video.grade" ng-bind="video.grade" placeholder="请输入年级" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="subject" class="col-sm-2 control-label">科目</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="subject" ng-model="video.subject" ng-bind="video.subject" placeholder="请输入科目" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="teacherID" class="col-sm-2 control-label">老师id</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="teacherID" ng-model="video.teacherID" ng-bind="video.teacherID" placeholder="请输入老师id" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="status" class="col-sm-2 control-label">是否冻结</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="status" ng-model="video.status" ng-bind="video.status" placeholder="请输入是否冻结" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="url" class="col-sm-2 control-label">视频url</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="url" ng-model="video.url" ng-bind="video.url" placeholder="请输入视频url" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="cover" class="col-sm-2 control-label">视频封面</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="cover" ng-model="video.cover" ng-bind="video.cover" placeholder="请输入视频封面" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="summary" class="col-sm-2 control-label">简介</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="summary" ng-model="video.summary" ng-bind="video.summary" placeholder="请输入简介" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="content" class="col-sm-2 control-label">正文</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="content" ng-model="video.content" ng-bind="video.content" placeholder="请输入正文" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="collectedNumber" class="col-sm-2 control-label">收藏数</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="collectedNumber" ng-model="video.collectedNumber" ng-bind="video.collectedNumber" placeholder="请输入收藏数" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="likedNumber" class="col-sm-2 control-label">点赞数</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="likedNumber" ng-model="video.likedNumber" ng-bind="video.likedNumber" placeholder="请输入点赞数" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="createBy" class="col-sm-2 control-label">创建人</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="createBy" ng-model="video.createBy" ng-bind="video.createBy" placeholder="请输入创建人" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="updateBy" class="col-sm-2 control-label">更新人</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="updateBy" ng-model="video.updateBy" ng-bind="video.updateBy" placeholder="请输入更新人" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            					  <div class="form-group">
			        <div class="col-sm-offset-2 col-sm-10">
			          <button class="btn btn-primary col-sm-2" type="submit" ng-click="updateVideo(video)">保存</button>
			          <a class="btn btn-primary col-sm-2 col-sm-offset-2" ng-href="/web/c/video">取消</a>
			        </div>
			      </div>
			     
			    </form>
			 </div>
		 </div>
	 </div>
	 
	 <script src="/r/js-src/web/academy-tfboys-service/video/videoDetail.js"></script>
