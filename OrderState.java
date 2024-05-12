public interface OrderState {
    void selectDietaryAndTopping(CPPFoodDeliveryPlatform context);
    void prepareMeals(CPPFoodDeliveryPlatform context);
    void deliverMeals(CPPFoodDeliveryPlatform context);
}