(function () {
	'use strict';
	
	angular
			.module('social.services.tmdb')
			.factory('TmdbMovieService', TmdbMovieService);
	
	TmdbMovieService.$inject = ['TmdbBase', '$resource'];
	
	/*@ngInject*/
	function TmdbMovieService(TmdbBase, $resource) {
		var service =  $resource( TmdbBase.movie, {}, {
			'getRandomPopularMovie' : {
				method: 'GET',
				cache : true,
				url: TmdbBase.movie + '/popular/random',
				params : {
					size : '@size',
					language : '@language',
	        		page: '@page'
				}
			}
		} );
		
		return service;
	}
	
})();