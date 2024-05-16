public class PrepareMeals implements OrderState {
    @Override
    public void selectDietaryAndTopping(CPPFoodDeliveryPlatform context) {
        // Not applicable for this state
    }

    @Override
    public void prepareMeals(CPPFoodDeliveryPlatform context) {
        System.out.println("Preparing meals based on dietary restrictions: " + context.getDietaryRestrictions());
        System.out.println("Adding the selected topping, "+ context.getTopping() + ", to the meal");
        Restaurant restaurant = context.getRestaurants().get(0);  // Get the first restaurant for simplicity
        createMealForDiet(context.getDietaryRestrictions(), restaurant);
        context.setCurrentMeal(restaurant.getMeals().get(restaurant.getMeals().size() - 1));  // Set the last prepared meal as the current meal
        context.setState(new PickUpMeals());
    }

    private void createMealForDiet(String dietaryRestriction, Restaurant restaurant) {
        Macronutrient macronutrient = new Macronutrient(dietaryRestriction);
        Meal meal = new Meal();  // Removed the price from the constructor
        meal.addComponent(macronutrient.createCarb());
        meal.addComponent(macronutrient.createProtein());
        meal.addComponent(macronutrient.createFat());
        restaurant.getMeals().add(meal);
    }

    public void pickUpMeals(CPPFoodDeliveryPlatform context){
        // Not applicable for this state
    }
    @Override
    public void deliverMeals(CPPFoodDeliveryPlatform context) {
        // Not applicable for this state
    }
}
