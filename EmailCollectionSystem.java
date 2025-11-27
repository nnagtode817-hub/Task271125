/*
 10. Unique Email Collection System
Read a list of email IDs from the user. 
Store them in a Set to automatically remove duplicates. 
Print all unique email IDs. This logic is frequently used in user registration and 
data cleanup operations

 */
package Task271125;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class EmailCollectionSystem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // hashset automatically remove duplicates
        
        Set<String> emailSet = new HashSet<>();
        System.out.println("Enter number of email IDs:  ");
        int n = sc.nextInt();
        sc.nextLine(); 
        
        System.out.println("Enter " + n + " email IDs: ");
        for(int i =0; i<n;i++) {
            String email = sc.nextLine().trim();
            emailSet.add(email);  //duplicates automatically removed
        }
        
        System.out.println("\n=====UNIQUE EMAIL IDs=======");
        for (String email : emailSet)  {
            System.out.println(email);
        }
    sc.close();
    }
}
