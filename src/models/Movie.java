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
 */

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Objects;

import utils.CSVLoader;

@SuppressWarnings("unused")
public class Movie {
	static Long counter = 0l;

	public Long id;

	public String title;
	public int date;
	public String url;

	public Movie(String title, int date, String url) {
		this.id = counter++;
		this.title = title;
		this.date = date;
		this.url = url;
	}
// load movie in hash map
	public static HashMap<Long, Movie> movies;
	{
		try {
			Movie.movies = CSVLoader.importMovie();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	@Override
//	public int hashCode() {
//	return Objects.hashCode(this.id, this.title, this.date, this.url);
//	}
//
//	@Override
//	public boolean equals(final Object obj) {
//		if (obj instanceof Movie) {
//			final Movie other = (Movie) obj;
//			return Objects.equals(title, other.title) && Objects.equals(date, other.date)
//					&& Objects.equals(url, other.url);
//		} else {
//			return false;
//		}
//	
}