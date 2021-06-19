package project1;

public class Car extends Vehicle{
    
    private String owner;

    public Car() {
    }

    public Car(String owner, String brand, int plateNo) {
        super(brand, plateNo);
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    
}
