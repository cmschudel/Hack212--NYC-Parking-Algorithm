
public class ParkingLocation {

	public ParkingLocation(){
		
	}

	public ParkingLocation(long longitude, long latitude, double likelihood){
		this.longitude = longitude;
		this.latitude = latitude;
		this.likelihood = likelihood;
	}
	
	public long longitude;
	public long latitude;
	public double likelihood;
}
