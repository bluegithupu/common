<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>
<%@page contentType="text/html;charset=utf-8"%>

<json:object escapeXml="false">
	<json:property name="code" value="${code}"></json:property>
	<json:property name="message">
		<spring:message code="${code}" />
	</json:property>

			<json:object name="data">
		
								
               
                    <json:property name="id" value="${temporaryData.id}"></json:property>
           
           
	   
                    			
               
                    <json:property name="openID" value="${temporaryData.openID}"></json:property>
           
           
	   
                    			
               
                    <json:property name="accessToken" value="${temporaryData.accessToken}"></json:property>
           
           
	   
                    			
               
                    <json:property name="emailCode" value="${temporaryData.emailCode}"></json:property>
           
           
	   
                    			
               
                    <json:property name="phoneCode" value="${temporaryData.phoneCode}"></json:property>
           
           
	   
                    			
               
                    <json:property name="emailCodeTimes" value="${temporaryData.emailCodeTimes}"></json:property>
           
           
	   
                    			
               
                    <json:property name="phoneCodeTimes" value="${temporaryData.phoneCodeTimes}"></json:property>
           
           
	   
                    			
               
                    <json:property name="createBy" value="${temporaryData.createBy}"></json:property>
           
           
	   
                    			
               
                    <json:property name="updateBy" value="${temporaryData.updateBy}"></json:property>
           
           
	   
                    			
               
                    <json:property name="createAt" value="${temporaryData.createAt}"></json:property>
           
           
	   
                    			
               
                    <json:property name="updateAt" value="${temporaryData.updateAt}"></json:property>
           
           
	   
                    				
	 
			</json:object>
		
</json:object>


