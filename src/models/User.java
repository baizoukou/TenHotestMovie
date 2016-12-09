package models;

/*
 * * @author alexandre Baizoukou WIT Bsc Applied Computing
 * @version 1.0
 * @author Eamon Delastar WIT Lecturer
 * @author Franck Walsh WIT Lecturer
 * @author Martin Harrigan Assistant Lecturer WIT 
 * @author Cormen, Leiserson, Rivest, Stein, Introduction to Algorithms, MIT Press
 * @author Fotakis. Course of Algorithms and Complexity at the National Technical University of Athens.
 * @author Tim Roughgarden Coursera 
 *  
 *  This class describes hash map of users
 *  defines user object
 *  generates getters & setters of the class
 */

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.google.common.base.Objects;

import utils.CSVLoader;

@SuppressWarnings("unused")
public class User {
	static Long counter = 0l;
	public Long id;
	public String firstname;
	public String lastname;
	public int age;
	public String gender;
	public String occupation;

	public List<Rating> ratings = new ArrayList<>();

	public User(String firstname, String lastname,int age, String gender,  String occupation) {
		this.id = counter++;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.gender = gender;
		this.occupation = occupation;
	}

	public static HashMap<Long, User> users;
	{
		try {
			User.users = CSVLoader.importUser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	@Override
	public int hashCode() {
		return Objects.hashCode(this.lastname, this.firstname, this.gender, this.age);
	}

	@Override
 public boolean equals(final Object obj)
 {
 if (obj instanceof User)
 {
 final User other = (User) obj;
 return Objects.equal(firstname, other.firstname)
 && Objects.equal(lastname, other.lastname)
 && Objects.equal(gender, other.gender)
 && Objects.equal(age, other.age)
 && Objects.equal(occupation, other.occupation)
 && Objects.equal(ratings, other.ratings);
 }
 else
 {
 return false;}
 }
}