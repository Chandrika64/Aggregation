package oop;

public class Employee {
    int id;
    String name;
    Address address;
    // For iniitialize Employee, we need help of Constructor
    Employee(int id, String name, Address address)
    {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    //For print
    void display()
    {
        System.out.println("Name of the student is: "+name);
        System.out.println("Id of the student is: "+id);
        System.out.println("House Number of the student is: "+address.HouseNo); //HAS_A type
        System.out.println("City: "+address.city+", Country: "+address.country);
    }
}
