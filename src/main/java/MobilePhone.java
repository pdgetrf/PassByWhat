import java.util.Arrays;

public class MobilePhone {

    public String brand;
    public boolean hasPhysicalKeys;
    public int numberOfCamera;
    public String network;

    public void dial(int[] numbers) {
        System.out.println("calling " + Arrays.toString(numbers));
    }

    // constructor
    public MobilePhone(String brand, boolean hasPhysicalKeys, int numberOfCamera, String network) {
        this.brand = brand;
        this.hasPhysicalKeys = hasPhysicalKeys;
        this.numberOfCamera = numberOfCamera;
        this.network = network;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "brand='" + brand + '\'' +
                ", hasPhysicalKeys=" + hasPhysicalKeys +
                ", numberOfCamera=" + numberOfCamera +
                ", network='" + network + '\'' +
                '}';
    }

    public void setNetwork(String network) {
        this.network = network;
    }
}
