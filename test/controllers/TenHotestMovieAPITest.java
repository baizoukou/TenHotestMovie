package controllers;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import controllers.TenHotestMovieAPI;
import models.Movie;
import models.Rating;
import models.User;

//import static models.Fixtures.users;
//import static models.Fixtures.activities;
//import static models.Fixtures.locations;

public class TenHotestMovieAPITest
{
  @SuppressWarnings("unused")
private TenHotestMovieAPI tenhotestmovie;

//  @Before
//  public void setup()
//  {
//	  tenhotestmovie = new TenHotestMovieAPI();
//    for (User user : user)
//    {
//      tenhotestmovie.createUser(user.firstname, user.lastname, user.age, user.gender, user.occupation);
//    }
//  }
//
//  @After
//  public void tearDown()
//  {
//    tenhotestmovie = null;
//  }
//
//  @Test
//  public void testUser()
//  {
//    assertEquals (User.length, tenhotestmovie.getUsers().size());
//    tenhotestmovie.createUser("homer", "simpson",25, "male", "doctore");
//    assertEquals (user.length+1, tenhotestmovie.getUsers().size());
//    assertEquals (user[0], tenhotestmovie.getUserById(user[0].id));
//  }  
//
//  @Test
//  public void testUsers()
//  {
//    assertEquals (user.length, tenhotestmovie.getUsers().size());
//    for (User user: user)
//    {
//      User eachUser = tenhotestmovie.getUserById(user.id);
//      assertEquals (user, eachUser);
//      assertNotSame(user, eachUser);
//    }
//  }
//
//  @Test
//  public void testDeleteUsers()
//  {
//    assertEquals (user.id, tenhotestmovie.getUsers().size());
//    User marge = tenhotestmovie.getUserById(01);
//    tenhotestmovie.deleteUser(marge.id);
//    assertEquals (User.length-1, tenhotestmovie.getUsers().size());    
//  }  
//  
//  @Test
//  public void testAddMovie()
//  {
//    User marge =  tenhotestmovie.getUserById(01);
//    Movie movie =  tenhotestmovie.createMovie(marge.id, movies[0].title, movies[0].date, movies[0].url);
//    Movie returnedMovie =  tenhotestmovie.getMovie(movie.id);
//    assertEquals(movies[0],  returnedMovie);
//    assertNotSame(movies[0], returnedMovie);
//  }
//  
//  @Test
//  public void testAddActivityWithSingleLocation()
//  {
//    User marge =  tenhotestmovie.getUserById(01);
//    Long movieId =  tenhotestmovie.createMovie(marge.id, movies[0].title, movies[0].date, movies[0].url).id;
//
//    tenhotestmovie.addtitle(movieId, locations[0].latitude, locations[0].longitude);
//
//    Movie movie =  tenhotestmovie.getMovie(movieId);
//    assertEquals (1, movie.rating.size());
//    assertEquals(0.0001, rating[0].average,  movie.rating.get(0).rating);
//    assertEquals(0.0001, rating[0].average, average.rating.get(0).rating);   
//  }
//  
//  @Test
//  public void testAddActivityWithMultipleRating()
//  {
//    User marge =  tenhotestmovie.getUserById(01);
//    Long movieId =  tenhotestmovie.createMovie(marge.id, movies[0].title,movies[0].date, movies[0].url).id;
//
//    for (Rating Rating : ratngs)
//    {
//    	 tenhotestmovie.addRating(movieId,userId, rating.rating, rating.average);      
//    }
//
//    Movie movie =  tenhotestmovie.getMovie(movieId);
//    assertEquals (Rating.getAverage(), movie.rating.size());
//    int i = 0;
//    for (Rating  rating : rating.average)
//    {
//      assertEquals(rating, rating[i]);
//      i++;
//    }
//  } 
}


