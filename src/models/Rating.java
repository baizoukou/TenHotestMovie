package models;

/*
 * @author alexandre Baizoukou WIT Bsc Applied Computing
 * @version 1.0
 * @author Franck Walsh WIT Lecturer
 * @author Martin Harrigan WIT Math Center
 * @author Cormen, Leiserson, Rivest, Stein, Introduction to Algorithms, MIT Press
 * @author Fotakis. Course of Algorithms and Complexity at the National Technical University of Athens.
 * @author Tim Roughgarden Coursera 
 *  
 *  This class construct a movie rating and recommend a movie to a user based similarity a user 
 *  has with other users   then check movies that other users have seen that current user has not yet seen  
 *  and recommend based on these criteria.
 *  
 *  Then calculate and display the top 10 movies base on average viewers
 * @param id the id of the user
 * @param id the id of the movie
 * @param current rating
 * @param average the average rating of a movie 
*/

import java.util.ArrayList;
import java.util.List;

public class Rating

	{
		private User user;
		private Movie movie;
		int rating;
		int average;
		
		public Movie getMovie() {
			return movie;
		}
		public Rating(User user, Movie movie, int rating) {
			super();
			this.user = user;
			this.movie = movie;
			this.rating = rating;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public int getRating() {
			return rating;
		}
		public void setRating(int rating) {
			this.rating = rating;
		}
		public void setMovie(Movie movie) {
			this.movie = movie;
		}
		
		 public List<Rating> r = new ArrayList<>();	
	
	}
