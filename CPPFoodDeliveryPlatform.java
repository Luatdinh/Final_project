import java.util.ArrayList;
import java.util.List;

public class CPPFoodDeliveryPlatform {
    private List<Restaurant> restaurants;
    private List<Driver> drivers;
    private List<Customer> customers;
    private OrderState state;  // Added to manage the state
    private String dietaryRestrictions;
    private String topping;
    private Meal currentMeal;  // Reference to the current meal being processed


    // Constructor to initialize lists for restaurants, drivers, and customers
    public CPPFoodDeliveryPlatform() {
        restaurants = new ArrayList<>();
        drivers = new ArrayList<>();
        customers = new ArrayList<>();
        this.state = new SelectDietaryAndTopping();
    }

    // Getter for the list of restaurants
    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    // Getter for the list of drivers
    public List<Driver> getDrivers() {
        return drivers;
    }

    // Getter for the list of customers
    public List<Customer> getCustomers() {
        return customers;
    }

    // Method to register a restaurant on the platform
    public void registerRestaurant(Restaurant restaurant) {
        if (restaurant != null && !restaurants.contains(restaurant)) {
            restaurants.add(restaurant);
            System.out.println("Restaurant registered: " + restaurant.getName());
        } else {
            System.out.println("Failed to register restaurant: Restaurant already registered or null.");
        }
    }

    public void setCurrentMeal(Meal meal) {
        this.currentMeal = meal;
    }

    public Meal getCurrentMeal() {
        return currentMeal;
    }

    // Method to register a driver on the platform
    public void registerDriver(Driver driver) {
        if (driver != null && !drivers.contains(driver)) {
            drivers.add(driver);
            System.out.println("Driver registered: " + driver.getName());
        } else {
            System.out.println("Failed to register driver: Driver already registered or null.");
        }
    }

    // Method to register a customer on the platform
    public void registerCustomer(Customer customer) {
        if (customer != null && !customers.contains(customer)) {
            customers.add(customer);
            System.out.println("Customer registered: " + customer.getName());
        } else {
            System.out.println("Failed to register customer: Customer already registered or null.");
        }
    }

    // State management methods
    public void setState(OrderState newState) {
        this.state = newState;
    }

    // Method to process the selection of dietary and topping options
    public void processSelectDietaryAndTopping(String dietaryRestrictions, String topping) {
        setDietaryRestrictions(dietaryRestrictions);
        setTopping(topping);
        if (state != null) {
            state.selectDietaryAndTopping(this);
        } else {
            System.out.println("No state is set to process dietary and topping selections.");
        }
    }

    // Method to process the preparation of meals
    public void processPrepareMeals() {
        if (state != null) {
            state.prepareMeals(this);
        } else {
            System.out.println("No state is set to process meal preparation.");
        }
    }

    public void processPickUpMeals(){
        if(state != null){
            state.pickUpMeals(this);
        }
        else{
            System.out.println("No state is set to process meal picking up");
        }
    }


    // Method to process the delivery of meals
    public void processDeliverMeals() {
        if (state != null) {
            state.deliverMeals(this);
        } else {
            System.out.println("No state is set to process meal delivery.");
        }
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getTopping(){
        return topping;
    }
    public void setDietaryRestrictions(String dietaryRestrictions) {
        this.dietaryRestrictions = dietaryRestrictions;
    }

    public String getDietaryRestrictions() {
        return dietaryRestrictions;
    }
}
