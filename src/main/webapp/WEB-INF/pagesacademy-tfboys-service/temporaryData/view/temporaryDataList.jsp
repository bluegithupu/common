<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>

<input type="hidden" value="temporaryData" id="current_nav">
<div id="temporaryDataApp" ng-app="temporaryDataApp">
	<div ng-controller="temporaryDataController">

		<div class="portlet">
		    <div class="portlet-title">
		        <div class="caption"><i class="fa fa-cogs"></i>TemporaryData管理</div>
		    </div>
		    <span class="btn green fileinput-button">
		        <i class="fa fa-plus"></i>
		        <span ng-click="addTemporaryData(temporaryData)">新增</span>
		    </span>
	
			<paging url="/web/a/temporaryData">
				<table class="table table-striped table-bordered table-hover">
					<tr>
									                    <td>自增长ID</td>
			        				                    <td>openID</td>
			        				                    <td>授权token</td>
			        				                    <td>邮件激活码</td>
			        				                    <td>手机激活码</td>
			        				                    <td>邮件当天激活次数</td>
			        				                    <td>手机当天激活次数</td>
			        				                    <td>创建人</td>
			        				                    <td>更新人</td>
			        				                    <td>创建时间</td>
			        				                    <td>更新时间</td>
			        							<th>操作</th>
					</tr>
					<tr ng-repeat="temporaryData in data">				
									                    <td ng-bind="temporaryData.id" ></td>
			        				                    <td ng-bind="temporaryData.openID" ></td>
			        				                    <td ng-bind="temporaryData.accessToken" ></td>
			        				                    <td ng-bind="temporaryData.emailCode" ></td>
			        				                    <td ng-bind="temporaryData.phoneCode" ></td>
			        				                    <td ng-bind="temporaryData.emailCodeTimes" ></td>
			        				                    <td ng-bind="temporaryData.phoneCodeTimes" ></td>
			        				                    <td ng-bind="temporaryData.createBy" ></td>
			        				                    <td ng-bind="temporaryData.updateBy" ></td>
			        				                    <td ng-bind="temporaryData.createAt" ></td>
			        				                    <td ng-bind="temporaryData.updateAt" ></td>
			        								
						<td>
							<input type="button" value="修改" ng-click="updateTemporaryData(temporaryData.id)" /> 
							<input type="button" value="删除" ng-click="deleteTemporaryData(temporaryData.id)" />
						</td>
					</tr>
				</table>		
			</paging>
	
		</div>
	</div>
</div>

<!-- Angular JS -->
<script src="/r/js-src/web/academy-tfboys-service/temporaryData/temporaryDataList.js"></script>
