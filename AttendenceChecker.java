/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task271125;
import java.util.*;

class Student {
    String name;
    int totalClasses;
    int attendedClasses;

    public Student(String name, int totalClasses, int attendedClasses) {
        this.name = name;
        this.totalClasses = totalClasses;
        this.attendedClasses = attendedClasses;
    }

    public double getAttendancePercentage() {
        return (attendedClasses * 100.0) / totalClasses;
    }

    public boolean isEligible() {
        return getAttendancePercentage() >= 75;
    }
}

public class AttendenceChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter total classes: ");
            int total = sc.nextInt();

            System.out.print("Enter classes attended: ");
            int attended = sc.nextInt();

            studentList.add(new Student(name, total, attended));
        }

        // Display results
        
        System.out.println("\n===== Attendance Report =====");
        for (Student s : studentList) {
            double percentage = s.getAttendancePercentage();
            System.out.printf("%s - %.2f%% - %s\n",
                    s.name,
                    percentage,
                    s.isEligible() ? "Eligible for Exam" : "Not Eligible"
            );
        }
    }
}