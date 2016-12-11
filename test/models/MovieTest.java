package models;

import static org.junit.Assert.*;
import static com.google.common.base.MoreObjects.toStringHelper;
import org.junit.Test;

@SuppressWarnings("unused")
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
    assertEquals ("Movie{" + test.id + ", walk, fridge, hjxzghjgd}", test.toString());
  }
}