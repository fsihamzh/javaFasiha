import java.util.Scanner;

public class IfElseSwitchAssignment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your desired car: ");
        System.out.println("1. Toyota");
        System.out.println("2. Honda");
        System.out.println("3. BMW");
        System.out.print("Enter your choice: ");

        int car = scanner.nextInt(); 
        String carType = ""; 
        double carPrice = 0; 

        switch (car) {
            case 1:
                carType = "Toyota";
                carPrice = 20000;
                break;
            case 2:
                carType = "Honda";
                carPrice = 25000;
                break;
            case 3:
                carType = "BMW";
                carPrice = 300000;
                break;
            default:
                System.out.println("CarType = Not valid");
                System.out.println("CarPrice = Not valid");
                scanner.close();
                return; 
        }

        System.out.println("CarType = " + carType);
        System.out.println("CarPrice = " + carPrice);

        if (carPrice > 100000.0) {
            System.out.println("The buyer is VIP");
        } else {
            System.out.println("The buyer is not VIP");
        }

        scanner.close(); 
    }
}