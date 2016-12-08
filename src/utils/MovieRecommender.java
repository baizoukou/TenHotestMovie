package utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import com.google.common.base.Preconditions;

import models.Movie;

public class MovieRecommender {
private List<Movie> movies = new ArrayList<Movie>(CSVLoader.movies.values());;
	
	public MovieRecommender(Collection<Movie> Movies) {
		Preconditions.checkNotNull(Movies);
		Preconditions.checkArgument(Movies.size() > 0);
		
		this.movies = Collections.unmodifiableList(new ArrayList<Movie>(movies));
	}
	
	public Movie getTenHotestMovieReleasedIn(String releaseDate) {
		return this.Movies.stream()
				.filter(m -> m.getreleaseDate().getreleaseDate() == releaseDate)
				.max(MovieRecommender::getgetTenHotestMovieBySumRating)
				.get();
		public Movie getTenHotestMovie() {
		return this.Movies.stream()
			.max(MovieRecommender::getTenHotestMovieBySumRating)
			.get();
	}	
	private static int getTenHotestMovieBySumRating(Movie m1, Movie m2) {
		return (int)(m1.getTotalRating() - m2.getTotalRating());
	}
}


}
