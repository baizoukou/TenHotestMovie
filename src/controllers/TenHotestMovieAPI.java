package controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import models.Movie;
import models.Rating;
import models.User;
import utils.CSVLoader;
import utils.Serializer;
import utils.XMLSerializer;

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
	private Serializer serializer;
	public Map<Long, User> userIndex = new HashMap<>();
	public Map<Long, Movie> movieIndex = new HashMap<>();
	public ArrayList<Rating> ratings = new ArrayList <>();



	public TenHotestMovieAPI() {
	}
	  
	  public TenHotestMovieAPI(Serializer serializer)
	  {
	    this.serializer = serializer;
	  }

	public void prime() throws Exception
	{
		CSVLoader loader = new CSVLoader();
		userIndex = loader.importUser();
		movieIndex = loader.importMovie();
		ratings = loader.importRating();
		store();

	}


//	{
//		try {
//			User.users = CSVLoader.importUser();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

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

	public List<Movie> getTenHotestMovie() {
		int n = 10;
		System.out.println(movies.size());
		List<Movie> movies2 = new ArrayList<Movie>(movies.values());
		Collections.sort(movies2);
//		n = (n > movies2.size()) ? movies2.size() : n;
		return movies2.subList(0, n);
	}

	//	public static void TenHotestMovie(ArrayList<Movie> movies, int n) {
	//		for (Movie movie : getTenHotestMovie()) {
	//			System.out.println(movie);
	//		}
	//	}
	//	public static ArrayList<Rating> rating = new ArrayList<Rating>(); {
	//		Rating rating = new Rating(CSVLoader.rating);
	//		CSVLoader.rating.add(rating);
	//		return rating;
	//	}

	public Rating addRating(Long userid, Long movieid, int therating) {
		Rating rating = new Rating(userid, movieid, therating);
		ratings.add(rating);
		return rating;

	}


	public void store() throws Exception {
		// TODO Auto-generated method stub
		serializer.push(movieIndex);
		serializer.push(userIndex);
		serializer.push(ratings);
	
			serializer.write();
	

	}
	@SuppressWarnings("unchecked")
	public void load() throws Exception{
	    serializer.read();
		ratings = (ArrayList<Rating>) serializer.pop();
		userIndex = (Map<Long, User>) serializer.pop();
		movieIndex = (Map<Long, Movie>) serializer.pop();

	}


	public void getRating(long id) {
		// TODO Auto-generated method stub

	}



}