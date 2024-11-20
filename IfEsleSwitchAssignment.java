import java.util.Scanner;

public class IfEsleSwitchAssignment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your desire car: ");
        System.out.println("1. Toyota");
        System.out.println("2. Honda");
        System.out.println("3. BMW");
        System.out.print("Enter your choice");
        car = scanner.nextInt();

        int car;
        String CarType;
        double CarPrice;

        switch (car) {
            case 1:
                System.out.println("CarType = Toyota");
                System.out.println("CarPrice = 20000");
                break;
            case 2:
                System.out.println("CarType = Honda");
                System.out.println("CarPrice = 25000");
            break;
            case 3: 
                System.out.println("CarType = BMW");
                System.out.println("CarPrice = 30000");
                break;
            default:
                System.out.println("CarType = Not valid"); 
                System.out.println("CarPrice = Not valid");
        }

        if (CarPrice>100000.0){
            System.out.println("The buyer is VIP");
        }
        else{
            System.out.println("The buyer is not VIP");
        }

    } 
}
