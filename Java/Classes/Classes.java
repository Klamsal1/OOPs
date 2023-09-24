package Classes;
/**
 * Class : Class is a blueprint which defines how our real world entity will be represented in terms of code.
 * 
 */
class Vehicle {
    
    //data members, private in nature
    private String vehicleNumber;
    private float price;
    private String model;
    

    //getters and setters for data members
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public String toString() {
        return "Vehicle [vehicleNumber=" + vehicleNumber + ", price=" + price + ", model=" + model + ", color=" + "]";
    }

}

public class Classes {
    public static void main(String args[]) {
        //creating car object from its blueprint class
        Vehicle car = new Vehicle(); 
        car.setModel("MX11");
        car.setPrice(1000000);
        car.setVehicleNumber("1S23DDE");

        System.out.println(car.toString());
    }
}
