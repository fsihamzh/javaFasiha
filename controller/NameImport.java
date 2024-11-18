import java.util.Scanner; //import the scanner class

public class NameImport {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String enteredName = scanner.nextLine();
        System.out.println("Hello, " + enteredName + "!");

    }
    
}
