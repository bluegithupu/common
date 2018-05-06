<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>

<input type="hidden" value="user" id="current_nav">
<div id="userApp" ng-app="userApp">
	<div ng-controller="userController">

		<div class="portlet">
		    <div class="portlet-title">
		        <div class="caption"><i class="fa fa-cogs"></i>User管理</div>
		    </div>
		    <span class="btn green fileinput-button">
		        <i class="fa fa-plus"></i>
		        <span ng-click="addUser(user)">新增</span>
		    </span>
	
			<paging url="/web/a/user">
				<table class="table table-striped table-bordered table-hover">
					<tr>
									                    <td>自增长ID</td>
			        				                    <td>微信OpenID</td>
			        				                    <td>手机号</td>
			        				                    <td>邮箱</td>
			        				                    <td>密码</td>
			        				                    <td>昵称</td>
			        				                    <td>年级</td>
			        				                    <td>头像url</td>
			        				                    <td>省份+市区</td>
			        				                    <td>是否冻结</td>
			        				                    <td>性别</td>
			        				                    <td>创建人</td>
			        				                    <td>更新人</td>
			        				                    <td>创建时间</td>
			        				                    <td>更新时间</td>
			        							<th>操作</th>
					</tr>
					<tr ng-repeat="user in data">				
									                    <td ng-bind="user.id" ></td>
			        				                    <td ng-bind="user.openID" ></td>
			        				                    <td ng-bind="user.phone" ></td>
			        				                    <td ng-bind="user.email" ></td>
			        				                    <td ng-bind="user.passWord" ></td>
			        				                    <td ng-bind="user.nickName" ></td>
			        				                    <td ng-bind="user.grade" ></td>
			        				                    <td ng-bind="user.avatar" ></td>
			        				                    <td ng-bind="user.adress" ></td>
			        				                    <td ng-bind="user.status" ></td>
			        				                    <td ng-bind="user.sex" ></td>
			        				                    <td ng-bind="user.createBy" ></td>
			        				                    <td ng-bind="user.updateBy" ></td>
			        				                    <td ng-bind="user.createAt" ></td>
			        				                    <td ng-bind="user.updateAt" ></td>
			        								
						<td>
							<input type="button" value="修改" ng-click="updateUser(user.id)" /> 
							<input type="button" value="删除" ng-click="deleteUser(user.id)" />
						</td>
					</tr>
				</table>		
			</paging>
	
		</div>
	</div>
</div>

<!-- Angular JS -->
<script src="/r/js-src/web/academy-tfboys-service/user/userList.js"></script>
