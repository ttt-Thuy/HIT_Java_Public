package baitapvenha;

public class Publisher {
    private String name;
    private String address;

    public static final String NAME = "name";
    public static final String ADDRESS = "Unknown";

    public Publisher() {
        this(Publisher.NAME, Publisher.ADDRESS);
    }

    public Publisher(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Ten nguoi xuat ban: "+ name + ", dia chi: " + address ;
    }

}
