package models;



import java.io.FileNotFoundException;

/*
 * @author alexandre Baizoukou WIT Bsc Applied Computing
 * @version 1.0
 * @author Eamon Delastar WIT Lecturer
 * @author Franck Walsh WIT Lecturer
 * @author Martin Harrigan Assistant Lecturer WIT 
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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import utils.CSVLoader;



@SuppressWarnings("unused")
public class Rating

	{
		private User user;
		private Movie movie;
		int rating;
		private int average;
		
		public Movie getMovie() {
			return movie;
		}
		public Rating(User user, Movie movie, int rating, int average) {
			super();
			this.user = user;
			this.movie = movie;
			this.rating = rating;
			this.setAverage(average);
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
		
		 public int getAverage() {
			return average;
		}
		public void setAverage(int average) {
			this.average = average;
		}

		public static List<Rating> r = new ArrayList<>();	
		 
			{
				try {
					Rating.r = CSVLoader.importRating("data/rating.dat", User.users,Movie.movies);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
//			public static HashMap<Long, Movie> movies;
//			//public Iterable<String> TenHottestMovies(String title, int k)
//			{
//				
//				List <Rating> filtered = new ArrayList<Rating>(); 
//				//for (Rating r = average(average + r)*average +(rating/(average+r))*r  )
//				for (Rating r   )	
//				{
//					if (((Rating) r).getTitle().startsWith(title) ){
//						filtered.add( r);
//					}
//		 		}
//				
//		            Collections.sort(filtered);
//		            List<String> result = new ArrayList <String>();
//		            String ratingOf_and_title = "";
//		            String this_title = "";
//					for (Rating r: filtered){
//						
//						this_title = r.getTitle();
//						
//						ratingOf_and_title = this.ratingOf(this_title) + "_"+this_title; 
//						result.add(ratingOf_and_title);
//											}
//					if (result.size() > k  && k>=0 ){
//						
//						return result.subList(0, k);
//					}else{
//						return result;
//					}
//					
//	
//	}
}