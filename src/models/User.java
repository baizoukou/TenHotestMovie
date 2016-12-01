package models;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Objects;

public class User {
	static Long counter = 0l;
	public Long id;
	public String firstname;
	public String lastname;
	public String gender;
	public int age;
	public String occupation;

	public List<Rating> ratings = new ArrayList<>();

	public User(String firstname, String lastname, String gender, int age, String occupation) {
		this.id = counter++;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.age = age;
		this.occupation = occupation;
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