<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>

<input type="hidden" value="moduleRole" id="current_nav">
<div id="moduleRoleApp" ng-app="moduleRoleApp">
	<div ng-controller="moduleRoleController">

		<div class="portlet">
		    <div class="portlet-title">
		        <div class="caption"><i class="fa fa-cogs"></i>ModuleRole管理</div>
		    </div>
		    <span class="btn green fileinput-button">
		        <i class="fa fa-plus"></i>
		        <span ng-click="addModuleRole(moduleRole)">新增</span>
		    </span>
	
			<paging url="/web/a/moduleRole">
				<table class="table table-striped table-bordered table-hover">
					<tr>
									                    <td>自增长ID</td>
			        				                    <td>角色id</td>
			        				                    <td>模块id</td>
			        				                    <td>创建人</td>
			        				                    <td>更新人</td>
			        				                    <td>创建时间</td>
			        				                    <td>更新时间</td>
			        							<th>操作</th>
					</tr>
					<tr ng-repeat="moduleRole in data">				
									                    <td ng-bind="moduleRole.id" ></td>
			        				                    <td ng-bind="moduleRole.roleID" ></td>
			        				                    <td ng-bind="moduleRole.moduleID" ></td>
			        				                    <td ng-bind="moduleRole.createBy" ></td>
			        				                    <td ng-bind="moduleRole.updateBy" ></td>
			        				                    <td ng-bind="moduleRole.createAt" ></td>
			        				                    <td ng-bind="moduleRole.updateAt" ></td>
			        								
						<td>
							<input type="button" value="修改" ng-click="updateModuleRole(moduleRole.id)" /> 
							<input type="button" value="删除" ng-click="deleteModuleRole(moduleRole.id)" />
						</td>
					</tr>
				</table>		
			</paging>
	
		</div>
	</div>
</div>

<!-- Angular JS -->
<script src="/r/js-src/web/academy-tfboys-service/moduleRole/moduleRoleList.js"></script>
