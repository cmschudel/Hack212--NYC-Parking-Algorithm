import java.util.Date;
import java.util.UUID;

/**
 * Describes a user, whose data we get once they make a request for
 * a parking space.
 *
 */
public class User {

	public User(long longitude, long latitude, Date time){
		this.longitude = longitude;
		this.latitude = latitude;
		
		// Set the time of the user's request to the current time.
		this.time = new Date();
		userid = UUID.randomUUID();
	}
	
	public long longitude;
	public long latitude;
	public Date time;
	public final UUID userid;
}
