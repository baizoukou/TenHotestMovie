package controllers;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import models.Movie;
import models.User;
import utils.CSVLoader;

/*
 * * @author alexandre Baizoukou WIT Bsc Applied Computing
 * @version 1.0
 * @author Franck Walsh WIT Lecturer
 * @author Eamon Delastar WIT Lecturer
 * @author Martin Harrigan Assistant Lecturer WIT 
 * @author Cormen, Leiserson, Rivest, Stein, Introduction to Algorithms, MIT Press
 * @author Fotakis. Course of Algorithms and Complexity at the National Technical University of Athens.
 * @author Tim Roughgarden Coursera 
 *  
 *  
 *  This class implement the data structured as members of the API class
 *  it defines suitable method signature for each of the features listed here
 *  it does not include the  UX
 *  
 *  
 */

@SuppressWarnings("unused")
public class TenHotestMovieAPI {
	public Map<Long, User> userIndex = new HashMap<>();
	public Map<Long, Movie> movieIndex = new HashMap<>();

	public TenHotestMovieAPI() {
	}

	public static HashMap<Long, User> users;

	{
		try {
			User.users = CSVLoader.importUser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public User addUser(String firstname, String lastname,int age, String gender,  String occupation) {
		User user = new User(firstname,lastname,  age, gender, occupation);
		userIndex.put(user.id, user);
		return user;
	}

	public User removeUser(Long id) {
		userIndex.remove(id);
		return null;
	}

	public static HashMap<Long, Movie> movies;

	
	public Movie addMovie(String title, String releaseDate, String url) {
		Movie movie = new Movie(title, releaseDate, url);
		movieIndex.put(movie.getId(), movie);
		return movie;
	}

	public void store() {
		// TODO Auto-generated method stub
		
	}
	
	}