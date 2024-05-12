public class PrepareMeals implements OrderState {
    @Override
    public void selectDietaryAndTopping(CPPFoodDeliveryPlatform context) {
        // Not applicable for this state
    }

    @Override
    public void prepareMeals(CPPFoodDeliveryPlatform context) {
        System.out.println("Preparing meals based on dietary restrictions: " + context.getDietaryRestrictions());
        Restaurant restaurant = context.getRestaurants().get(0);  // Get the first restaurant for simplicity
        createMealForDiet(context.getDietaryRestrictions(), restaurant);
        context.setCurrentMeal(restaurant.getMeals().get(restaurant.getMeals().size() - 1));  // Set the last prepared meal as the current meal
        context.setState(new DeliverMeals());
    }

    private void createMealForDiet(String dietaryRestriction, Restaurant restaurant) {
        Macronutrient macronutrient = new Macronutrient(dietaryRestriction);
        Meal meal = new Meal();  // Removed the price from the constructor
        meal.addComponent(macronutrient.createCarb());
        meal.addComponent(macronutrient.createProtein());
        meal.addComponent(macronutrient.createFat());
        restaurant.getMeals().add(meal);
    }

    @Override
    public void deliverMeals(CPPFoodDeliveryPlatform context) {
        // Not applicable for this state
    }
}
