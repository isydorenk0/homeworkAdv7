package Ex4;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "addresses")
public class Addresses {

    @XmlElement(name = "city")
    private List<City> cities = new ArrayList<>();

    public void add(City city) {
        cities.add(city);
    }

}
