'use strict';
angular.module('academy_tfboys')
    .controller('userSignCtrl', function($state,$scope, $rootScope,$cookies,commonUtil, userSignService) {

        var vm = $scope.vm = {};
        
         vm.params = {    
                   	     id: $state.params.id
	                              ,  
                     	     userID: $state.params.userID
	                              ,  
                     	     totalSign: $state.params.totalSign
	                              ,  
                     	     maxSign: $state.params.maxSign
	                              ,  
                     	     continuousNumber: $state.params.continuousNumber
	                              ,  
                     	     recordSign: $state.params.recordSign
	                              ,  
                     	     bean: $state.params.bean
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


    userSignService.getList(vm.params).then(function(res) {
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
        
        $state.go("field.userSignList", vm.params,{reload:true});
    };
    });
