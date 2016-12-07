//package utils;
//import controllers.TenHotestMovieAPI;
//import static org.junit.Assert.*;
//
//import java.io.File;
//
//import models.Movie;
//import models.Rating;
//import models.User;
//
//import org.junit.Test;
//
//import utils.Serializer;
//import utils.XMLSerializer;
////import static models.Fixtures.users;
////import static models.Fixtures.activities;
////import static models.Fixtures.locations;
//
//public class XMLSerializerTest
//{
//	TenHotestMovieAPI tenhotestmovie;
//  
//  void populate (TenHotestMovieAPI tenhotestmovie)
//  {
//    for (User user : user)
//    {
//      tenhotestmovie.createUser(user.firstname, user.lastname, user.age, user.gender, user.occupation);
//    }
//    User user1 = tenhotestmovie.getUserById(user[0].id);
//    Movie movie = tenhotestmovie.createMovie(user1.id, movies[0].title, movies[0].date, movies[0].url);
//    tenhotestmovie.createMovie(user1.id, movies[1].title, movies[1].date, movies[1].url);
//    User user2 = tenhotestmovie.getUserById(user[1].id);
//    tenhotestmovie.createMovi(user2.id, movies[2].title, movies[2].date, movies[2].url);
//    tenhotestmovie.createMovie(user2.id, movies[3].title, movies[3].date, movies[3].url);
//    
//    for (Rating rating : ratings)
//    {
//      tenhotestmovie.addRating(movie.id, rating.rating, rating.average);
//    }
//  }
//  
//  @Test
//  public void testPopulate()
//  { 
//    pacemaker = new TenHotestMovieAPI(null);
//    assertEquals(0, tenhotestmovie.getUsers().size());
//    populate (tenhotestmovie);
//    
//    assertEquals(user.length, tenhotestmovie.getUsers().size());
//    assertEquals(2, tenhotestmovie.getUserById(user[0].id).movies.size());
//    assertEquals(2, tenhotestmovie.getUserById(user[1].id).movies.size());   
//    Long activityID = tenhotestmovie.getUserById(user[0].id).movies.keySet().iterator().next();
//    assertEquals(Rating.length, tenhotestmovie.getMovie(movieID).rating.size());   
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
//    pacemaker = new TenHotestMovieAPI(serializer); 
//    populate(tenhotestmovie);
//    tenhotestmovie.store();
//    
//    TenHotestMovieAPI tenhotestmovie2 =  new TenHotestMovieAPI(serializer);
//    tenhotestmovie2.load();
//    
//    assertEquals (tenhotestmovie.getUsers().size(), tenhotestmovie2.getUsers().size());
//    for (User user : tenhotestmovie.getUsers())
//    {
//      assertTrue (tenhotestmovie2.getUsers().contains(user));
//    }
//    deleteFile ("testdatastore.xml");
//  }
//  
//  
//}