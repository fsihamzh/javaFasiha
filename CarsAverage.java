import java.util.scanner;

public class CarsAverage {
    private String carModel;
    private String carMake;
    private double carPrice;

    public CarsAverage(String model, String make, double price){
        this.carModel = model;
        this.carMake = make;
        this.carPrice = price;
    }

    public void displayDetails() {        
        System.out.println("model: " + carModel);
        System.out.println("make: " + carMake);
        System.out.println("price: " +carPrice);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of cars: ");
        int numCars = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the car name: ");
        String carName = scanner.nextLine();
        System.out.println("Enter the car make: ");
        String carMake = scanner.nextLine();
        System.out.println("Enter the car price: ");
        double carPrice = scanner.nextDouble();
        scanner.nextLine();
        CarsAverage car = new CarsAverage(carName, carMake, carPrice);
        
        car.displayDetails();
    }
}