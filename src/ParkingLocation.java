/**
 * Describes a parking location, which has a location,
 * an estimate of spots available, and a likelihood
 * that a user will find a spot here.
 *
 */
public class ParkingLocation {

	public ParkingLocation(long longitude, long latitude){
		this.longitude = longitude;
		this.latitude = latitude;
		this.spotsAvailable = 0;
		this.likelihood = 0.0;
	}

	public ParkingLocation(long longitude, long latitude, double likelihood, int spotsAvailable){
		this.longitude = longitude;
		this.latitude = latitude;
		this.likelihood = likelihood;
		this.spotsAvailable = spotsAvailable;
	}
	
	public long longitude;
	public long latitude;
	public int spotsAvailable;
	public double likelihood;
}
