import java.util.*; 
import java.io.*;

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
				//Exit the Void Function
				return; 
			}
		}
		//Create a new movie object, set parameters and add to movie list
		Movie newMovie = new Movie();
		newMovie.setActors(Actors);
		newMovie .setMovie(name);
		
		//check the actors vs the actor list
		boolean noActor = true; 
		for(int x=0; x<Actors.length; x++) {
			noActor=  true; 
			for(Actor a : actorList) { 
				if(a.name== Actors[x]) { 
					noActor=false; 
					}
				}
				//Add new actor since it was not in the actor list
				if(noActor == true) { 
					Actor newActor = new Actor(); 
					newActor.setActor(Actors[x]);
					newActor.setMovie(newMovie);
				}

		}
	}
	public static void main(String args[]) { 
		//Create new Movie Database and file reading objects
		MovieDatabase md = new MovieDatabase();
		File movies =new File("movies.txt");
		ArrayList<String> lineList = new ArrayList<>();
		
		try { 
			String[] lineElement; 
			Scanner sc = new Scanner(movies);
			while(sc.hasNextLine()) { 
				String s = sc.nextLine();
				//Delimit the String
				lineElement = s.split(",");
				//Actor is in 1, the movie is the rest of the line. Store movie in a 1D Array and Actors in an indexed array list by movie
				for(int x = 0; x<lineElement.length; x++) { 
					
				}
				
			}
			sc.close();
		} 
		catch (FileNotFoundException e) { 
			System.out.print("Uh Oh!");
			e.printStackTrace();
		}
		
		//user scanner to get the movie name and the actors as part of a comma delimited string
	}
}
