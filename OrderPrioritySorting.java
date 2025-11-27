/*
 8. Order Priority Sorting
Create an Order class with priority levels such as High, Medium, and Low. 
Store multiple orders in a list and sort them so High priority orders appear first. 
Display them in sorted order. This is used in customer support ticketing systems.
 */
package Task271125;

import java.util.*;

class Order implements Comparable<Order> {
    String orderName;
    String priority; // High, Medium, Low

    public Order(String orderName, String priority) {
        this.orderName = orderName;
        this.priority = priority;
    }

    // Define priority order
    private int getPriorityValue() {
        switch (priority.toLowerCase()) {
            case "high": return 1;
            case "medium": return 2;
            case "low": return 3;
            default: return 4; // unknown
        }
    }

    @Override
    public int compareTo(Order o) {
        return Integer.compare(this.getPriorityValue(), o.getPriorityValue());
    }
}

public class OrderPrioritySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Order> orderList = new ArrayList<>();

        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();
        sc.nextLine();  // newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter order name: ");
            String name = sc.nextLine();

            System.out.print("Enter priority (High/Medium/Low): ");
            String priority = sc.nextLine();

            orderList.add(new Order(name, priority));
        }

        // Sort orders based on priority
        Collections.sort(orderList);

        System.out.println("\nSorted Orders by Priority:");
        for (Order o : orderList) {
            System.out.println(o.orderName + " - " + o.priority);
        }
    }
}