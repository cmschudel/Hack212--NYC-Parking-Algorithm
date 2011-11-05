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
		
		//ArrayList<ParkingLocation> kSpots = getKNearestNeighbors(user);
		//for (ParkingLocation p : kSpots){
		//	choose top three spots
		//}
		
		return topThreeSpots; 
	}
}
