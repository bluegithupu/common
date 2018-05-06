'use strict';
angular.module('academy_tfboys')
    .controller('userVideoCtrl', function($state,$scope, $rootScope,$cookies,commonUtil, userVideoService) {

        var vm = $scope.vm = {};
        
         vm.params = {    
                   	     id: $state.params.id
	                              ,  
                     	     userID: $state.params.userID
	                              ,  
                     	     videoID: $state.params.videoID
	                              ,  
                     	     collectionStatus: $state.params.collectionStatus
	                              ,  
                     	     likedStatus: $state.params.likedStatus
	                              ,  
                     	     createBy: $state.params.createBy
	                              ,  
                     	     updateBy: $state.params.updateBy
	                              ,  
                     	     createAt: $state.params.createAt
	                              ,  
                     	     updateAt: $state.params.updateAt
	                              ,  
                              };


    userVideoService.getList(vm.params).then(function(res) {
        if (res.data.code === 0) {
            vm.list = res.data.data;
            vm.page = {
                next: res.data.next || 0,
                size: res.data.size || 0,
                page: res.data.page || 0,
                total: res.data.total || 0
            };
        } else {
            $rootScope.alert(res.data.message);
        }
    });
  

    vm.search = function() {
        
        $state.go("field.userVideoList", vm.params,{reload:true});
    };
    });
