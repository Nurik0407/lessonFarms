import java.util.Arrays;

public class Farm {
    private String address;
    private Sheep[] sheep;
    private Cow[] cow;
    private Horse[] horse;
    private String ownerName;


    public Farm(String address, Sheep[] sheep, Cow[] cow,
                Horse[] horse, String ownerName) {
        this.address = address;
        this.sheep = sheep;
        this.cow = cow;
        this.horse = horse;
        this.ownerName = ownerName;
    }

    public Farm(String address, Cow[] cow, Sheep[] sheep, Horse[] horse, String ownerName) {
        this.address = address;
        this.sheep = sheep;
        this.cow = cow;
        this.horse = horse;
        this.ownerName = ownerName;
    }


    @Override
    public String toString() {
        return "\nownerName: " + ownerName +
                "\naddress: " + address +
                "\nAnimals: " +
                "\n cow: \n" + Arrays.toString(cow) +
                "\n horse: \n" + Arrays.toString(horse) +
                "\n sheep: \n" + Arrays.toString(sheep) +
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
}
