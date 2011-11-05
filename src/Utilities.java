
public class Utilities {

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
