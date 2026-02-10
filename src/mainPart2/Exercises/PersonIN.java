public class PersonIN {
    private String name;
    private String address;

    public PersonIN(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return this.name + "\n " + this.address;
    }
}
