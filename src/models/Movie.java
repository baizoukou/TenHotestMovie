package models;


/*
 * * @author alexandre Baizoukou WIT Bsc Applied Computing
 * @version 1.0
 * @author Eamon Delastar WIT Lecturer
 * @author Franck Walsh WIT Lecturer
 * @author Martin Harrigan Assistant Lecturer WIT 
 * @author Cormen, Leiserson, Rivest, Stein, Introduction to Algorithms, MIT Press
 * @author Fotakis. Course of Algorithms and Complexity at the National Technical University of Athens.
 * @author Tim Roughgarden Coursera 
 *  
 *  This class is content a hash map of movie data type
 *  define movie object
 *  generate getters & setters
 *  
 */

import java.io.FileNotFoundException;
import java.net.URI;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;

import com.google.common.base.Preconditions;

import utils.CSVLoader;

public class Movie implements Comparable<Movie> {
	
    private static long counter = 0;
	final long id;
	final String title;
	final String releaseDate;
	final String Url;
		
	private int sumRatings;
	private int sumReviewers;
	
	public Movie( String title, String releaseDate, String URL) {
		
		Preconditions.checkNotNull(title);
		Preconditions.checkNotNull(releaseDate);
		Preconditions.checkNotNull(URL);
		
		this.id = counter++;
		this.title = title;
		this.releaseDate = releaseDate;
		this.Url = URL;
		
	}
	


	public void addRating(Rating rating) {
		Preconditions.checkNotNull(rating);
		sumRatings += rating.getRating();
		sumReviewers++;
	}

	public double getAverageRating() {
		if (sumReviewers == 0) {
			return Double.NaN;
		}
		else {
			return (double)sumRatings / sumReviewers;
		}
	}
	
	public int getTotalRating() {
		return this.sumRatings;
	}
	
	public long getId() {
		return id;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public String getUrl() {
		return Url;
	}

	

	
	@Override
	public int compareTo(Movie m) {
		
		return Double.compare(getAverageRating(),m.getAverageRating());
	}
}


