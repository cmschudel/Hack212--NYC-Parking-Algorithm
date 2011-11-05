import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

/**
 * Describes a user, whose data we get once they make a request for
 * a parking space.
 *
 */
public class User {

	/**
	 * Initialize a user with a location and the time that they've requested a spot.
	 * @param longitude
	 * @param latitude
	 * @param time
	 */
	public User(long longitude, long latitude){
		this.longitude = longitude;
		this.latitude = latitude;
		
		// Set the time of the user's request to the current time.
		this.time = new Date();
		userid = UUID.randomUUID();
	}
	
	/**
	 * Initialize a user with a location and the time that they've requested a spot.
	 * @param longitude
	 * @param latitude
	 * @param time
	 */
	public User(long longitude, long latitude, Date time){
		this.longitude = longitude;
		this.latitude = latitude;
		
		// Set the time of the user's request to the current time.
		this.time = time;
		userid = UUID.randomUUID();
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

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public UUID getUserid() {
		return userid;
	}

	/**
	 * Sets the collection of a User's k locations. 
	 * @param newLocations
	 */
	public void setLocations(ArrayList<ParkingLocation> newLocations) {
		kLocations = newLocations;
	}
	
	/**
	 * Returns the User's k nearest locations.
	 * @return
	 */
	public ArrayList<ParkingLocation> getLocations() {
		return kLocations;
	}
	
	private ArrayList<ParkingLocation> kLocations;
	public long longitude;
	public long latitude;
	public Date time;
	public final UUID userid;
        
        public ArrayList<ParkingLocation> locations;
}
