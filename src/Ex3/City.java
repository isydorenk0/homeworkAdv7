package Ex3;

public class City {
    private String city;
    private String size;
    private String street;
    private int building;

    public City(String city, String size, String street, int building) {
        this.city = city;
        this.size = size;
        this.street = street;
        this.building = building;
    }

    public String getCity() {
        return city;
    }

    public String getSize() {
        return size;
    }

    public String getStreet() {
        return street;
    }

    public int getBuilding() {
        return building;
    }
}
