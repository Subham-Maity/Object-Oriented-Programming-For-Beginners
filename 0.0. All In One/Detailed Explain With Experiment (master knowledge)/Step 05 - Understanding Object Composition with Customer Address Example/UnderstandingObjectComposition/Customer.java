package UnderstandingObjectComposition;

public class Customer {
    //state
    private String name;

    private Address workAddress;

    //creation
    //workAddress not mandatory for creation
    public Customer(String name) {
        this.name = name;

    }

    //behaviors
    //certain components of homeAddress and workAddress can be modified, not the name


    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }



    public Address getWorkAddress() {
        return workAddress;
    }

    public String toString() {
        return String.format ("Customer: %s, workAddress: %s", name, workAddress);
    }
}