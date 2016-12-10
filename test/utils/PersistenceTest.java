//package utils;
//
//import java.io.File;
//
//import javax.xml.stream.Location;
//
//import org.junit.Test;
//
//import controllers.TenHotestMovieAPI;
//import models.Movie;
//import models.Rating;
//import models.User;
//
//public class PersistenceTest
//{
//	TenHotestMovieAPI tenHotestMovie;
//  
//  void populate (TenHotestMovieAPI tenHotestMovie)
//  {
//    for (User user : user)
//    {
//      tenHotestMovie.createUser(user.firstname, user.lastname, user.age, user.gender, user.occupation);
//    }
//    User user1 = tenHotestMovie.getUserById(user[0].id);
//    Movie movie = tenHotestMovie.createMovie(user1.id, movie[0].title, movie[0].rating, movie[0].sumRating);
//    tenHotestMovie.createMovie(user1.id, movie[1].title, movie[1].rating, movie[1].sumRating);
//    User user2 = tenHotestMovie.getUserById(user[1].id);
//    tenHotestMovie.createMovie(user2.id, movie[2].title, movie[2].rating, movie[2].sumRating);
//    tenHotestMovie.createMovie(user2.id, movies[3].type, movies[3].rating, movies[3].sumRating);
//    
//    for (Rating rating : rating)
//    {
//      tenHotestMovie.addRating(movie.id, rating.sumRating, rating.average);
//    }
//  }
//  
//  @Test
//  public void testPopulate()
//  { 
//    tenHotestMovie = new TenHotestMovieAPI(null);
//    assertEquals(0, tenHotestMovie.getUsers().size());
//    populate (tenHotestMovie);
//    
//    assertEquals(user.length, tenHotestMovie.getUsers().size());
//    assertEquals(2, tenHotestMovie.getUserById(user[0].id).movies.size());
//    assertEquals(2, tenHotestMovie.getUserById(user[1].id).movies.size());   
//    Long movieID = tenHotestMovie.getUserById(user[0].id).movies.keySet().iterator().next();
//    assertEquals(ratings.length, tenHotestMovie.getMovie(movieID).rating.size());   
//  }
//
//  void deleteFile(String fileName)
//  {
//    File datastore = new File ("testdatastore.xml");
//    if (datastore.exists())
//    {
//      datastore.delete();
//    }
//  }
//  
//  @Test
//  public void testXMLSerializer() throws Exception
//  { 
//    String datastoreFile = "testdatastore.xml";
//    deleteFile (datastoreFile);
//    
//    Serializer serializer = new XMLSerializer(new File (datastoreFile));
//    
//    tenHotestMovie = new TenHotestMovieAPI(serializer); 
//    populate(tenHotestMovie);
//    tenHotestMovie.store();
//    
//    TenHotestMovieAPI tenHotestMovie2 =  new TenHotestMovieAPI(serializer);
//    tenHotestMovie2.load();
//    
//    assertEquals (tenHotestMovie.getUsers().size(), tenHotestMovie2.getUsers().size());
//    for (User user : tenHotestMovie.getUsers())
//    {
//      assertTrue (tenHotestMovie2.getUsers().contains(user));
//    }
//    deleteFile ("testdatastore.xml");
//  }
//  
//  
//}