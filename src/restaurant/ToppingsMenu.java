package restaurant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import topping.Topping;

public class ToppingsMenu implements Iterator<Topping> {
	
	List<Topping> toppings;
	private static final String SKIP = "skip";
	int currentIdx;
	
	public ToppingsMenu() {
		toppings = new ArrayList<Topping>();
		toppings.add(new Topping("Rice",new String[] {"brown","white"},1));
		toppings.add(new Topping("Vegetables",new String[] {"mixed",SKIP},1));
		toppings.add(new Topping("Meat",new String[] {"chicken", "beef"},2));
		toppings.add(new Topping("Sauce",new String[] {"spicy", "sweet"},0.25));
		toppings.add(new Topping("Extra",new String[] {"sour cream", SKIP},1));
		toppings.add(new Topping("Extra",new String[] {"guacamole", SKIP},1));
		currentIdx = -1;
	}

	@Override
	public boolean hasNext() {
		return currentIdx<toppings.size()-1;
	}

	@Override
	public Topping next() {
		currentIdx++;
		return toppings.get(currentIdx);
	}

}
