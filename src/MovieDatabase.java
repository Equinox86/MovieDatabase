import java.util.ArrayList; 

public class MovieDatabase{
	ArrayList<Movie> movieList;
	ArrayList<Actor> actorList;
	
	public MovieDatabase() { 
		Actor actorList = new Actor(); 
		Movie movieList = new Movie();
	}
	public ArrayList<Movie> getMovieList(){ 
		return movieList; 
	}
	public ArrayList<Actor> getActorList(){
		return actorList; 
	}
	public void main(String args[]) { 
		
	}
}
