/**
 * Created by Damian Prukacz on 18.05.2017.
 */
'use strict';


var app = angular.module('myApp', ['ngRoute', 'ngResource'])
    .config(function ($routeProvider, $httpProvider) {
        $routeProvider
            .when('/register', {
                templateUrl: '/views/register.html',
                controller: 'RegisterCtrl'
            })
            .when('/all_clients', {
                templateUrl: '/views/all_clients.html',
                controller: 'AllClientsCtrl'
            })
            .when('/find', {
                templateUrl: '/views/find-client-by-name.html',
                controller: 'ClientCtrl'
            })
            .when('/login', {
                templateUrl: '/views/login.html',
                controller: ''
            })
            .when('/selection', {
                templateUrl: '/views/selection.html',
                controller: ''
            })
            .when('/clientController', {
                templateUrl: '/views/clientController.html',
                controller: ''
            })
            .when('/receptionist', {
                templateUrl: '/views/receptionist.html',
                controller: ''
            })

            .otherwise({redirectTo: '/'});

        $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
    });