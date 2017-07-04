app.controller('ClientCtrl', ['$scope', '$http', function ($scope, $http) {

    $scope.findClientByName = function (name) {

        console.log('findClientByName');
        var name = $scope.client.name;

        $scope.clients = [];

        $http({
            method: "GET",
            url: 'http://localhost:8090/client/name/' + name,
            data: {
                "name": name
            },
            headers: {'Content-type': 'application/json'}
        }).then(function successCallback(response) {
            $scope.clients = response.data;
        }, function errorCallback(response) {
        });
    };

    $scope.findClientBySurname = function (surname) {

        console.log('findClientBySurname');
        var surname = $scope.client.surname;

        $scope.clients = [];

        $http({
            method: "GET",
            url: 'http://localhost:8090/client/surname/' + surname,
            data: {
                "surname": surname
            },
            headers: {'Content-type': 'application/json'}
        }).then(function successCallback(response) {
            $scope.clients = response.data;
        }, function errorCallback(response) {
        });
    };

    $scope.deleteClient = function (client) {

        console.log(client.clientId);
        var clientId = client.clientId;
        // $scope.clients = [];

        $http({
            method: "DELETE",
            url: 'http://localhost:8090/client/delete',
            data: {
                "id": clientId
            },
            headers: {'Content-type': 'application/json'}
        }).then(function successCallback(response) {
            $scope.clients = response.data;
        }, function errorCallback(response) {
        });
    };

    // $scope.editClient = function (client) {
    //
    //     console.log('editClient');
    //     var name = $scope.client.name;
    //     var surname = $scope.client.surname;
    //     // $scope.clients = [];
    //
    //     $http({
    //         method: "GET",
    //         url: 'http://localhost:8090/client/edit',
    //         data: {
    //             "name": name,
    //             "surname": surname
    //         },
    //         headers: {'Content-type': 'application/json'}
    //     }).then(function successCallback(response) {
    //         $scope.clients = response.data;
    //     }, function errorCallback(response) {
    //     });
    // };
}]);