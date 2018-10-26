import java.util.ArrayList; 

public class Actor {
	String name; 
	ArrayList<Movie> movies;

		public Actor() { 
			movies = new ArrayList<>();
		}
		public void setActor (String actor) { 
			name = actor;
		}
		public String getActor (){
			return name;
		}
		public void setMovie(Movie movie) { 
			movies.add(movie);
		}
		public ArrayList<Movie> getMovie() { 
			return movies;
		}

}
