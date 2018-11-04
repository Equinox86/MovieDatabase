import java.util.ArrayList; 

public class Movie {
	String name; 
	double rating; 
	ArrayList<Actor> actors;

		public Movie() { 
			actors = new ArrayList<>();
		}
		//Movie Setter and Getter
		public void setName (String newMovie) { 
			name = newMovie;
		}
		public String getName(){
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
		public void setRating(double setRating) { 
			rating = setRating;
		}
		public double getRating() { 
			return rating;
		}

}
