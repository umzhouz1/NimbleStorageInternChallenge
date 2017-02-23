package ricebowl;

import topping.Topping;

public class RiceBowl {

	private StringBuilder riceBowlToppings;
	private int price;
	private static final String SKIP = "skip";

	public RiceBowl() {
		riceBowlToppings = new StringBuilder();
		price = 0;
	}

	public void addIngredient(String choice, Topping topping) {
		if (!choice.equals(SKIP)) {
			riceBowlToppings.append("     "+topping.userChoiceToString(choice)+"\n");
			addToPrice(topping);
		}
	}

	private void addToPrice(Topping topping) {
		price += topping.getPrice();
	}

	public int getPrice() {
		return price;
	}

	public String getRiceBowlRepresentation() {
		return "Here is your rice bowl with:\n" + riceBowlToppings.toString() + "\nCost: $"+getPrice()+"\n";
	}
}
