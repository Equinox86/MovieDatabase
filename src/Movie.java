import java.util.ArrayList; 

public class Movie {
	String name; 
	double rating; 
	ArrayList<Actor> actors;

		public Movie() { 
			actors = new ArrayList<>();
		}
		//Movie Setter and Getter
		public void setMovie (String Movie) { 
			name = Movie;
		}
		public String getMovie(){
			return name;
		}
		//Actor Setter and Getters
		public void addMovie(Actor actor) { 
			actors.add(actor);
		}
		public ArrayList<Actor> getActors() { 
			return actors;
		}
		//Rating Setter and Getters
		public double setRating(double rating) { 
			return rating;
		}

}
