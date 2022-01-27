package oop;

public class Main {

    public static void main(String[] args){
        // Aggregation
        Address address = new Address( "Sylhet", "Bangladesh", 112);
        Employee employee = new Employee(30, "Java", address);
        employee.display();
    }
}
