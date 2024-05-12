import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<FoodItem> toppings;

    public Menu() {
        this.toppings = new ArrayList<>();
        initializeDefaultToppings();
    }

    private void initializeDefaultToppings() {
        toppings.add(new Tomato()); // Tomato described as "Fresh Tomato"
        toppings.add(new Pickle()); // Pickle described as "Crisp Pickle"
        toppings.add(new Sauce()); // Sauce described as "Rich Sauce"
    }

    public void addTopping(FoodItem topping) {
        if (topping != null && !toppings.contains(topping)) {
            toppings.add(topping);
            System.out.println("Topping added: " + topping.describeTopping());
        }
    }

    public List<FoodItem> getToppings() {
        return new ArrayList<>(toppings);
    }
}
