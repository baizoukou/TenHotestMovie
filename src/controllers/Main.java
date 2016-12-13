package controllers;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Sets;

import asg.cliche.Command;
import asg.cliche.Param;
import asg.cliche.Shell;
import asg.cliche.ShellFactory;
import models.Movie;
import models.User;
import utils.CSVLoader;
import utils.Serializer;
import utils.XMLSerializer;

/*
 * @author alexandre Baizoukou WIT Bsc Applied Computing
 * @version 1.0
 * @author Franck Walsh WIT Lecturer
 * @author Eamon Delastar WIT Lecturer
 * @author Martin Harrigan Assistant Lecturer WIT 
 * @author Cormen, Leiserson, Rivest, Stein, Introduction to Algorithms, MIT Press
 * @author Fotakis. Course of Algorithms and Complexity at the National Technical University of Athens.
 * @author Tim Roughgarden Coursera 
 *  
 *  This class is the user menu  
 *  add user
 *  delete user
 *  add movie 
 *  get movie detail
 *  rate movie
 *  get a user rating
 *  get recommendation for any given user
 *  give the list of top Ten Hottest Movies
 *  read the movie data base from external file
 *  save file in an XML file 
 *  

 */

@SuppressWarnings("unused")
public class Main {

	public TenHotestMovieAPI tenAPI;

	public Main() throws Exception
	{
		File  datastore = new File("datastore.xml");// is calling file from data store if file not exist call from prime
		Serializer serializer = new XMLSerializer(datastore);

		tenAPI = new TenHotestMovieAPI(serializer);

		if (datastore.isFile())
		{
			tenAPI.load();
		} else {
			tenAPI.prime();
		}

	}

	public static void main(String[] args) throws Exception {
		Main main = new Main();


		Shell shell = ShellFactory.createConsoleShell("lm",
				"Welcome to the TenHotestMovies platform, when you are ready Let get started - ?help for instructions",
				main);
		shell.commandLoop();
	}



	@Command(description = "Add a new User")
	public void addUser(@Param(name = "firstname") String firstname, @Param(name = "lastname") String lastname,
			@Param(name = "age") int age, @Param(name = "gender") String gender,
			@Param(name = "occupation") String occupation) {
		tenAPI.addUser(firstname, lastname, age, gender, occupation);
	}

	@Command(description = "Delete a User")
	public void removeUser(@Param(name = "id") Long id) {
		tenAPI.removeUser(id);
	}

	@Command(description = "Add a Movie")
	public void addMovie(@Param(name = "title") String title, @Param(name = "releaseDate") String releaseDate,
			@Param(name = "url") String url) {
		tenAPI.addMovie(title, releaseDate, url);

	}

	@Command(description = "Add a Rating")
	public void addRating(@Param(name = "user") Long user, @Param(name = "movie") Long movie,
			@Param(name = "rating") int rating, @Param(name = "average") double average) {
		tenAPI.addRating(user, movie, rating);
	}

	@Command(description="Get a user rating")
	public void getRating (@Param(name="by id") long id)
	{
		tenAPI.getRating(id);
	}

	@Command(description="Get  user recomendation")// from the movie list iterate through and get top ten movies
	public void getTop10 ()
	{
		List<Movie> movies = tenAPI.getTenHotestMovie();
		for (Movie m : movies) {
			System.out.println(m);
		}
	}



}