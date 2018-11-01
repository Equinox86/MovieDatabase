import java.util.ArrayList; 

public class Movie {
	String name; 
	double rating; 
	ArrayList<Actor> actors;

		public Movie() { 
			actors = new ArrayList<>();
		}
		//Movie Setter and Getter
		public void setMovie (String newMovie) { 
			name = newMovie;
		}
		public String getMovie(){
			return name;
		} 
		//Actor Setter and Getter
		public void setActors(Actor newActor) {
			actors.add(newActor);
		}
		public ArrayList<Actor> getActors() { 
			return actors;
		}
		//Rating Setter and Getter
		public void setRating(double newRating) { 
			rating = newRating;
		}
		public double getRating() { 
			return rating;
		}

}
