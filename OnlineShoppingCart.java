/*
 4. Online Shopping Cart Calculation
Create a Product class and add multiple products into a cart with price and quantity. 
Calculate total bill including GST (example 18%) and apply discount if the total price exceeds a 
defined amount. This reflects real e-commerce billing logic.

 */
package Task271125;

import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String name;
    double price;
    int quantity;
    
    public Product(String name, double price, int quantity)    {
        this.name = name;
        this.price= price;
        this.quantity= quantity;
    }
public double getTotalPrice()   {
    return price * quantity;
    
}
 
}

public class OnlineShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> cart = new ArrayList<>();
        
        System.out.println("====ONLINE SHOPPING CART===========");
        while (true)  {
            System.out.println("\nAdd Product  (yes/no):  ");
            String choice=sc.nextLine();
            
            if(choice.equalsIgnoreCase("no"))break;
            
            System.out.println("Enter Product Name:  ");
            String name= sc.nextLine();
            
            System.out.println("Enter Product price:  ");
            double price= sc.nextDouble();
            
            System.out.println("Enter Quantity:  ");
            int qty= sc.nextInt();
            sc.nextLine();
            
            cart.add(new Product(name,price,qty));
            System.out.println("Product added to cart");
        }
        double subtotal = 0;
        for (Product p : cart)  {
            subtotal  += p.getTotalPrice();
        }
        double gst=subtotal * 0.18;
        double discount = 0;
        
        
        //Apply discout if subtotal exceeds
        if (subtotal >1000) {
            discount = subtotal * 0.10;
        }
        double finalTotal = subtotal + gst - discount;
        
        // print a bill
        
        System.out.println("=====Final Bill===========");
        for (Product p : cart) {
            System.out.println(p.name +  "(x" + p.quantity + ")  : rs" + p.getTotalPrice());
            
            
            System.out.println("-----------------------------------");
            System.out.println("Subtotal          : rs"  +subtotal);
            System.out.println("GST (18%)         : rs"  +gst);
            System.out.println("Discount          : -rs"  +discount);
            System.out.println("-----------------------------------");
            System.out.println("Final Amount      : rs" + finalTotal);
            
            sc.close();
            
            
             
             
            
            
            
            
            
            
            
            
        }
        
    }
    
}