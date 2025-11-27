import java.util.Scanner;

public class UserLoginSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        // Check valid email
        if (!email.contains("@") || !email.contains(".") || email.length() < 5) {
            System.out.println("Invalid Email");
        }
        // Check valid password
        else if (password.length() < 8) {
            System.out.println("Password too short");
        }
        else {
            System.out.println("Login Successful");
        }

        sc.close();
    }
}