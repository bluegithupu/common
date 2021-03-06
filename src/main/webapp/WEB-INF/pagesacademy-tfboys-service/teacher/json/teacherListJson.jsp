<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>
<%@page contentType="text/html;charset=utf-8"%>

<json:object escapeXml="false">
<json:property name="code" value="${code}"></json:property>
	<json:property name="message">
		<spring:message code="${code}" />
	</json:property>
	<json:property name="size" value="${size}"></json:property>
	<json:property name="total" value="${total}"></json:property>
	<json:array name="data">
		<c:forEach items="${teacherList}" var="teacher">
			<json:object>
					
               
                    <json:property name="id" value="${teacher.id}"></json:property>
           
           
	   
        			
               
                    <json:property name="nickName" value="${teacher.nickName}"></json:property>
           
           
	   
        			
               
                    <json:property name="avatar" value="${teacher.avatar}"></json:property>
           
           
	   
        			
               
                    <json:property name="createBy" value="${teacher.createBy}"></json:property>
           
           
	   
        			
               
                    <json:property name="updateBy" value="${teacher.updateBy}"></json:property>
           
           
	   
        			
               
                    <json:property name="createAt" value="${teacher.createAt}"></json:property>
           
           
	   
        			
               
                    <json:property name="updateAt" value="${teacher.updateAt}"></json:property>
           
           
	   
        			</json:object>
		</c:forEach>
	</json:array>
</json:object>


