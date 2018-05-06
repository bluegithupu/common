<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>
<%@page contentType="text/html;charset=utf-8"%>

<json:object escapeXml="false">
	<json:property name="code" value="${code}"></json:property>
	<json:property name="message">
		<spring:message code="${code}" />
	</json:property>

			<json:object name="data">
		
								
               
                    <json:property name="id" value="${moduleRole.id}"></json:property>
           
           
	   
                    			
               
                    <json:property name="roleID" value="${moduleRole.roleID}"></json:property>
           
           
	   
                    			
               
                    <json:property name="moduleID" value="${moduleRole.moduleID}"></json:property>
           
           
	   
                    			
               
                    <json:property name="createBy" value="${moduleRole.createBy}"></json:property>
           
           
	   
                    			
               
                    <json:property name="updateBy" value="${moduleRole.updateBy}"></json:property>
           
           
	   
                    			
               
                    <json:property name="createAt" value="${moduleRole.createAt}"></json:property>
           
           
	   
                    			
               
                    <json:property name="updateAt" value="${moduleRole.updateAt}"></json:property>
           
           
	   
                    				
	 
			</json:object>
		
</json:object>


