package com.social.trakt.services;

import java.util.List;

import com.social.trakt.model.Episode;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface EpisodeAPIService {

	/* Returns a single episode's details. */
	@GET("/shows/{id}/seasons/{season}/episodes/{episode}")
	public Call<Episode> getSummaryEpisode(@Query("id") String id, @Query("season") int season,
			@Query("episode") int episode, @Query("extended") String extended);
	
	/* Returns all episodes for a specific season of a show. */
	@GET("/shows/{id}/seasons/{season}")
	public Call<List<Episode>> getEpisodeForSeason(@Query("id") String id, @Query("season") int season,
			@Query("extended") String extended);
}
