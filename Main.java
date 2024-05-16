public class Main {
    public static void main(String[] args) {
        CPPFoodDeliveryPlatform platform = new CPPFoodDeliveryPlatform();
        Restaurant veganRestaurant = new Restaurant("The Green Bowl", "123 Veggie Road", "Los Angeles", "8 AM - 10 PM", "Vegan", platform);
        Restaurant seafoodRestaurant = new Restaurant("Ocean's Catch", "234 Fish Ave", "San Diego", "10 AM - 8 PM", "Seafood", platform);
        Restaurant steakhouseRestaurant = new Restaurant("Steak Paradise", "345 Meat St", "Orange County", "11 AM - 11 PM", "Steakhouse", platform);
        Restaurant italianRestaurant = new Restaurant("Pure Pasta", "456 Italian Blvd", "San Bernardino", "9 AM - 9 PM", "Italian", platform);
        platform.registerRestaurant(veganRestaurant);
        platform.registerRestaurant(seafoodRestaurant);
        platform.registerRestaurant(steakhouseRestaurant);
        platform.registerRestaurant(italianRestaurant);
        Driver driver1 = new Driver("Driver1", "Main Street 1", "Los Angeles", platform);
        platform.registerDriver(driver1);
        Customer customer1 = new Customer("Customer1", "100 First St", "Los Angeles", platform);
        Customer customer2 = new Customer("Customer2", "200 Second St", "San Diego", platform);
        Customer customer3 = new Customer("Customer3", "200 Second St", "San Diego", platform);
        platform.registerCustomer(customer1);
        platform.registerCustomer(customer2);
        platform.registerCustomer(customer3);
        System.out.println();
        System.out.println("Customer1");
        customer1.selectDietaryAndTopping("Vegan", "Tomato");
        veganRestaurant.prepareMeal();
        driver1.pickUpMeal();
        driver1.deliver();
        System.out.println();
        System.out.println("Customer2");
        customer2.selectDietaryAndTopping("Nut Allergy", "Sauce");
        steakhouseRestaurant.prepareMeal();
        driver1.pickUpMeal();
        driver1.deliver();
        System.out.println();
        System.out.println("Customer3");
        customer3.selectDietaryAndTopping("Paleo", "Pickle");
        seafoodRestaurant.prepareMeal();
        driver1.pickUpMeal();
        driver1.deliver();
    }
}
