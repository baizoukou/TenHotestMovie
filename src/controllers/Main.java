package controllers;

import asg.cliche.Command;
import asg.cliche.Param;
import asg.cliche.Shell;
import asg.cliche.ShellFactory;


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
 
*/

public class Main
{
 public TenHotestMovieAPI TenHotestMovie;
 
 @Command(description="Add a new User")
 public void addUser (@Param(name="firstname") String firstname, @Param(name="lastname") String lastname,
		 			  @Param(name="age") int age, @Param(name="gender") String gender, @Param(name="occupation") String occupation)
 {
	 TenHotestMovie.addUser(firstname, lastname, gender, age,  occupation);
 }

 
 @Command(description="Delete a User")
 public void removeUser (@Param(name="id") Long id)
 {
	 TenHotestMovie.removeUser(id);
 }
 
 
 @Command(description="Add a Movie")
 public void addMovie (@Param(name="title") String title, @Param(name="date") int date, @Param(name="url") String url)
 {
	 TenHotestMovie.addMovie(title, date, url);
 }
 
 public static void client(String[] args) throws Exception
 {
 Main main = new Main();
 Shell shell = ShellFactory.createConsoleShell("lm", "Welcome to TenHotestMovie - ?help for instructions", main);
 shell.commandLoop();
 main.TenHotestMovie.store();
 }
 
}