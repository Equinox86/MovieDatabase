import java.util.ArrayList; 

public class MovieDatabase{
	ArrayList<Movie> movieList;
	ArrayList<Actor> actorList;
	
	public MovieDatabase() { 
		actorList = new ArrayList<>(); 
		movieList = new ArrayList<>();
	}
	public ArrayList<Movie> getMovieList(){ 
		return movieList; 
	}
	public ArrayList<Actor> getActorList(){
		return actorList; 
	}
	void addMovie(String name, String[]Actors) {
		//Check if the movie is already in the database
		for (Movie m : movieList) { 
			if(name == m.name) {
				return; 
			}
		}
		//Create a new movie object, set parameters and add to movie list
		Movie newMovie = new Movie();
		newMovie.setActors(Actors);
		newMovie .setMovie(name);
		
		//check the actors vs the actor list
		for(Actor a : actorList) { 
			for(int x=0; x<Actors.length; x++) {
			
			}
		}
		

	}
	public void main(String args[]) { 
		
	}
}
