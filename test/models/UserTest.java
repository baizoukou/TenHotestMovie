package models;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

public class UserTest
{
  User homer = new User (01,"homer", "simpson", 25,  "male",  "doctor");

  @Test
  public void testCreate()
  {
	assertEquals (01,               homer.id);
	assertEquals ("homer",               homer.firstname);
    assertEquals ("simpson",             homer.lastname);
    assertEquals (25,                    homer.age     );   
    assertEquals ("male",                homer.gender); 
    assertEquals ("homer",               homer.occupation);
  }

  @Test
  public void testIds()
  {
    Set<Long> ids = new HashSet<>();
    for (User user : users)
    {
      ids.add(user.id);
    }
    assertEquals (users.length, ids.size());
  }

  @Test
  public void testToString()
  {
    assertEquals ("User{" + homer.id + ", homer, simpson, 35, male, student}", homer.toString());
  }
  
  @Test
  public void testEquals()
  {
    User homer2 = new User (02,"homer", "simpson", 35,  "male", "student"); 
    User bart   = new User (03,"bart", "simpson", 30,  "male", "lecturer"); 

    assertEquals(homer, homer);
    assertEquals(homer, homer2);
    assertNotEquals(homer, bart);
  } 
  
}