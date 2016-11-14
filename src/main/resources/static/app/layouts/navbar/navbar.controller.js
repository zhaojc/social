(function() {
    'use strict';

    angular
        .module('social.layouts.navbar')
        .controller('NavbarController', NavbarController);

    NavbarController.$inject = ['$state', 'PrincipalService', 'AuthService', 
                                '$localStorage', '$scope', 'TraktSearchService'];

    function NavbarController ($state, PrincipalService, AuthService, 
    		$localStorage, $scope, TraktSearchService) {
        var vm = this;
        vm.collapseNavbar = _collapseNavbar;
        vm.isAuthenticated = PrincipalService.isAuthenticated;
        vm.getUserInfo = _getUserInfo;
        vm.isNavbarCollapsed = true;
        vm.isOpen = false;
        vm.login = _login;
        vm.logout = _logout;
        vm.rememberMe = true;
        vm.state = $state;
        vm.search = _search;
        vm.toggleNavbar = _toggleNavbar;
        
        function _collapseNavbar() {
            vm.isNavbarCollapsed = false;
        }
        
        function _collapseDropDown() {
        	 vm.isOpen = false;
        }
        
        function _getUserInfo() {
        	return PrincipalService.getUserInformation();
        }
        
        function _toggleNavbar() {
            vm.isNavbarCollapsed = !vm.isNavbarCollapsed;
        }
        
        function _login (event) {
            event.preventDefault();
            
            if (vm.formLogin.$invalid) {
            	_toggleNavbar();
            	_collapseDropDown();
            	_resetForm();
            	$state.go('login', {authenticationError: true});
            } else {
                AuthService.login({
                    username: vm.username,
                    password: vm.password,
                    rememberMe: vm.rememberMe
                }).then(function () {
                	_collapseDropDown();
                    $state.go('home');
                }).catch(function () {
                	_toggleNavbar();
                	_collapseDropDown();
                	_resetForm();
                	$state.go('login', {authenticationError: true});
                });
            }
            
        }
        
        function _logout() {
            AuthService.logout();
            delete vm.account;
            $state.go('login');
        }
        
        function _resetForm() {
        	vm.formLogin.$setPristine();
        	 vm.username = null;
        	 vm.password = null;
        }
        
        function _search(text, type) {
        	return TraktSearchService.getSearch({
	        		limit : 10,
	        		query : text,
	        		type : type,
	        		fields : 'translations,title'
	        	});
	        }

    }
})();
