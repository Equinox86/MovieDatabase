import java.util.ArrayList; 

public class Actor {
	String name; 
	ArrayList<Movie> movies;

		public Actor(String actorName) { 
			movies = new ArrayList<>();
			setActor(actorName);
		}
		public void setActor (String actor) { 
			name = actor;
		}
		public String getActor (){
			return name;
		}
		public void addMovie(Movie movie) { 
			movies.add(movie);
		}
		public ArrayList<Movie> getMovie() { 
			return movies;
		}

}
