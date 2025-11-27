/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task271125;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    String author;
   
    public Book(String title, String author )  {
        this.title = title;
        this.author = author;
         }

    public String toString() {
        return "Title : "  + title + ", Author : " + author;
    }

}
  
public class LibraryManagementSystem {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while (true)  {
            System.out.println("\n========== Library Menu===================");
            System.out.println("1. Add New Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Delete book by Title");
            System.out.println("5. Exit ");
            System.out.println("============================================");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.println("Enter Book Title:  ");
                    String title = sc.nextLine();
            
                    // check duplicate
                    boolean exists = false;
                    for(Book b : books) {
                        if (b.title.equalsIgnoreCase(title)) {
                            exists = true;
                            break;       
                        }
                    }
                  if (exists)  {
                      System.out.println("Book Already exists! Duplicate entries are not allowed");
                  }else {
                      
                  }
            
            
            }
        }
    }
    
}
