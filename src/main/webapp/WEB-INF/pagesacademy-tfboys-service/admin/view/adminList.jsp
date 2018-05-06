<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>

<input type="hidden" value="admin" id="current_nav">
<div id="adminApp" ng-app="adminApp">
	<div ng-controller="adminController">

		<div class="portlet">
		    <div class="portlet-title">
		        <div class="caption"><i class="fa fa-cogs"></i>Admin管理</div>
		    </div>
		    <span class="btn green fileinput-button">
		        <i class="fa fa-plus"></i>
		        <span ng-click="addAdmin(admin)">新增</span>
		    </span>
	
			<paging url="/web/a/admin">
				<table class="table table-striped table-bordered table-hover">
					<tr>
									                    <td>自增长ID</td>
			        				                    <td>角色id</td>
			        				                    <td>盐</td>
			        				                    <td>用户名</td>
			        				                    <td>密码</td>
			        				                    <td>手机</td>
			        				                    <td>创建人</td>
			        				                    <td>更新人</td>
			        				                    <td>创建时间</td>
			        				                    <td>更新时间</td>
			        							<th>操作</th>
					</tr>
					<tr ng-repeat="admin in data">				
									                    <td ng-bind="admin.id" ></td>
			        				                    <td ng-bind="admin.roleID" ></td>
			        				                    <td ng-bind="admin.salt" ></td>
			        				                    <td ng-bind="admin.userName" ></td>
			        				                    <td ng-bind="admin.passWord" ></td>
			        				                    <td ng-bind="admin.phone" ></td>
			        				                    <td ng-bind="admin.createBy" ></td>
			        				                    <td ng-bind="admin.updateBy" ></td>
			        				                    <td ng-bind="admin.createAt" ></td>
			        				                    <td ng-bind="admin.updateAt" ></td>
			        								
						<td>
							<input type="button" value="修改" ng-click="updateAdmin(admin.id)" /> 
							<input type="button" value="删除" ng-click="deleteAdmin(admin.id)" />
						</td>
					</tr>
				</table>		
			</paging>
	
		</div>
	</div>
</div>

<!-- Angular JS -->
<script src="/r/js-src/web/academy-tfboys-service/admin/adminList.js"></script>
