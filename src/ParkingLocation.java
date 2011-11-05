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

	public long getLongitude() {
		return longitude;
	}

	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}

	public long getLatitude() {
		return latitude;
	}

	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}

	public int getSpotsAvailable() {
		return spotsAvailable;
	}

	public void setSpotsAvailable(int spotsAvailable) {
		this.spotsAvailable = spotsAvailable;
	}

	public double getLikelihood() {
		return likelihood;
	}

	public void setLikelihood(double likelihood) {
		this.likelihood = likelihood;
	}
	
	private long longitude;
	private long latitude;
	private int spotsAvailable;
	private double likelihood;
}
