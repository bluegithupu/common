<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>

<input type="hidden" value="userSign" id="current_nav">
<div id="userSignApp" ng-app="userSignApp">
	<div ng-controller="userSignController">

		<div class="portlet">
		    <div class="portlet-title">
		        <div class="caption"><i class="fa fa-cogs"></i>UserSign管理</div>
		    </div>
		    <span class="btn green fileinput-button">
		        <i class="fa fa-plus"></i>
		        <span ng-click="addUserSign(userSign)">新增</span>
		    </span>
	
			<paging url="/web/a/userSign">
				<table class="table table-striped table-bordered table-hover">
					<tr>
									                    <td>自增长ID</td>
			        				                    <td>用户id</td>
			        				                    <td>累计签到数</td>
			        				                    <td>最大连续签到</td>
			        				                    <td>连续签到</td>
			        				                    <td>签到记录</td>
			        				                    <td>逆袭豆</td>
			        				                    <td>创建人</td>
			        				                    <td>更新人</td>
			        				                    <td>创建时间</td>
			        				                    <td>更新时间</td>
			        							<th>操作</th>
					</tr>
					<tr ng-repeat="userSign in data">				
									                    <td ng-bind="userSign.id" ></td>
			        				                    <td ng-bind="userSign.userID" ></td>
			        				                    <td ng-bind="userSign.totalSign" ></td>
			        				                    <td ng-bind="userSign.maxSign" ></td>
			        				                    <td ng-bind="userSign.continuousNumber" ></td>
			        				                    <td ng-bind="userSign.recordSign" ></td>
			        				                    <td ng-bind="userSign.bean" ></td>
			        				                    <td ng-bind="userSign.createBy" ></td>
			        				                    <td ng-bind="userSign.updateBy" ></td>
			        				                    <td ng-bind="userSign.createAt" ></td>
			        				                    <td ng-bind="userSign.updateAt" ></td>
			        								
						<td>
							<input type="button" value="修改" ng-click="updateUserSign(userSign.id)" /> 
							<input type="button" value="删除" ng-click="deleteUserSign(userSign.id)" />
						</td>
					</tr>
				</table>		
			</paging>
	
		</div>
	</div>
</div>

<!-- Angular JS -->
<script src="/r/js-src/web/academy-tfboys-service/userSign/userSignList.js"></script>
