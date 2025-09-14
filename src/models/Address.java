package models;


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
        if(country == null || country.isEmpty()){

            throw new IllegalArgumentException("it cannot be null or empty");
        }
        else {
            this.country = country;
        }
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        if(region == null || region.isEmpty()){

            throw new IllegalArgumentException("it cannot be null or empty");
        }
        else {
            this.region = region;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if(city == null || city.isEmpty()){

            throw new IllegalArgumentException("it cannot be null or empty");
        }else {
            this.city = city;
        }
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if(street == null || street.isEmpty()){

            throw new IllegalArgumentException("it cannot be null or empty");
        }else {
            this.street = street;
        }
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        if(house == null || house.isEmpty()){
            throw new IllegalArgumentException("it cannot be null or empty");
        }else {
            this.house = house;
        }
    }

    @Override
    public String toString() {
        return country + " " + region + " " + city + " " + street + " " + house ;
    }

}
