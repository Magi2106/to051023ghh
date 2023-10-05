import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        Customer customer1 = new Customer("Chicken", "Cooper", "MangoJuice", 1);
        Customer customer2 = new Customer("balle", "peter", "gulle25", 2);

        customers.add(customer1);
        customers.add(customer2);

        printCustomers(customers);
    }


    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }
}