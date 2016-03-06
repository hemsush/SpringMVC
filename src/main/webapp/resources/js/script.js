// Code goes here

var myApp = angular.module('myApp', ['angularUtils.directives.dirPagination']);


myApp.controller('MyController', function($scope, $http) {

	function pageChangeHandler(num){
		alert("Hi");
	}

  $scope.currentPage = 1;
  $scope.pageSize = 10;
  $scope.ibd = [];

  
 /* $scope.pageChangeHandler = function(num) {
      console.log('meals page changed to ' + num);
      $scope.ibd = [];
      $http.get("PPMDashboard/getIbd/"+"10"+"/"+num).success(function(response){ 
    	  alert("Hi");
    	  $scope.ibd =response.data;  //ajax request to fetch data into vm.data
			vm.total_count = response.total_count;
		});
  };*/
});


myApp.controller('OtherController', function($scope, $http) {
	
});

