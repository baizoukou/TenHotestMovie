package models;

import static com.google.common.base.MoreObjects.toStringHelper;

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

import com.google.common.base.Preconditions;

import utils.CSVLoader;

@SuppressWarnings("unused")
public class Rating

{
	private User user;
	private Movie movie;
	int rating;
    double average;

	public Movie getMovie() {
		return movie;
	}

	public Rating(long userId, long movieId, int rating) {
		Preconditions.checkArgument(userId < 1000);
		Preconditions.checkArgument(movieId < 1800);
		Preconditions.checkArgument(rating <= 5);
		this.user = user;
		this.movie = movie;
		this.rating = rating;
	}

	 @Override
	 public String toString()
	 {
		 return toStringHelper(this).addValue(user)
				        .addValue(movie)
				        .addValue(rating)
				        .toString();
	 }
	public Rating(ArrayList<Rating> rating2) {
		// TODO Auto-generated constructor stub
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

	public double getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}

	public static List<Rating> r = new ArrayList<>();


	
}