'use strict';
angular.module('academy_tfboys')
    .controller('temporaryDataCtrl', function($state,$scope, $rootScope,$cookies,commonUtil, temporaryDataService) {

        var vm = $scope.vm = {};
        
         vm.params = {    
                   	     id: $state.params.id
	                              ,  
                     	     openID: $state.params.openID
	                              ,  
                     	     accessToken: $state.params.accessToken
	                              ,  
                     	     emailCode: $state.params.emailCode
	                              ,  
                     	     phoneCode: $state.params.phoneCode
	                              ,  
                     	     emailCodeTimes: $state.params.emailCodeTimes
	                              ,  
                     	     phoneCodeTimes: $state.params.phoneCodeTimes
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


    temporaryDataService.getList(vm.params).then(function(res) {
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
        
        $state.go("field.temporaryDataList", vm.params,{reload:true});
    };
    });
