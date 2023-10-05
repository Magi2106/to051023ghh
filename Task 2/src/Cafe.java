import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
class Cafe {
    private ArrayList<String> coffeeMenu = new ArrayList<>();

    public void loadMenuData() {
        try {
            File file = new File("src/coffees.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String coffeeName = scanner.nextLine();
                coffeeMenu.add(coffeeName);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File 'coffees.txt' not found.");
        }
    }

    public void printCoffeeMenu() {
        for (String coffee : coffeeMenu) {
            System.out.println(coffee);
        }
    }
}