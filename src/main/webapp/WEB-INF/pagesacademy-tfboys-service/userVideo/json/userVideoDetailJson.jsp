<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>
<%@page contentType="text/html;charset=utf-8"%>

<json:object escapeXml="false">
	<json:property name="code" value="${code}"></json:property>
	<json:property name="message">
		<spring:message code="${code}" />
	</json:property>

			<json:object name="data">
		
								
               
                    <json:property name="id" value="${userVideo.id}"></json:property>
           
           
	   
                    			
               
                    <json:property name="userID" value="${userVideo.userID}"></json:property>
           
           
	   
                    			
               
                    <json:property name="videoID" value="${userVideo.videoID}"></json:property>
           
           
	   
                    			
               
                    <json:property name="collectionStatus" value="${userVideo.collectionStatus}"></json:property>
           
           
	   
                    			
               
                    <json:property name="likedStatus" value="${userVideo.likedStatus}"></json:property>
           
           
	   
                    			
               
                    <json:property name="createBy" value="${userVideo.createBy}"></json:property>
           
           
	   
                    			
               
                    <json:property name="updateBy" value="${userVideo.updateBy}"></json:property>
           
           
	   
                    			
               
                    <json:property name="createAt" value="${userVideo.createAt}"></json:property>
           
           
	   
                    			
               
                    <json:property name="updateAt" value="${userVideo.updateAt}"></json:property>
           
           
	   
                    				
	 
			</json:object>
		
</json:object>


