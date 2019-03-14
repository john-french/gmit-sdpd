// PersonAddress class - John French

public class PersonAddress {
    private String firstName;
    private String lastName;
    private Address address;

    public PersonAddress()  //Default constructor
    {
        this.address = new Address();
        this.firstName = "";
        this.lastName = "";
    }

    public PersonAddress(String firstName, String lastName, String street, String town, String county)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = new Address(street, town, county);
    }


    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getAddress() {
        return address.toString();
    }

    public void setAddress(String street, String town, String county) {
        address.setAddress(street, town, county);
    }

    public void setNameAddress(String firstName, String lastName, String street, String town, String county) {
        this.firstName = firstName;
        this.lastName = lastName;
        address.setAddress(street, town, county);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return (firstName + " " + lastName + " " + address.toString());
    }

    private class Address {
        // Member Variables
        private String street;
        private String town;
        private String county;

        //====  Methods
        public Address()    //Default Constructor;
        {
            this.street = "unknown";
            this.town = "unknown";
            this.county = "unknown";
        }

        public Address(String street, String town, String county) //Parameter Constructor
        {
            this.street = street;
            this.town = town;
            this.county = county;
        }

        public void setAddress(String street, String town, String countyc) {
            this.street = street;
            this.town = town;
            this.county = county;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getStreet() {
            return street;
        }

        public void setTown(String town) {
            this.town = town;
        }

        public String getTown() {
            return town;
        }

        public void setCounty(String county) {
            this.county = county;
        }

        public String getCounty() {
            return county;
        }

        public String toString() {
            return (street + " " + town + " " + county);
        }
    }
}
