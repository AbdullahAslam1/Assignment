public class Medicine {
    private String medicineId;
    private String name;
    private double price;
    private int quantity;
    private String manufacturer;
    private String batchNumber;
    private Date expiryDate;

    public Medicine(String medicineId, String name, double price, int quantity, String manufacturer, String batchNumber, Date expiryDate) {
        this.medicineId = medicineId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
        this.batchNumber = batchNumber;
        this.expiryDate = expiryDate;
    }

    // Getters and Setters
    public String getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void displayInformation() {
        System.out.println("Medicine ID: " + medicineId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Batch Number: " + batchNumber);
        System.out.println("Expiry Date: " + expiryDate);
    }
}
