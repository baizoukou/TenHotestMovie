package utils;

import models.Movie;
import models.Rating;
import models.User;

public class Fixture {



  public static User[] users =
  {
    new User ("marge", "simpson", 12,  "m" , "P"),
    new User ("lisa",  "simpson", 5,   "f", "i"),
    new User ("bart",  "simpson", 9,   "m", "o"),
    new User ("maggie","simpson", 47, "f", "r")
  };

  public static Movie[] movies =
  {
    new Movie ("walk",  "fridge", "hjxzghjgd"),
    new Movie ("walk",  "bar",    "hjxzghjgd"),
    new Movie ("run",   "work",   "hjxzghjgd"),
    new Movie ("walk",  "shop",   "hjxzghjgd"),
    new Movie ("cycle", "school", "hjxzghjgd")
  };

//  public static Rating[]ratings =
//  {
//    new Rating(0, 01,1, 0.001),
//    new Rating(0.001, 2),  
//    new Rating(0.001, 0.003),
//    new Rating(0.001, 0.08)       
//  };
}