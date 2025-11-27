/*
 9. Personal Task Scheduler
Allow users to add tasks, mark tasks as completed, 
and display only pending tasks. Maintain tasks using a List.
This resembles real task management features in productivity tools.

 */
package Task271125;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PersonalTaskScheduler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<String> tasks = new ArrayList<>();
        List<Boolean> Completed = new ArrayList<>();
        int Choice = 0;
        
        do{
            System.out.println("\n========Task Schedular========");
            System.out.println("1. Add Task");
            System.out.println("2. Mark task as Completed");
            System.out.println("3. Show Pending Tasks");
            System.out.println("4. Show All Tasks");
            System.out.println("5. Exit");
            
            switch (Choice) {
                case 1: 
                    System.out.println("Enter task name: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    Completed.add(false);
                    System.out.println("Task added");
                    
                case 2:
                    System.out.println("Enter task number to mark completed: ");
                    int num=sc.nextInt();
                    
                    if(num<=0 || num>tasks.size()) {
                        System.out.println("Invalid task numvber");
                    } else {
                        Completed.set(num-1, true);
                        System.out.println("Task marked as completed");
                    }
                break;
                case 3:
                      System.out.println("\n Pending Tasks");
                    for (int i =0; i<tasks.size();i++) {
                        if(!Completed.get(i)) {
                            System.out.println((i+1) + ". "  + tasks.get(i));
                        }
                    }
                break;
                case 4:
                    System.out.println("\n All Tasks : ");
                    for (int i =0;i<tasks.size();i++) {
                        System.out.println((i+1)  + " ." + tasks.get(i) + (Completed.get(i)? "(Completed)" : "(Pending"));
                    }
                break;
                case 5:
                    System.out.println("GoodBye");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        while(Choice !=5);
        sc.close();
                    
            }
        }
    

