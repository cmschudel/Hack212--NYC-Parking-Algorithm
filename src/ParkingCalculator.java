import java.util.ArrayList;
import java.util.Date;

public class ParkingCalculator {

        ArrayList<User> existingUsers;
        ArrayList<ParkingLocation> locations;
        
	public ParkingCalculator(){
		
	}
	
	private void determineBestSpots(ArrayList<User> newUsers){
            //new users
            for (User u : newUsers){
                // get k closest spots
                ArrayList<ParkingLocation> locations = recommendSpots(u);
		for (ParkingLocation location : locations) {
                    
                }
                // get best three
                // update u
                //push spots to the user 
            }
            
            //existing users
            for (User existing : existingUsers) {
                // update p
                // update u
                // push updates to the user
            }
		
	}
	
        // get
	private ArrayList<ParkingLocation> recommendSpots(User user){
		
		ArrayList<ParkingLocation> topThreeSpots = new ArrayList<ParkingLocation>();
		ArrayList<ParkingLocation> kSpots = getKNearestNeighbors(user);
		
		//for (ParkingLocation p : kSpots){
		//	choose top three spots using our algorithm
		//}
		
		return topThreeSpots; 
	}
        
        private double getProbability(User u, ParkingLocation p) {
            double wDistance = 1;
            double wSpots = 1;
            double wLikelyhood = 1;
            
            double distance = Distance(u.getLongitude(), u.getLatitude(), p.getLongitude(), p.getLatitude());
            double spots = p.getSpots();
            double likelyhood = p.getLikelyhood();
            double noise = Noise(new Date(), u.getLongitude(), u.getLatitude());
            
            double prob = wDistance * distance + wSpots * spots + wLikelyhood * likelyhood + noise;
            return prob;
            
        }
        
        
        private double Noise(Date date, double longitude, double latitude) {
            return 1.0;
        }
 
       
	
	private ArrayList<ParkingLocation> getKNearestNeighbors(User user){
		
		ArrayList<ParkingLocation> nearbySpots = new ArrayList<ParkingLocation>();
		
		//calculate nearest neighbors
		//this data could come from another team's API, e.g.
		
		return nearbySpots;
	}
}
