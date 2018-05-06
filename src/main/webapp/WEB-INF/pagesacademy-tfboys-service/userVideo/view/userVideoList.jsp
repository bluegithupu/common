<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>

<input type="hidden" value="userVideo" id="current_nav">
<div id="userVideoApp" ng-app="userVideoApp">
	<div ng-controller="userVideoController">

		<div class="portlet">
		    <div class="portlet-title">
		        <div class="caption"><i class="fa fa-cogs"></i>UserVideo管理</div>
		    </div>
		    <span class="btn green fileinput-button">
		        <i class="fa fa-plus"></i>
		        <span ng-click="addUserVideo(userVideo)">新增</span>
		    </span>
	
			<paging url="/web/a/userVideo">
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
					<tr ng-repeat="userVideo in data">				
									                    <td ng-bind="userVideo.id" ></td>
			        				                    <td ng-bind="userVideo.userID" ></td>
			        				                    <td ng-bind="userVideo.videoID" ></td>
			        				                    <td ng-bind="userVideo.collectionStatus" ></td>
			        				                    <td ng-bind="userVideo.likedStatus" ></td>
			        				                    <td ng-bind="userVideo.createBy" ></td>
			        				                    <td ng-bind="userVideo.updateBy" ></td>
			        				                    <td ng-bind="userVideo.createAt" ></td>
			        				                    <td ng-bind="userVideo.updateAt" ></td>
			        								
						<td>
							<input type="button" value="修改" ng-click="updateUserVideo(userVideo.id)" /> 
							<input type="button" value="删除" ng-click="deleteUserVideo(userVideo.id)" />
						</td>
					</tr>
				</table>		
			</paging>
	
		</div>
	</div>
</div>

<!-- Angular JS -->
<script src="/r/js-src/web/academy-tfboys-service/userVideo/userVideoList.js"></script>
