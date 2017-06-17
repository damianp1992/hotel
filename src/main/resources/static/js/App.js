/**
 * Created by Damian Prukacz on 18.05.2017.
 */
'use strict';


var app = angular.module('myApp', ['ngRoute', 'ngResource'])
    .config(function ($routeProvider, $httpProvider) {
        $routeProvider
            .when('/register', {
                templateUrl: '/views/register.html',
                controller: ''
            })
            .when('/login', {
                templateUrl: '/views/login.html',
                controller: ''
            })
            .when('/selection', {
                templateUrl: '/views/selection.html',
                controller: ''
            })
            .when('/client', {
                templateUrl: '/views/client.html',
                controller: ''
            })
            .when('/receptionist', {
                templateUrl: '/views/receptionist.html',
                controller: ''
            })

            .otherwise({redirectTo: '/'});

        $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
    });