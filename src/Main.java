import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person owner = new Person("Ahmed Khan", 0321413243);

        Address address = new Address("123 Main St", "Karachi", 75034);

        PharmacyShop pharmacyShop = new PharmacyShop(owner, address, 10);

        while (true) {
            System.out.println("1. Add a new medicine");
            System.out.println("2. Display all medicines");
            System.out.println("3. Search medicine by name");
            System.out.println("4. Search medicine by ID");
            System.out.println("5. Update Existing medicine details");
            System.out.println("6. Sell a medicine");
            System.out.println("7. Search for a medicine by name");
            System.out.println("8. Identify and list expired medicines");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    System.out.print("Enter medicine ID: ");
                    String medicineId = scanner.next();
                    System.out.print("Enter medicine name: ");
                    String name = scanner.next();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter manufacturer: ");
                    String manufacturer = scanner.next();
                    System.out.print("Enter batch number: ");
                    String batchNumber = scanner.next();
                    System.out.print("Enter expiry date (day month year): ");
                    int day = scanner.nextInt();
                    int month = scanner.nextInt();
                    int year = scanner.nextInt();
                    Date expiryDate = new Date(day, month, year);
                    pharmacyShop.addMedicine(new Medicine(medicineId, name, price, quantity, manufacturer, batchNumber, expiryDate));
                    break;
                case 2:
                    pharmacyShop.displayAllMedicines();
                    break;
                case 3:
                    System.out.print("Enter medicine name to search: ");
                    name = scanner.next();
                    pharmacyShop.searchMedicineByName(name);
                    break;
                case 4:
                    System.out.println("Enter medicine Id to search");
                    medicineId = scanner.next();
                    pharmacyShop.searchMedicineByID(medicineId);
                    break;
                case 5:
                    System.out.println("Enter the medicine name to update");
                    name = scanner.next();
                    pharmacyShop.updateMedicine(name);
                    break;
                case 9:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                    default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
