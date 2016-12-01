package models;

import java.util.Objects;

@SuppressWarnings("unused")
public class Movie {
	static Long counter = 0l;

	public Long id;

	public String title;
	public int date;
	public String url;

	public Movie(String title, int date, String url) {
		this.id = counter++;
		this.title = title;
		this.date = date;
		this.url = url;
	}

	
//	@Override
//	public int hashCode() {
//		return Objects.hashCode(this.id, this.title, this.year, this.url);
//	}
//
//	@Override
//	public boolean equals(final Object obj) {
//		if (obj instanceof Movie) {
//			final Movie other = (Movie) obj;
//			return Objects.equal(title, other.title) && Objects.equal(year, other.year)
//					&& Objects.equal(url, other.url);
//		} else {
//			return false;
//		}
	
}