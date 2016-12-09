//package utils;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.List;
//import com.google.common.base.Preconditions;
//import models.Movie;
//
///*
// * * @author alexandre Baizoukou WIT Bsc Applied Computing
// * @version 1.0
// * @author Eamon Delastar WIT Lecturer
// * @author Franck Walsh WIT Lecturer
// * @author Martin Harrigan Assistant Lecturer WIT 
// * @author Cormen, Leiserson, Rivest, Stein, Introduction to Algorithms, MIT Press
// * @author Fotakis. Course of Algorithms and Complexity at the National Technical University of Athens.
// * @author Tim Roughgarden Coursera 
// *  
// *  This class recommend a TenHotestMovies based on Sum Rating 
// *  it returns an  integer sum of movie 1 - movie 2
// *  filter movie through releaseDate
// *  
// */
//
//public class MovieRecommender {
//	private List<Movie> movies = new ArrayList<Movie>(CSVLoader.movies.values());;
//
//	public MovieRecommender(Collection<Movie> Movies) {
//		Preconditions.checkNotNull(Movies);
//		Preconditions.checkArgument(Movies.size() > 0);
//
//		this.movies = Collections.unmodifiableList(new ArrayList<Movie>(movies));
//	}
//
//	public Movie getTenHotestMovieReleasedIn(String releaseDate) {
//		return this.Movies.stream()
//				.filter(m -> m.getreleaseDate().getreleaseDate() == releaseDate)
//				.max(MovieRecommender::getgetTenHotestMovieBySumRating)
//				.get();
//		public Movie getTenHotestMovie() {
//		return this.Movies.stream()
//			.max(MovieRecommender::getTenHotestMovieBySumRating)
//			.get();
//	}	
//	private static int getTenHotestMovieBySumRating (ArrayList<Movie> movies m1, Movie m2) {
//		return (int)(m1.getTotalRating() - m2.getTotalRating());
//	}
//}
//
//}
