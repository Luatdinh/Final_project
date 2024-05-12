public class DeliverMeals implements OrderState {
    @Override
    public void selectDietaryAndTopping(CPPFoodDeliveryPlatform context) {
        // Not applicable for this state
    }

    @Override
    public void prepareMeals(CPPFoodDeliveryPlatform context) {
        // Not applicable for this state
    }

    @Override
    public void deliverMeals(CPPFoodDeliveryPlatform context) {
        Meal meal = context.getCurrentMeal();
        if (meal != null) {
            System.out.println("Delivering meal with the following components:");
            meal.displayComponents();  // Display all components of the meal
        } else {
            System.out.println("No meal is set for delivery.");
        }
        context.setState(null);  // Reset the state after delivery
    }
}
