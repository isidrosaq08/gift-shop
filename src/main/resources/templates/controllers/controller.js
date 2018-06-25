var app = angular.module('shopping', ['ngRoute']);

app.config(function($routeProvider){
    $routeProvider.when('/', {
        templateUrl: 'login.html'
     })
    .when('index',{
        templateUrl: 'index.html'
    })
    .otherwise('index',{
        redirectTo: '/'
    });
});

app.controller('loginController', function($scope, $location){
    $scope.submit = function(){

        var username = $scope.username;
        var password = $scope.password;
        if(username == 'admin' && password == 'admin'){
            $location.path('/index');
        }else{
            alert("Is wrong");
        }
    }
});