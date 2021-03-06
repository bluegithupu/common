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
		<c:forEach items="${userArticleList}" var="userArticle">
			<json:object>
					
               
                    <json:property name="id" value="${userArticle.id}"></json:property>
           
           
	   
        			
               
                    <json:property name="userID" value="${userArticle.userID}"></json:property>
           
           
	   
        			
               
                    <json:property name="articleID" value="${userArticle.articleID}"></json:property>
           
           
	   
        			
               
                    <json:property name="collectionStatus" value="${userArticle.collectionStatus}"></json:property>
           
           
	   
        			
               
                    <json:property name="likedStatus" value="${userArticle.likedStatus}"></json:property>
           
           
	   
        			
               
                    <json:property name="createBy" value="${userArticle.createBy}"></json:property>
           
           
	   
        			
               
                    <json:property name="updateBy" value="${userArticle.updateBy}"></json:property>
           
           
	   
        			
               
                    <json:property name="createAt" value="${userArticle.createAt}"></json:property>
           
           
	   
        			
               
                    <json:property name="updateAt" value="${userArticle.updateAt}"></json:property>
           
           
	   
        			</json:object>
		</c:forEach>
	</json:array>
</json:object>


