package utils;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import models.Movie;
import models.Rating;
import models.User;

@SuppressWarnings("unused")
public class CSVLoader {
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
	 * 
	 * This class implement a simple loading of text 
	 * file that will be later on serialize
	 * importMovie is a Hashmap same as importUser
	 * meaning while importRating is an array of ratings
	 * this will help mapping class Movie to class User 
	 * importMovie token is based on long, String,int and String
	 * importUser token is based on long, String,String, int, String, String
	 * importRating is based on long, int, int
	 * 
	 * @param importMovie<Hashmap>
	 * @param importUser<Hashmap>
	 * @param importRating<Arrays>
	 * 
	 */

	public static final String r = null;

	public ArrayList<Rating> rating = new ArrayList<Rating>();
	public  HashMap<Long, Movie> movies = new HashMap<Long, Movie>();
	public  HashMap<Long, User> users = new HashMap<Long, User>();

	@SuppressWarnings("resource")
	public   HashMap<Long, Movie> importMovie() throws Exception 	
	{
		//	String url = "./data/movie.dat";


		BufferedReader in = null;
		File moviesFile = new File("data/movie.dat");
		Scanner inMovies = new Scanner(moviesFile);
		String delims = "[|]";// each field in the file is separated(delimited)
		// by a space. 
		while (inMovies.hasNextLine()) {
			// get movies from data source
			String moviesDetails = inMovies.nextLine().trim();
			// parse user details string
			String[] moviesTokens = moviesDetails.split(delims);

			// output user data to console.
			if (moviesTokens.length >= 4) {

				long id = Long.parseLong(moviesTokens[0]);
				Movie m = new Movie( moviesTokens[1], moviesTokens[2], moviesTokens[3]);
				movies.put(new Long(id), m);


			}
			else{
				throw new Exception("Are you sure doing the right thing?:"+ moviesTokens.length);
			}
		}
		inMovies.close();

		return movies;
	}


	@SuppressWarnings("resource")
	public HashMap<Long, User> importUser() throws Exception 
	{
		String url = "./data/user.dat";

		BufferedReader in = null;
		File usersFile = new File("./data/user.dat");
		Scanner inUsers = new Scanner(usersFile);
		String delims = "[|]";// each field in the file is separated(delimited)
		// by a space
		while (inUsers.hasNextLine()) {
			// get user from data source
			String usersDetails =inUsers.nextLine().trim();

			// parse user details string
			String[] usersTokens = usersDetails.split(delims);

			// output user data to console.
			if (usersTokens.length >= 6) {

				long id = Long.parseLong(usersTokens[0]);
				User u = new User(usersTokens[1], usersTokens[2], Integer.parseInt(usersTokens[3]), usersTokens[4], usersTokens[5]);
				users.put(new Long(id), u);
			}
			else{
				throw new Exception("Are you sure doing the right thing?:"+ usersTokens.length);
			}
		}
		inUsers.close();

		return users;
	}


	private String url = "./data/rating.dat";

	public ArrayList<Rating> getRating() {
		return rating;
	}

	public ArrayList<Rating> importRating() throws Exception {
		BufferedReader in = null;
		File ratingsFile = new File("././data/rating.dat");
		Scanner inRatings = new Scanner(ratingsFile);
		String delims = "[|]";
		//			inRatings.nextLine();
		while (inRatings.hasNextLine()) {
			// get rating from data source
			String ratingDetails = inRatings.nextLine().trim();
			// parse user details string
			String[] ratingTokens = ratingDetails.split(delims);

			// output user data to console.
			if (ratingTokens.length == 4) {

				long id = Long.parseLong(ratingTokens[0]);
				User user = users.get(id);
				long movie = Long.parseLong(ratingTokens[1]);
				Movie m = movies.get(movie);
				Rating r = new Rating(id,movie,Integer.parseInt(ratingTokens[2]));
				rating.add(r);
			}
			else{
				throw new Exception("Are you sure doing the right thing?:"+ ratingTokens.length);
			}
		}

		inRatings.close();

		return rating;

	}
}






