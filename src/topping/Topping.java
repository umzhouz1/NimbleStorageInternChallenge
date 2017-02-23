package topping;

public class Topping {
	private String topping;
	private String[] choices;
	private double cost;

	public Topping(String topping, String[] choices, double cost) {
		this.setTopping(topping);
		this.setChoices(choices);
		this.setCost(cost);
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	public String[] getChoices() {
		return choices;
	}

	public void setChoices(String[] choices) {
		this.choices = choices;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getPrice() {
		return (int) Math.ceil(cost*1.5);
	}

	public String userChoiceToString(String choice) {
		return topping+": "+choice;
	}

}
