import java.util.ArrayList;


public class Hack212 {
   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
       
	   
	   ParkingCalculator calc = new ParkingCalculator();
	   
	   ArrayList<ParkingLocation> inLocations = new ArrayList<ParkingLocation>();
	   inLocations.add(new ParkingLocation(57.44, 44.72, .9, 9));
	   inLocations.add(new ParkingLocation(67.08,94.57,.75,86));
	   inLocations.add(new ParkingLocation(66.46,15.92,.16,61));
	   inLocations.add(new ParkingLocation(78.54,9.931,.1,21));
	   inLocations.add(new ParkingLocation(86.79,33.75,.3,53));
	   inLocations.add(new ParkingLocation(97.01,15.79,.42,74));
	   inLocations.add(new ParkingLocation(77.68,90.9,.38,77));
	   inLocations.add(new ParkingLocation(59.24,69.36,.6,63));
	   calc.setParkingLocations(inLocations);
	   
	   ArrayList<User> users = new ArrayList<User>();
	   

	   

	   
	   
	   
	   
	   calc.setParkingLocations(inLocations);
   }
}
