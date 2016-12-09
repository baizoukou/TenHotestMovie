//package utils;
//
//import static org.junit.Assert.*;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Map;
//import java.util.Map.Entry;
//
//import javax.swing.text.html.parser.Parser;
//
//import org.junit.Test;
//
//import com.google.common.collect.ImmutableMap;
//
//import models.Movie;
//
//public class MovieRecommenderTest {
//
//	@Test
//	public void TenHotestMovie() throws IOException {
//		Map<Integer, String> expectedPopularMovie = ImmutableMap.<Integer, String>builder()
//				.put(1975, "One Flew Over the Cuckoo's Nest (1975)")
//				.put(1980, "Empire Strikes Back, The (1980)")
//				.put(1994, "Pulp Fiction (1994)")
//				.build();
//				
//		for(Entry<Integer, String> entry : expectedPopularMovie.entrySet()) {
//			String releaseDate = entry.getKey();
//			String expectedMovietitle = entry.getValue();
//			
//			Movie m = getMovieRecommender().getTenHotestMovieReleasedIn(releaseDate);
//			assertEquals(m.gettitle(), expectedMovietitle);
//		}
//	}
//	
//	@Test
//	public void testTenHotestMovie() throws IOException {
//		assertEquals(getMovieRecommender().getTenHotestMovieReleasedDate().gettitle(), "Star Wars (1977)");
//	}
//
//	private MovieRecommender getMovieRecommender() throws IOException {
//		InputStream movieStream = loadStream("movie.data");
//		InputStream ratingsStream = loadStream("ratings.data");
//		Map<Long, Movie> Movies =  new Parser().parseMovies(movieStream, ratingsStream);
//		MovieRecommender recommender = new MovieRecommender(Movies.values());
//		return recommender;
//	}
//	
//	private InputStream loadStream(String fileName) {
//		return this.getClass().getClassLoader().getResourceAsStream(fileName);
//	}
//
//}
