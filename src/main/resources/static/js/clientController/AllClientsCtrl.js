app.controller('AllClientsCtrl', ['$scope', '$http', function ($scope, $http) {

    $scope.clients = [];

    $http({
            method: 'GET',
            url: ' http://localhost:8090/client/all',
            headers: {'Content-type': 'application/json'}
        }).then(function successCallback(response) {
            $scope.clients = response.data;

        }, function errorCallback(response) {

        });
}]);