public class Address {

    private String street;
    private String city;
    private int postalCode;

    public Address(String street, String city, int postalCode) {
        setStreet(street);
        setCity(city);
        setPostalCode(postalCode);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void display() {
        System.out.println("Street: " + getStreet());
        System.out.println("City: " + getCity());
        System.out.println("Postal Code: " + getPostalCode());
    }
}
