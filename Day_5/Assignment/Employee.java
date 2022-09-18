package Day_5.Assignment;

import java.util.Arrays;

public class Employee {
    private int empid;
    private String empName;
    private String empDept;
    private double empBasicSalary;
    private double empGrossSalary;

    Employee(int empid,String empName,String empDept, double empBasicSalary){
        this.empid = empid;
        this.empName = empName;
        this.empDept = empDept;
        this.empBasicSalary = empBasicSalary;
        double HRA = 0.12*empBasicSalary;
        double DA = 0.09*empBasicSalary;
        this.empGrossSalary = this.empBasicSalary+HRA+DA;
    }

    @Override
    public String toString() {
        return this.empName;
    }

    @Override
    public boolean equals(Object obj) {
        if(this.empName == ((Employee)obj).empName && this.empid == ((Employee)obj).empid)
            return true;
        return false;
    }

    public static void displayEmployees(Employee[] arr){
        sortEmployees(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void sortEmployees(Employee[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            boolean check =false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j].empGrossSalary>arr[j+1].empGrossSalary){
                    double temp = arr[j+1].empGrossSalary;
                    arr[j+1].empGrossSalary = arr[j].empGrossSalary;
                    arr[j].empGrossSalary = temp;
                    check = true;
                }
            }
            if(!check)
                break;
        }
    }
    public static void searchEmployees(Employee[] arr,String dept){
        for(Employee emp:arr){
            if(emp.empDept == dept)
                System.out.print(emp.empName+" ");
        }
        System.out.println();
    }
}
