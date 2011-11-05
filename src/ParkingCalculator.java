import java.util.ArrayList;

public class ParkingCalculator {

	public ParkingCalculator(){
		
	}
	
	private void determineBestSpots(ArrayList<User> newUsers){
		for (User u : newUsers){
			recommendSpots(u);
			//push spots to the user 
		}
		
	}
	
	private ArrayList<ParkingLocation> recommendSpots(User user){
		
		ArrayList<ParkingLocation> topThreeSpots = new ArrayList<ParkingLocation>();
		ArrayList<ParkingLocation> kSpots = getKNearestNeighbors(user);
		
		//for (ParkingLocation p : kSpots){
		//	choose top three spots using our algorithm
		//}
		
		return topThreeSpots; 
	}
	
	private ArrayList<ParkingLocation> getKNearestNeighbors(User user){
		
		ArrayList<ParkingLocation> nearbySpots = new ArrayList<ParkingLocation>();
		
		//calculate nearest neighbors
		//this data could come from another team's API, e.g.
		
		return nearbySpots;
	}
}
