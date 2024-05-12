public class Customer {
    private String name;
    private String address;
    private String county;
    private CPPFoodDeliveryPlatform server; // Server to process dietary selections

    // Constructor to initialize the customer without dietary restrictions
    public Customer(String name, String address, String county, CPPFoodDeliveryPlatform server) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.server = server;
    }

    // Getters and setters for the attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    // Method to select dietary restrictions and process them
    public void selectDietary(String dietaryRestrictions) {
        server.processSelectDietaryAndTopping(dietaryRestrictions);
    }
}
