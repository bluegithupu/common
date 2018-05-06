<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>
    <input type="hidden" value="moduleRole" id="current_nav">
	<div id="moduleRoleDetailApp" ng-app="moduleRoleDetailApp">
		<div ng-controller="moduleRoleDetailController">
			
			<div class="portlet">
			    <div class="portlet-title">
			        <div class="caption"><i class="fa fa-cogs"></i>
											  	<c:choose>
					   		<c:when test="${id > 0}">编辑</c:when> 
					   	    <c:otherwise>新增</c:otherwise>
				   	    </c:choose>		
					</div>
			    </div>
		
		
			    <form class="form-horizontal" role="form" name="moduleRoleForm">
			   	 	
				  
				 				 
				 				      <input type="hidden" name="id" id="moduleRoleId" ng-model="moduleRole.id" ng-bind="moduleRole.id" value="${id}">
			      				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="roleID" class="col-sm-2 control-label">角色id</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="roleID" ng-model="moduleRole.roleID" ng-bind="moduleRole.roleID" placeholder="请输入角色id" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="moduleID" class="col-sm-2 control-label">模块id</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="moduleID" ng-model="moduleRole.moduleID" ng-bind="moduleRole.moduleID" placeholder="请输入模块id" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="createBy" class="col-sm-2 control-label">创建人</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="createBy" ng-model="moduleRole.createBy" ng-bind="moduleRole.createBy" placeholder="请输入创建人" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="updateBy" class="col-sm-2 control-label">更新人</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="updateBy" ng-model="moduleRole.updateBy" ng-bind="moduleRole.updateBy" placeholder="请输入更新人" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            					  <div class="form-group">
			        <div class="col-sm-offset-2 col-sm-10">
			          <button class="btn btn-primary col-sm-2" type="submit" ng-click="updateModuleRole(moduleRole)">保存</button>
			          <a class="btn btn-primary col-sm-2 col-sm-offset-2" ng-href="/web/c/moduleRole">取消</a>
			        </div>
			      </div>
			     
			    </form>
			 </div>
		 </div>
	 </div>
	 
	 <script src="/r/js-src/web/academy-tfboys-service/moduleRole/moduleRoleDetail.js"></script>
