<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>
    <input type="hidden" value="teacher" id="current_nav">
	<div id="teacherDetailApp" ng-app="teacherDetailApp">
		<div ng-controller="teacherDetailController">
			
			<div class="portlet">
			    <div class="portlet-title">
			        <div class="caption"><i class="fa fa-cogs"></i>
											  	<c:choose>
					   		<c:when test="${id > 0}">编辑</c:when> 
					   	    <c:otherwise>新增</c:otherwise>
				   	    </c:choose>		
					</div>
			    </div>
		
		
			    <form class="form-horizontal" role="form" name="teacherForm">
			   	 	
				  
				 				 
				 				      <input type="hidden" name="id" id="teacherId" ng-model="teacher.id" ng-bind="teacher.id" value="${id}">
			      				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="nickName" class="col-sm-2 control-label">昵称</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="nickName" ng-model="teacher.nickName" ng-bind="teacher.nickName" placeholder="请输入昵称" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="avatar" class="col-sm-2 control-label">头像url</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="avatar" ng-model="teacher.avatar" ng-bind="teacher.avatar" placeholder="请输入头像url" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="createBy" class="col-sm-2 control-label">创建人</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="createBy" ng-model="teacher.createBy" ng-bind="teacher.createBy" placeholder="请输入创建人" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="updateBy" class="col-sm-2 control-label">更新人</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="updateBy" ng-model="teacher.updateBy" ng-bind="teacher.updateBy" placeholder="请输入更新人" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            					  <div class="form-group">
			        <div class="col-sm-offset-2 col-sm-10">
			          <button class="btn btn-primary col-sm-2" type="submit" ng-click="updateTeacher(teacher)">保存</button>
			          <a class="btn btn-primary col-sm-2 col-sm-offset-2" ng-href="/web/c/teacher">取消</a>
			        </div>
			      </div>
			     
			    </form>
			 </div>
		 </div>
	 </div>
	 
	 <script src="/r/js-src/web/academy-tfboys-service/teacher/teacherDetail.js"></script>
