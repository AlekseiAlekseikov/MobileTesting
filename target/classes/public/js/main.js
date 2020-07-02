var app = angular.module("MobileTestingDB",[]);
app.controller("AppCtrl", function ($scope) {
    $scope.websites = [];

    $http.get('http://127.0.0.1:8099/Phones.html').success(function (data) {
        $scope.websites = data;
    })
})