import java.util.*; 
import java.io.*;

public class MovieDatabase{
	ArrayList<Movie> movieList;
	ArrayList<Actor> actorList;
	
	public MovieDatabase() { 
		actorList = new ArrayList<Actor>(); 
		movieList = new ArrayList<Movie>();
	}
	public ArrayList<Movie> getMovieList(){ 
		return movieList; 
	}
	public ArrayList<Actor> getActorList(){
		return actorList; 
	}
	public String getBestActor() { 
		String bestActor="";
		double topAvg = 0;
		double actorAvg;
			for(Actor a : actorList) { 
				actorAvg=0;
				for(Movie m : a.getMovies()) { 
					actorAvg += m.rating;
				}
				actorAvg = actorAvg/a.movies.size();
				if(actorAvg > topAvg) { 
					bestActor = a.name;
				}
			}
		return bestActor;
	}
	public String getBestMovie() {
		String bestMovie = "";
		double topRating=0;
		for(Movie m : movieList) { 
			if(m.rating >topRating) {
				bestMovie = m.name;
				topRating = m.rating;	
			}
		}
		return bestMovie; 
	}
	void addMovie(String name, String[]Actors) {
		//Temporary Actor and Movie Objects for Buffering
		Actor tmpActor = new Actor();
		Movie tmpMovie = new Movie();
		//Check if the movie is already in the database
		boolean movieCheck = true;
		for (Movie m : movieList) { 
			if(name.equals(m.name)) {
				//System.out.println(name + " Already exists!");
				movieCheck=false;
				tmpMovie = m;
			}
		}
		//Add Movie to MovieDatabase if it is not found
		if(movieCheck == true) { 
			//System.out.println(name + " Does Not Exist");
			tmpMovie.setName(name);
			movieList.add(tmpMovie);
		}
		
		//loop through Actors Arrays
		boolean actorCheck = true;
		for(int x=0; x<Actors.length; x++) { 
			//Check if the actor is already in the database
			//System.out.println("Try " + Actors[x]);
			
			for (Actor a : actorList) {
				//System.out.print(Actors[x]+"="+a.name+ ": ");
				//System.out.println(Actors[x].equals(a.name));
				if(Actors[x].equals(a.name)) {
					//System.out.println("Actor already exists");
					actorCheck = false;
					tmpActor = a;
				}
			}
			//Add Actor to Database
			if(actorCheck == true) {
				tmpActor.setName(Actors[x]);
				actorList.add(tmpActor);
			} 
			tmpMovie.setActors(tmpActor);
			tmpActor.setMovies(tmpMovie);
		} 
		
	}
	void addRating(String name, double rating) { 
		for(Movie m: movieList) { 
			if(m.name.equals(name)) { 
				m.rating = m.rating+rating;
			}
		}
	}
	void updateRating(String name, double newRating) { 
		for(Movie m: movieList) { 
			if(m.name.equals(name)) { 
				m.rating=newRating;
			}
		}
	}
	public static void main(String args[]) { 
		//Create new Movie Database and file reading objects
		MovieDatabase md = new MovieDatabase();
		String[] rdLine ; 
		String[] tmpActor = new String[1];
		//Read from Files	 
		File movieFile = new File("movies.txt");
		try {
			Scanner sc = new Scanner(movieFile);
			while(sc.hasNextLine()) { 
				rdLine = sc.nextLine().split(", ");
				tmpActor[0]=rdLine[0];
				for(int x=1; x<rdLine.length; x++) {
					md.addMovie(rdLine[x],tmpActor);
					}
				}
			sc.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Now add the Ratings
		File rateFile = new File("ratings.txt");
		try {
			Scanner rateScan = new Scanner(rateFile);
			while(rateScan.hasNextLine()) {
				rdLine = rateScan.nextLine().split("\t");
				if(rdLine[0].equals("movie_name")) {
					continue;
				} else { 
					md.addRating(rdLine[0],Double.parseDouble(rdLine[1]));
				}
			}
			rateScan.close();
		} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		//Function : Best Actor
		System.out.println("The Best Actor is: " + md.getBestActor());
		System.out.println("And the Best Movie is: " + md.getBestMovie());
	}
}
