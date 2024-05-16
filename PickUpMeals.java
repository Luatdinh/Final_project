public class PickUpMeals implements OrderState {
    @Override
    public void selectDietaryAndTopping(CPPFoodDeliveryPlatform context) {
        // Not applicable for this state
    }

    @Override
    public void prepareMeals(CPPFoodDeliveryPlatform context) {
        // Not applicable for this state
    }

    public void pickUpMeals(CPPFoodDeliveryPlatform context){
        System.out.println("Driver picked up order: " + context.getDietaryRestrictions() + " with " + context.getTopping() + " at the restaurant.");
        context.setState(new DeliverMeals());
    }
    @Override
    public void deliverMeals(CPPFoodDeliveryPlatform context) {
        // Not applicable for this state
    }
}
