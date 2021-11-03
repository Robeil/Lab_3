package CS203Course.Lab_3;

public class Address {

    private int type;
    private String street;
    private String city;
    private String state;
    private int zip;

    public Address() {
        this.street = "3251 S 176th street";
        this.city = "Seattle";
        this.state = "WA";
        this.zip = 98188;
    }

    public Address(int type, String street, String city, String state, int zip) {

        this.type = type;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
}
