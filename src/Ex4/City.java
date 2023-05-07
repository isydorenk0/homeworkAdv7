package Ex4;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "city")
public class City {
    private String city;
    private String size;
    private String street;
    private int building;

    public City() {
    }

    public City(String city, String size, String street, int building) {
        this.city = city;
        this.size = size;
        this.street = street;
        this.building = building;
    }
    @XmlElement
    public String getCity() {
        return city;
    }
    @XmlAttribute
    public String getSize() {
        return size;
    }
    @XmlElement
    public String getStreet() {
        return street;
    }
    @XmlElement
    public int getBuilding() {
        return building;
    }
}
