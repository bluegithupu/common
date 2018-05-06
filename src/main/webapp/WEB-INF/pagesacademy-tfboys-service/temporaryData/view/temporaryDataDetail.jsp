<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>
    <input type="hidden" value="temporaryData" id="current_nav">
	<div id="temporaryDataDetailApp" ng-app="temporaryDataDetailApp">
		<div ng-controller="temporaryDataDetailController">
			
			<div class="portlet">
			    <div class="portlet-title">
			        <div class="caption"><i class="fa fa-cogs"></i>
											  	<c:choose>
					   		<c:when test="${id > 0}">编辑</c:when> 
					   	    <c:otherwise>新增</c:otherwise>
				   	    </c:choose>		
					</div>
			    </div>
		
		
			    <form class="form-horizontal" role="form" name="temporaryDataForm">
			   	 	
				  
				 				 
				 				      <input type="hidden" name="id" id="temporaryDataId" ng-model="temporaryData.id" ng-bind="temporaryData.id" value="${id}">
			      				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="openID" class="col-sm-2 control-label">openID</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="openID" ng-model="temporaryData.openID" ng-bind="temporaryData.openID" placeholder="请输入openID" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="accessToken" class="col-sm-2 control-label">授权token</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="accessToken" ng-model="temporaryData.accessToken" ng-bind="temporaryData.accessToken" placeholder="请输入授权token" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="emailCode" class="col-sm-2 control-label">邮件激活码</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="emailCode" ng-model="temporaryData.emailCode" ng-bind="temporaryData.emailCode" placeholder="请输入邮件激活码" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="phoneCode" class="col-sm-2 control-label">手机激活码</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="phoneCode" ng-model="temporaryData.phoneCode" ng-bind="temporaryData.phoneCode" placeholder="请输入手机激活码" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="emailCodeTimes" class="col-sm-2 control-label">邮件当天激活次数</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="emailCodeTimes" ng-model="temporaryData.emailCodeTimes" ng-bind="temporaryData.emailCodeTimes" placeholder="请输入邮件当天激活次数" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="phoneCodeTimes" class="col-sm-2 control-label">手机当天激活次数</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="phoneCodeTimes" ng-model="temporaryData.phoneCodeTimes" ng-bind="temporaryData.phoneCodeTimes" placeholder="请输入手机当天激活次数" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="createBy" class="col-sm-2 control-label">创建人</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="createBy" ng-model="temporaryData.createBy" ng-bind="temporaryData.createBy" placeholder="请输入创建人" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="updateBy" class="col-sm-2 control-label">更新人</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="updateBy" ng-model="temporaryData.updateBy" ng-bind="temporaryData.updateBy" placeholder="请输入更新人" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            					  <div class="form-group">
			        <div class="col-sm-offset-2 col-sm-10">
			          <button class="btn btn-primary col-sm-2" type="submit" ng-click="updateTemporaryData(temporaryData)">保存</button>
			          <a class="btn btn-primary col-sm-2 col-sm-offset-2" ng-href="/web/c/temporaryData">取消</a>
			        </div>
			      </div>
			     
			    </form>
			 </div>
		 </div>
	 </div>
	 
	 <script src="/r/js-src/web/academy-tfboys-service/temporaryData/temporaryDataDetail.js"></script>
