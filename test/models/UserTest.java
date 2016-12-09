package models;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

public class UserTest
{
  private static Object length;
User homer = new User ("homer", "simpson",25,   "male",   "doctor");

  @Test
  public void testCreate()
  {
	//assertEquals (01,                    homer.id);
	assertEquals ("homer",               homer.firstname);
    assertEquals ("simpson",             homer.lastname);
    assertEquals (25,                    homer.age     ); 
    assertEquals ("male",                homer.gender);
    assertEquals ("doctor",              homer.occupation);
  }

//  @Test
//  public void testIds()
//  {
//    Set<Long> id = new HashSet<>();
//    for (User user : user)
//    {
//      id.add(user.id);
//    }
//    assertEquals (UserTest.length, id.size());
//  }

  @Test
  public void testToString()
  {
    assertEquals ("User{" + homer.id + ", homer, simpson,  male, 35, student}", homer.toString());
  }
  
  @Test
  public void testEquals()
  {
    User homer2 = new User ("homer", "simpson",  35, "male",  "student"); 
    User bart   = new User ("bart", "simpson", 30,  "male",  "lecturer"); 

    assertEquals(homer, homer);
    assertEquals(homer, homer2);
    assertNotEquals(homer, bart);
  } 
  
}