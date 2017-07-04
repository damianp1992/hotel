app.controller('RegisterCtrl', ['$scope', '$http', function ($scope, $http) {


    $scope.test = function () {

        var name = $scope.client.name;
        var surname = $scope.client.surname;
        var city = $scope.client.city;
        var age = $scope.client.age;
        var gender = $scope.client.gender;
        var nationality = $scope.client.nationality;
        var identityCard = $scope.client.identityCard;
        var phone = $scope.client.phone;
        var email = $scope.client.email;
        var login = $scope.client.login;
        var password = $scope.client.password;

        $http({
            method: 'POST',
            url: ' http://localhost:8090/client/save',
            data: {
                "name": name,
                "surname": surname,
                "city": city,
                "age": age,
                "gender":gender,
                "nationality": nationality,
                "identityCard": identityCard,
                "phone": phone,
                "email": email,
                "login": login,
                "password": password
            },
            headers: {'Content-type': 'application/json'}
        }).then(function successCallback(response) {

        }, function errorCallback(response) {

        });
    };

}]);