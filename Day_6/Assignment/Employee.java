package Day_6.Assignment;

public class Employee {
    private int empID;
    private String empName;
    private Address temporaryAddress;
    private Address permanentAddress;
    private Address[] empAddresses;
    private static int ID;
    static {ID = 0;}
    Employee(String empName,Address temporaryAddress, Address permanentAddress){
        this.empName = empName;
        this.empAddresses =new Address[] {temporaryAddress,permanentAddress};
        this.empID = ++ID;
    }

    public void displayEmployee(){
        System.out.println("Name: "+this.empName+"\nEmployeeID: "+this.empID);
        System.out.println("Temporary Address :"+empAddresses[0]);
        System.out.println("Permanent Address :"+empAddresses[1]);
    }

}
