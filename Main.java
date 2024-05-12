public class Main {
    public static void main(String[] args) {
        // Initialize the platform
        CPPFoodDeliveryPlatform platform = new CPPFoodDeliveryPlatform();

        // Register restaurants
        Restaurant veganRestaurant = new Restaurant("The Green Bowl", "123 Veggie Road", "Los Angeles", "8 AM - 10 PM", "Vegan", platform);
        Restaurant seafoodRestaurant = new Restaurant("Ocean's Catch", "234 Fish Ave", "San Diego", "10 AM - 8 PM", "Seafood", platform);
        Restaurant steakhouseRestaurant = new Restaurant("Steak Paradise", "345 Meat St", "Orange County", "11 AM - 11 PM", "Steakhouse", platform);
        Restaurant italianRestaurant = new Restaurant("Pure Pasta", "456 Italian Blvd", "San Bernardino", "9 AM - 9 PM", "Italian", platform);
        platform.registerRestaurant(veganRestaurant);
        platform.registerRestaurant(seafoodRestaurant);
        platform.registerRestaurant(steakhouseRestaurant);
        platform.registerRestaurant(italianRestaurant);

        // Register one driver with the server
        Driver driver1 = new Driver("Driver1", "Main Street 1", "Los Angeles", platform);
        platform.registerDriver(driver1);

        // Register two customers with different dietary restrictions
        Customer customer1 = new Customer("Customer1", "100 First St", "Los Angeles", platform);
        Customer customer2 = new Customer("Customer2", "200 Second St", "San Diego", platform);
        platform.registerCustomer(customer1);
        platform.registerCustomer(customer2);

        // Set initial state for customer1
        platform.setState(new SelectDietaryAndTopping());
        customer1.selectDietary("Vegan");
        veganRestaurant.prepareMeal(); // Directly call the prepareMeal on the specific restaurant
        driver1.deliver();
        System.out.println("Meal details for " + customer1.getName() + " with a Vegan diet:");

        // Reset state for customer2
        platform.setState(new SelectDietaryAndTopping());
        customer2.selectDietary("Nut Allergy");
        steakhouseRestaurant.prepareMeal(); // Directly call the prepareMeal on the specific restaurant
        driver1.deliver();
        System.out.println("Meal details for " + customer2.getName() + " with a Paleo diet:");
    }
}
