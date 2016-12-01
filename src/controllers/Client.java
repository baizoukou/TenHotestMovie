package controllers;

import asg.cliche.Command;
import asg.cliche.Param;
import asg.cliche.Shell;
import asg.cliche.ShellFactory;

public class Client
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
 Client client = new Client();
 Shell shell = ShellFactory.createConsoleShell("lm", "Welcome to TenHotestMovie - ?help for instructions", client);
 shell.commandLoop();
 client.TenHotestMovie.store();
 }
}