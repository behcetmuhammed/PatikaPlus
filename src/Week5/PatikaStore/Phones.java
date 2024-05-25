package Week5.PatikaStore;

public class Phones extends Products{

    private int batteryPower;
    private String colour;

    public Phones(int id, double unitPrice, int discountRate, int stockQuantity, String name, String brandInformation, int storage, String colour) {
        super(id, unitPrice, discountRate, stockQuantity, name, brandInformation, 6, storage, 6.1);
        this.batteryPower = 3000;
        this.colour = colour;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
