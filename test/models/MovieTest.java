package models;

import static org.junit.Assert.*;
import org.junit.Test;

public class MovieTest
{ 
  Movie test = new Movie ("walk",  "fridge", "hjxzghjgd");

  @Test
  public void testCreate()
  {
    assertEquals ("walk",          test.title);
    assertEquals ("fridge",        test.releaseDate);
    assertEquals ("hjxzghjgd",     test.getUrl());    
  }

  @Test
  public void testToString()
  {
    assertEquals ("Movie{" + test.id + ", walk, fridge, hjxzghjgd, []}", test.toString());
  }
}