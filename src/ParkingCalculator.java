import java.util.ArrayList;
import java.util.Date;

public class ParkingCalculator {

        ArrayList<User> existingUsers;
        ArrayList<ParkingLocation> locations;
        
	public ParkingCalculator(){
		
	}
	
        public void addUser(User u) {
            
        }
        
        public void removeUser(User u) {
            
        }
        
        public void setParkingLocations(ArrayList<ParkingLocation> inLocations) {
            locations = inLocations;
        }
        
        
        
	private void determineBestSpots(ArrayList<User> newUsers){
            //new users
            for (User u : newUsers){
                // get k closest spots
                ArrayList<ParkingLocation> locations = recommendSpots(u);
		
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
		ArrayList<ParkingLocation> kSpots = getKNearestNeighbors(user, 10);
		
		for (int i = 0; i < 3; i++){
			ParkingLocation choice = null;
			for (ParkingLocation p : kSpots){
				if (getProbability(user, p) > getProbability(user, choice)){
					choice = p;
				}
			}
			topThreeSpots.add(choice);
		}
		
		return topThreeSpots; 
	}
        
        private double getProbability(User u, ParkingLocation p) {
            
        	if (p == null)
        		return 0;
        	
        	double wDistance = 1;
            double wSpots = 1;
            double wLikelyhood = 1;
            

            double distance = calculateDistance(u.getLongitude(), u.getLatitude(), p.getLongitude(), p.getLatitude());
            double spots = p.getSpotsAvailable();
            double likelyhood = p.getLikelihood();

            double noise = Noise(new Date(), u.getLongitude(), u.getLatitude());
            
            double prob = wDistance * distance + wSpots * spots + wLikelyhood * likelyhood + noise;
            return prob;
            
        }
        
        
        private double Noise(Date date, double longitude, double latitude) {
            return 1.0;
        }

	
	private ArrayList<ParkingLocation> getKNearestNeighbors(User user, int k){
		
		ArrayList<ParkingLocation> nearbySpots = new ArrayList<ParkingLocation>();
		
                
		//calculate nearest neighbors
		//this data could come from another team's API, e.g.
		
		return nearbySpots;
	}

	/**
	 * Calculates the as-the-crow-flies distance between two lat/long coordinates.
	 * @param lat1
	 * @param long1
	 * @param lat2
	 * @param long2
	 * @return
	 */
	public static double calculateDistance(long lat1, long long1, long lat2, long long2){
		double dLat = Math.toRadians(lat2 - lat1);
		double dLon = Math.toRadians(long2 - long1);
		double rLat1 = Math.toRadians(lat1);
		double rLat2 = Math.toRadians(lat2);
	
		double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
		        Math.sin(dLon/2) * Math.sin(dLon/2) * Math.cos(rLat1) * Math.cos(rLat2); 
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a)); 
		double d = EARTH_RADIUS * c;
		
		return d;
	}
	
	private static final int EARTH_RADIUS = 6371;
}
