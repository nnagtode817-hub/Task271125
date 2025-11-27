/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task271125;

import java.util.*;

// Custom Exception for insufficient balance

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class ATM {
    private double balance;

    public ATM(double balance) {
        this.balance = balance;
    }

    // Deposit
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    // Withdraw
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("❌ Insufficient Balance! Withdrawal Failed.");
        }
        balance -= amount;
        System.out.println("Amount Withdrawn: " + amount);
    }

    // Balance check
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class ATMBanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ATM atm = new ATM(1000); // starting balance

        while (true) {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double dep = sc.nextDouble();
                        atm.deposit(dep);
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double wd = sc.nextDouble();
                        atm.withdraw(wd);
                        break;

                    case 3:
                        atm.checkBalance();
                        break;

                    case 4:
                        System.out.println("Thank you! Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}