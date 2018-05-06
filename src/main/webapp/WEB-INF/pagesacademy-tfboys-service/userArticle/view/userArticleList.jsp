<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>

<input type="hidden" value="userArticle" id="current_nav">
<div id="userArticleApp" ng-app="userArticleApp">
	<div ng-controller="userArticleController">

		<div class="portlet">
		    <div class="portlet-title">
		        <div class="caption"><i class="fa fa-cogs"></i>UserArticle管理</div>
		    </div>
		    <span class="btn green fileinput-button">
		        <i class="fa fa-plus"></i>
		        <span ng-click="addUserArticle(userArticle)">新增</span>
		    </span>
	
			<paging url="/web/a/userArticle">
				<table class="table table-striped table-bordered table-hover">
					<tr>
									                    <td>自增长ID</td>
			        				                    <td>用户id</td>
			        				                    <td>文章id</td>
			        				                    <td>收藏状态</td>
			        				                    <td>点赞状态</td>
			        				                    <td>创建人</td>
			        				                    <td>更新人</td>
			        				                    <td>创建时间</td>
			        				                    <td>更新时间</td>
			        							<th>操作</th>
					</tr>
					<tr ng-repeat="userArticle in data">				
									                    <td ng-bind="userArticle.id" ></td>
			        				                    <td ng-bind="userArticle.userID" ></td>
			        				                    <td ng-bind="userArticle.articleID" ></td>
			        				                    <td ng-bind="userArticle.collectionStatus" ></td>
			        				                    <td ng-bind="userArticle.likedStatus" ></td>
			        				                    <td ng-bind="userArticle.createBy" ></td>
			        				                    <td ng-bind="userArticle.updateBy" ></td>
			        				                    <td ng-bind="userArticle.createAt" ></td>
			        				                    <td ng-bind="userArticle.updateAt" ></td>
			        								
						<td>
							<input type="button" value="修改" ng-click="updateUserArticle(userArticle.id)" /> 
							<input type="button" value="删除" ng-click="deleteUserArticle(userArticle.id)" />
						</td>
					</tr>
				</table>		
			</paging>
	
		</div>
	</div>
</div>

<!-- Angular JS -->
<script src="/r/js-src/web/academy-tfboys-service/userArticle/userArticleList.js"></script>
