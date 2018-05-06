<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>
<%@page contentType="text/html;charset=utf-8"%>

<json:object escapeXml="false">
	<json:property name="code" value="${code}"></json:property>
	<json:property name="message">
		<spring:message code="${code}" />
	</json:property>

			<json:object name="data">
		
								
               
                    <json:property name="id" value="${admin.id}"></json:property>
           
           
	   
                    			
               
                    <json:property name="roleID" value="${admin.roleID}"></json:property>
           
           
	   
                    			
               
                    <json:property name="salt" value="${admin.salt}"></json:property>
           
           
	   
                    			
               
                    <json:property name="userName" value="${admin.userName}"></json:property>
           
           
	   
                    			
               
                    <json:property name="passWord" value="${admin.passWord}"></json:property>
           
           
	   
                    			
               
                    <json:property name="phone" value="${admin.phone}"></json:property>
           
           
	   
                    			
               
                    <json:property name="createBy" value="${admin.createBy}"></json:property>
           
           
	   
                    			
               
                    <json:property name="updateBy" value="${admin.updateBy}"></json:property>
           
           
	   
                    			
               
                    <json:property name="createAt" value="${admin.createAt}"></json:property>
           
           
	   
                    			
               
                    <json:property name="updateAt" value="${admin.updateAt}"></json:property>
           
           
	   
                    				
	 
			</json:object>
		
</json:object>


