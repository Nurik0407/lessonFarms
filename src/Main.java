import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Sheep[] sheeps = {new Sheep(40, 3, "m", "Shon"),
                new Sheep(60, 3, "l", "Ban"),
                new Sheep(50, 2, "m", "Nick")};

        Cow[] cows = {
                new Cow(400, 4, "m", "Dastan"),
                new Cow(345, 23, "m", "Ilim"),
                new Cow(500, 4, "j", "Sanzhar"),
                new Cow(390, 2, "j", "Sam"),
                new Cow(600, 6, "m", "Byk")};

        Horse[] horses = {new Horse(540, 4, "j", "Balmond", "white"),
                new Horse(390, 3, "m", "Ahiles", "black")};

        Farm farm1 = new Farm("Talas", sheeps, cows, horses, "Nuradil");


        Sheep[] sheeps2 = {new Sheep(50, 3, "m", "Molly")};
        Cow[] cows1 = {new Cow(500, 3, "m", "Melman")};
        Horse[] horses1 = {new Horse(550, 3, "m", "Aleks", "black")};

        Farm farm2 = new Farm("Bishkek", sheeps2, cows1, horses1, "Bek");

        while (true) {
            System.out.print("Farm:");
            int farms = new Scanner(System.in).nextInt();
            if (1 == farms) System.out.println(farm1);
            else if (2 == farms) System.out.println(farm2);
            else System.out.println("Invalid command!");
        }
    }
}