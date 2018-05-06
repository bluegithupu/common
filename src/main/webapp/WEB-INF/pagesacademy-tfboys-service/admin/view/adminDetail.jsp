<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>
    <input type="hidden" value="admin" id="current_nav">
	<div id="adminDetailApp" ng-app="adminDetailApp">
		<div ng-controller="adminDetailController">
			
			<div class="portlet">
			    <div class="portlet-title">
			        <div class="caption"><i class="fa fa-cogs"></i>
											  	<c:choose>
					   		<c:when test="${id > 0}">编辑</c:when> 
					   	    <c:otherwise>新增</c:otherwise>
				   	    </c:choose>		
					</div>
			    </div>
		
		
			    <form class="form-horizontal" role="form" name="adminForm">
			   	 	
				  
				 				 
				 				      <input type="hidden" name="id" id="adminId" ng-model="admin.id" ng-bind="admin.id" value="${id}">
			      				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="roleID" class="col-sm-2 control-label">角色id</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="roleID" ng-model="admin.roleID" ng-bind="admin.roleID" placeholder="请输入角色id" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="salt" class="col-sm-2 control-label">盐</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="salt" ng-model="admin.salt" ng-bind="admin.salt" placeholder="请输入盐" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="userName" class="col-sm-2 control-label">用户名</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="userName" ng-model="admin.userName" ng-bind="admin.userName" placeholder="请输入用户名" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="passWord" class="col-sm-2 control-label">密码</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="passWord" ng-model="admin.passWord" ng-bind="admin.passWord" placeholder="请输入密码" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="phone" class="col-sm-2 control-label">手机</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="phone" ng-model="admin.phone" ng-bind="admin.phone" placeholder="请输入手机" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="createBy" class="col-sm-2 control-label">创建人</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="createBy" ng-model="admin.createBy" ng-bind="admin.createBy" placeholder="请输入创建人" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="updateBy" class="col-sm-2 control-label">更新人</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="updateBy" ng-model="admin.updateBy" ng-bind="admin.updateBy" placeholder="请输入更新人" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            					  <div class="form-group">
			        <div class="col-sm-offset-2 col-sm-10">
			          <button class="btn btn-primary col-sm-2" type="submit" ng-click="updateAdmin(admin)">保存</button>
			          <a class="btn btn-primary col-sm-2 col-sm-offset-2" ng-href="/web/c/admin">取消</a>
			        </div>
			      </div>
			     
			    </form>
			 </div>
		 </div>
	 </div>
	 
	 <script src="/r/js-src/web/academy-tfboys-service/admin/adminDetail.js"></script>
