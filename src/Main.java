import restaurant.RiceBowlRestaurant;
import utils.ConsoleReader;

public class Main {

	public static void main(String[] args) {
		String owner = ConsoleReader.promptString("Whose Rice Bowl restaurant is this?");
		RiceBowlRestaurant riceBowlRestaurant = new RiceBowlRestaurant(owner);
		riceBowlRestaurant.start();
	}

}
