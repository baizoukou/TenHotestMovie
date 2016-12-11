package models;

import static org.junit.Assert.*;

import org.junit.Test;
//import static utils.Fixture;

public class RatingTest
{ 
  @Test
  public void testCreate()
  {
    assertEquals (1, 2, 23562);
    assertEquals (2, 33,52364 );
  }

  @Test
  public void testIds()
  {
    assertNotEquals(User.class, Movie.class);
  }

//  @Test
//  public void testToString()
//  {
//    assertEquals ("Rating{" + Test.id + ", 2, 23562}", test.toString());
//  }
//}
}