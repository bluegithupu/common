<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>
    <input type="hidden" value="user" id="current_nav">
	<div id="userDetailApp" ng-app="userDetailApp">
		<div ng-controller="userDetailController">
			
			<div class="portlet">
			    <div class="portlet-title">
			        <div class="caption"><i class="fa fa-cogs"></i>
											  	<c:choose>
					   		<c:when test="${id > 0}">编辑</c:when> 
					   	    <c:otherwise>新增</c:otherwise>
				   	    </c:choose>		
					</div>
			    </div>
		
		
			    <form class="form-horizontal" role="form" name="userForm">
			   	 	
				  
				 				 
				 				      <input type="hidden" name="id" id="userId" ng-model="user.id" ng-bind="user.id" value="${id}">
			      				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="openID" class="col-sm-2 control-label">微信OpenID</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="openID" ng-model="user.openID" ng-bind="user.openID" placeholder="请输入微信OpenID" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="phone" class="col-sm-2 control-label">手机号</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="phone" ng-model="user.phone" ng-bind="user.phone" placeholder="请输入手机号" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="email" class="col-sm-2 control-label">邮箱</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="email" ng-model="user.email" ng-bind="user.email" placeholder="请输入邮箱" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="passWord" class="col-sm-2 control-label">密码</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="passWord" ng-model="user.passWord" ng-bind="user.passWord" placeholder="请输入密码" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="nickName" class="col-sm-2 control-label">昵称</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="nickName" ng-model="user.nickName" ng-bind="user.nickName" placeholder="请输入昵称" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="grade" class="col-sm-2 control-label">年级</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="grade" ng-model="user.grade" ng-bind="user.grade" placeholder="请输入年级" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="avatar" class="col-sm-2 control-label">头像url</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="avatar" ng-model="user.avatar" ng-bind="user.avatar" placeholder="请输入头像url" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="adress" class="col-sm-2 control-label">省份+市区</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="adress" ng-model="user.adress" ng-bind="user.adress" placeholder="请输入省份+市区" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="status" class="col-sm-2 control-label">是否冻结</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="status" ng-model="user.status" ng-bind="user.status" placeholder="请输入是否冻结" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="sex" class="col-sm-2 control-label">性别</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="sex" ng-model="user.sex" ng-bind="user.sex" placeholder="请输入性别" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="createBy" class="col-sm-2 control-label">创建人</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="createBy" ng-model="user.createBy" ng-bind="user.createBy" placeholder="请输入创建人" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="updateBy" class="col-sm-2 control-label">更新人</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="updateBy" ng-model="user.updateBy" ng-bind="user.updateBy" placeholder="请输入更新人" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            					  <div class="form-group">
			        <div class="col-sm-offset-2 col-sm-10">
			          <button class="btn btn-primary col-sm-2" type="submit" ng-click="updateUser(user)">保存</button>
			          <a class="btn btn-primary col-sm-2 col-sm-offset-2" ng-href="/web/c/user">取消</a>
			        </div>
			      </div>
			     
			    </form>
			 </div>
		 </div>
	 </div>
	 
	 <script src="/r/js-src/web/academy-tfboys-service/user/userDetail.js"></script>
