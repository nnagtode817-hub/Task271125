/*
 2. Salary Slip Generator
Build an Employee class that stores name, employee ID, and basic salary. 
Calculate HRA (20%), PF (12%), and net salary. Print a professional formatted salary slip. 
This is similar to payroll modules in HR software.
 */
package Task271125;

import java.util.Scanner;



class Employee {
    String name;
    String empId;
    double basicSalary;
    
    
   public Employee(String name, String empId, double basicSalary ) {
       this.name =name;
       this.empId =empId;
       this.basicSalary = basicSalary;
   }
    public double calculateHRA() {
        return basicSalary * 0.20;
    }
    public double calculatePF() {
        return basicSalary * 0.12;
    }

   public double calculateNetSalary() {
       return basicSalary + calculateHRA() - calculatePF();
               
   }
   public void printSalarySlip() {
       System.out.println("\n===============================================");
       System.out.println("              SALARY SLIP");
       System.out.println("==================================================");
       System.out.println("EMPLOYEE NAME  : " + name);
       System.out.println("EMPLOYEE ID    : " + empId);
       System.out.println("--------------------------------");
       System.out.println("Basic Salary   :"  + basicSalary);
       System.out.println("HRA (20%)      :"  + calculateHRA());
       System.out.println("PF (12%)       :"  + calculatePF());
       System.out.println("---------------------------------");
       System.out.println("Net Salary     : " + calculateNetSalary());
       System.out.println("==================================================");
       
   }
}

         public class SalarySlipGenerator {
             public static void main(String[] args) {
                 Scanner sc = new Scanner(System.in);
                 
                 System.out.println("Enter Employee Name : ");
                 String name = sc.nextLine();
                 
                 System.out.println("Enter Employee ID : ");
                 String empId = sc.nextLine(); 
                 
                 System.out.println("Enter Basic Salary : ");
                 double basicSalary = sc.nextDouble();
                 
                 Employee emp = new Employee(name, empId, basicSalary);
                 emp.printSalarySlip();
                 
                 sc.close();
                         
                         
             }
    
}
