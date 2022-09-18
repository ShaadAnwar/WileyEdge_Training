package Day_6.Assignment;

public class Main_Employee {
    public static void main(String[] args) {

    Address temporaryAddress = new Address("2B", "Anwar", "Park Circus", "Kolkata");
    Address permanentAddress = new Address("1B", "Shaad", "Palm Avenue", "Kolkata");

    Employee shaad = new Employee("Shaad Anwar", temporaryAddress, permanentAddress);

    shaad.displayEmployee();

}
}
