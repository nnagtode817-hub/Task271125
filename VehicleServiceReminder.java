/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task271125;

import java.util.*;
import java.text.*;

public class VehicleServiceReminder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Date format supported in Java 7
           
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            sdf.setLenient(false);

            System.out.print("Enter last service date (dd-MM-yyyy): ");
            String inputDate = sc.nextLine();

            // Convert to Date object
            Date lastServiceDate = sdf.parse(inputDate);

            // Use Calendar for adding months
           
            Calendar cal = Calendar.getInstance();
            cal.setTime(lastServiceDate);
            cal.add(Calendar.MONTH, 6); // next service after 6 months

            Date nextServiceDate = cal.getTime();

            System.out.println("\nLast Service Date: " + sdf.format(lastServiceDate));
            System.out.println("Next Service Date: " + sdf.format(nextServiceDate));

            // Check if service is due within 15 days
            Calendar today = Calendar.getInstance();
            long diff = nextServiceDate.getTime() - today.getTimeInMillis();
            long daysLeft = diff / (1000 * 60 * 60 * 24);

            if (daysLeft <= 15 && daysLeft >= 0) {
                System.out.println("\n** Service Due Soon! **");
            } else if (daysLeft < 0) {
                System.out.println("\n** Service Overdue! Service immediately! **");
            } else {
                System.out.println("\nService Date is not near.");
            }

        } catch (Exception e) {
            System.out.println("Invalid date format! Please enter in dd-MM-yyyy format.");
        }
    }
}