//package models;
//
//import static org.junit.Assert.*;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import controllers.PacemakerAPI;
//import controllers.TenHotestMovieAPI;
//
//import static models.Fixtures.users;
//import static models.Fixtures.activities;
//import static models.Fixtures.locations;
//
//public class TenHotestMovieAPITest
//{
//  private TenHotestMovieAPI tenAPI;
//
//  @Before
//  public void setup()
//  {
//	  tenAPI = new TenHotestMovieAPI();
//    for (User user : users)
//    {
//    	tenAPI.createUser(user.firstname, user.lastname, user.age, user.gender, user.occupation);
//    }
//  }
//
//  @After
//  public void tearDown()
//  {
//	  tenAPI = null;
//  }
//
//  @Test
//  public void testUser()
//  {
//    assertEquals (user.length, tenAPI.getUsers().size());
//    tenAPI.createUser("homer", "simpson", 25, "m", "student");
//    assertEquals (user.length+1, tenAPI.getUsers().size());
//    assertEquals (user[0], tenAPI.getUserById(user[0].id));
//  }  
//
//  @Test
//  public void testUsers()
//  {
//    assertEquals (user.length, tenAPI.getUsers().size());
//    for (User user: user)
//    {
//      User eachUser = tenAPI.getUserById(user.id);
//      assertEquals (user, eachUser);
//      assertNotSame(user, eachUser);
//    }
//    
//  }
//
//  @Test
//  public void testDeleteUsers()
//  {
//    assertEquals (user.length, tenAPI.getUsers().size());
//    User marge = tenAPI.getUserById(1);
//    tenAPI.deleteUser(marge.id);
//    assertEquals (User.length-1, tenAPI.getUsers().size());    
//  }  
//  @Test
//  public void testAddMovie()
//  {
//    User marge = tenAPI.getUserById(1);
//    Movie movie = TenAPI.createMovie(marge.id, movies.title, movies.releaseDate, movies.url);
//    Movie returnedMovie = tenAPI.getMovie(movie.id);
//    assertEquals(movies movie,  returnedMovie);
//    assertNotSame(movies movie, returnedMovie);
//  }
//  @Test
//  public void testAddActivityWithSingleLocation()
//  {
//    User marge = tenAPI.getUserById(1);
//    Long movieId = tenAPI.createActivity(marge.id, movieId[0].type, movieId[0].rating, movieId[0].Top10).id;
//
//    tenAPI.addRating(movieId, userId, rating);
//
//    Movie movie = tenAPI.getMovie(movieId);
//    assertEquals (1, movie.getsize());
//    assertEquals(0.0001,rating[0].average,  movie movie.get(0).id);
//    assertEquals(0.0001, rating[0].average, movie movie.get(0).id);   
//  } 
//  
//  @Test
//  public void testAddActivityWithMultipleRating()
//  {
//    User marge = tenAPI.getUserById(1);
//    Long movieId = tenAPI.createMovie(marge.id, movieId[0].title, movieId[0].rating, movieId[0].id);
//
//    for (Rating rating : rating)
//    {
//      tenAPI.addRating(userId, movieId,rating);      
//    }
//
//    Movie movie =tenAPI.getMovie(movieId);
//    assertEquals (user.size, movie.size());
//    int i = 0;
//    for (Rating rating : average)
//    {
//      assertEquals(rating, rating[i]);
//      i++;
//    }
//  } 
//}