// Test Person Address class - John French

public class TestPersonAddress {
    public static void main(String[] args) {
        System.out.println("Creating person1 with default constructor (blank name - blank address)");
        PersonAddress person1 = new PersonAddress();
        System.out.println("person1.toString(): " + person1.toString());
        System.out.println();

        System.out.println("Creating person2 Gerry Agnew - 1 Eyre Square, Galway, Co Galway");
        PersonAddress person2 = new PersonAddress("Gerry", "Agnew", "1 Eyre Square", "Galway", "Co Galway");
        System.out.println("person2.toString(): " + person2.toString());
        System.out.println();

        System.out.println("Updating person1's address using person1.setNameAddress('Mary', 'Murphy', 'My Street, My Town, Mayo')");
        person1.setNameAddress("Mary", "Murphy", "My Street", "My Town", "Mayo");
        System.out.println("person1.toString(): " + person1.toString());
        System.out.println();
    }
}
