package Models;


public class Address {

    private String country;
    private String region;
    private String city;
    private String street;
    private String house;

    public Address(String country, String region, String city, String street, String house){
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return country + " " + region + " " + city + " " + street + " " + house ;
    }

    public static void main(String[] args) {
        Address address = new Address("Armenia", " ", "Yerevan", "Amiryan", "8" );
        System.out.println(address.toString());
    }
}
