package Day_5.Assignment;

public class Main {
    public static void main(String[] args) {

        //Problem 1:
        Employee shaad = new Employee(120,"Shaad Anwar","Development",10000);
        Employee jhony = new Employee(130,"Jhony Depth","Admin",20000);
        Employee robert = new Employee(140,"Robert Downey Jr","Development",15000);
        Employee chris = new Employee(150,"Chris Hemsworth","Operation",18000);
        Employee ryan = new Employee(160,"Ryan Reynolds","HR",8000);

        Employee[] arr = {shaad,jhony,robert,chris,ryan};

        Employee.displayEmployees(arr);
        Employee.searchEmployees(arr,"Development");

        //Problem 2:

        Employee john = new Employee(120,"John Doe","Sales",15000);
        Employee jack = new Employee(120,"John Doe","Sales",10000);

        System.out.println(john.equals(jack));


    }
}
