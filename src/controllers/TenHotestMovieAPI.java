package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Movie;
import models.User;

public class TenHotestMovieAPI
{
 public Map<Long, User> userIndex = new HashMap<>();
 public Map<Long, Movie> movieIndex = new HashMap<>();

 public TenHotestMovieAPI()
 {}

 public User addUser(String firstname, String lastname,  String gender, int age, String occupation)
 {
 User user = new User (firstname,lastname, gender, age, occupation);
 userIndex.put(user.id, user);
 return user;
 }
 
 public User removeUser(Long id)
 {
  userIndex.put(User.id, user);
 return null;
 }
 
 
 public Movie addMovie(String title, int date, String url)
 {
 Movie movie = new Movie (title, date, url);
 movieIndex.put(movie.id, movie);
 return movie;
 }
}