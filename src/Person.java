public class Person {
    private String name;
    private long contactNumber;

    public Person(String name, int contactNumber) {
        setName(name);
        setContactNumber(contactNumber);
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Contact Number: " + contactNumber);
    }
}
