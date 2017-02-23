package restaurant;

import ricebowl.RiceBowl;
import topping.Topping;
import utils.ConsoleReader;

public class RiceBowlRestaurant {
	private boolean customerHasLeft;
	private String owner;
	
	private ToppingsMenu myToppingsMenu;
	
	private static final String DEFAULT_NAME = "Rice Bowl Restaurant";
	private static final String WELCOME = "welcome";
	private static final String THANK_YOU = "thank you";
	private static final String CUSTOMER_NEXT_STEP = "Next step";
	private static final String ENJOY = "enjoy";

	public RiceBowlRestaurant(String owner) {
		this.owner = owner;
		myToppingsMenu = new ToppingsMenu();
	}

	public void start() {
		printMessageToUser(WELCOME);
		while(!customerHasLeft) {
			makeBowl();
			printMessageToUser(ENJOY);
			promptUserNextStep();
		}
		printMessageToUser(THANK_YOU);
	}

	private void makeBowl() {
		RiceBowl riceBowl = new RiceBowl();
		promptUserToppingChoices(riceBowl);
		System.out.println(riceBowl.getRiceBowlRepresentation());
	}

	private void promptUserNextStep() {
		String response = ConsoleReader.promptOneOf(CUSTOMER_NEXT_STEP, new String[] {"leave","order"});
		if (response.equals("leave")) {
			customerHasLeft = true;
		}
	}

	private void promptUserToppingChoices(RiceBowl riceBowl) {
		while(myToppingsMenu.hasNext()) {
			Topping topping = myToppingsMenu.next();
			String userChoice = ConsoleReader.promptOneOf(topping.getTopping()+" ($"+topping.getPrice()+")", topping.getChoices());
			riceBowl.addIngredient(userChoice, topping);
		}
	}

	private void printMessageToUser(String typeOfNotification) {
		if (typeOfNotification.equals(WELCOME)) {
			System.out.println("Welcome to "+owner+"'s "+DEFAULT_NAME+"!\n"+"Pick your toppings below!\n");
		} else if (typeOfNotification.equals(THANK_YOU)) {
			System.out.println("Thank you for ordering at "+owner+"'s "+DEFAULT_NAME+"!");
		} else if (typeOfNotification.equals(ENJOY)) {
			System.out.println("Hope you enjoy!");
		} 
		return;
	}
}
