package controllers;

import asg.cliche.Command;
import asg.cliche.Param;
import asg.cliche.Shell;
import asg.cliche.ShellFactory;

public class Client
{
 public TenHotestMovieAPI TenHotestMovie;
 @Command(description="Add a new User")
 public void addUser (@Param(name="first name") String firstName, @Param(name="last name") String lastName,
 @Param(name="age") String age, @Param(name="gender") String gender, @Param(name="occupation") String occupation)
 {
	 TenHotestMovie.addUser(firstName, lastName, age, gender, occupation);
 }

 @Command(description="Delete a User")
 public void removeUser (@Param(name="id") Long id)
 {
	 TenHotestMovie.removeUser(id);
 }
 @Command(description="Add a Movie")
 public void addMovie (@Param(name="title") String title, @Param(name="year") String year, @Param(name="url") String url)
 {
	 TenHotestMovie.addMovie(title, year, url);
 }
 public static void client(String[] args) throws Exception
 {
 Client client = new Client();
 Shell shell = ShellFactory.createConsoleShell("lm", "Welcome to TenHotestMovie - ?help for instructions", client);
 shell.commandLoop();
 client.TenHotestMovie.store();
 }
}