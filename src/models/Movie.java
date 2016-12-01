package models;

import java.util.Objects;

public class Movie {
	static Long counter = 0l;

	public Long id;

	public String title;
	public String year;
	public String url;

	public Movie(String title, String year, String url) {
		this.id = counter++;
		this.title = title;
		this.year = year;
		this.url = url;
	}

	
	@Override
	public int hashCode() {
		return Objects.hashCode(this.id, this.title, this.year, this.url);
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj instanceof Movie) {
			final Movie other = (Movie) obj;
			return Objects.equal(title, other.title) && Objects.equal(year, other.year)
					&& Objects.equal(url, other.url);
		} else {
			return false;
		}
	}
}