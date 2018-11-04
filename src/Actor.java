import java.util.ArrayList; 

public class Actor {
	String name; 
	ArrayList<Movie> movies;

		public Actor() { 
			movies = new ArrayList<>();
		}
		//Actor Setter and Getter
		public void setName (String actor) { 
			name = actor;
		}
		public String getName (){
			return name;
		}
		//Movie Setter and Getter
		public void setMovies(Movie movie) { 
			movies.add(movie);
		}
		public ArrayList<Movie> getMovies() { 
			return movies;
		}

}
