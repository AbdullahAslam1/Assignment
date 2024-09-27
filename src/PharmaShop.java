import java.util.Scanner;
class PharmacyShop {

    Scanner sc = new Scanner(System.in);
    private Person owner;
    private Address address;
    private Medicine[] medicines;
    private int medicineCount;

    public PharmacyShop(Person owner, Address address, int inventorySize) {
        this.owner = owner;
        this.address = address;
        this.medicines = new Medicine[inventorySize];
        this.medicineCount = 0;

        addMedicine(new Medicine("M001", "Paracetamol", 50.0, 100, "PharmaCorp", "B123", new Date(15, 8, 2025)));
        addMedicine(new Medicine("M002", "Ibuprofen", 75.0, 80, "HealthMed", "B124", new Date(10, 12, 2024)));
        addMedicine(new Medicine("M003", "Amoxicillin", 120.0, 50, "BioPharma", "B125", new Date(20, 5, 2026)));
        addMedicine(new Medicine("M004", "Ciprofloxacin", 150.0, 60, "MedLife", "B126", new Date(30, 11, 2025)));
    }

    public void addMedicine(Medicine medicine) {
        if (medicineCount < medicines.length) {
            medicines[medicineCount++] = medicine;
        } else {
            System.out.println("Space is full. Cannot add more medicines.");
        }
    }

    public void displayAllMedicines() {
        for (int i = 0; i < medicineCount; i++) {
            medicines[i].displayInformation();
            System.out.println();
        }
    }

    public void searchMedicineByName(String name) {
        for (int i = 0; i < medicineCount; i++) {
            if (medicines[i].getName().equals(name)) {
                medicines[i].displayInformation();

            }
        }
        System.out.println("Medicine not found.");
    }

    public void searchMedicineByID(String id){
        for (int i = 0; i < medicineCount; i++) {
            if (medicines[i].getMedicineId().equals(id)){
                medicines[i].displayInformation();
            }
            else {
                System.out.println("Medicine not found.");
            }
        }
    }

    public void updateMedicine(String name){
        for (int i = 0; i < medicineCount; i++) {
            if (medicines[i].getName().equals(name)){
                medicines[i].setBatchNumber(sc.next());
                medicines[i].setMedicineId(sc.next());
                medicines[i].setName(sc.next());
                medicines[i].setQuantity(sc.nextInt());medicines[i].setPrice(sc.nextDouble());
                medicines[i].getExpiryDate().setDay(sc.nextInt());
                medicines[i].getExpiryDate().setMonth(sc.nextInt());medicines[i].getExpiryDate().setYear(sc.nextInt());
            }
            else {
                System.out.println("Medicine not found.");
            }
        }
    }
}
