import java.util.Scanner;

public class CarsAverage {
    private String model;
    private String make;
    private double price;

    public CarsAverage(String model, String make, double price) {
        this.model = model;
        this.make = make;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Make: " + make);
        System.out.println("Price: RM" + price);
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarsCollection carsCollection = new CarsCollection();

        System.out.println("Enter the number of cars:");
        int carCount = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < carCount; i++) {
            System.out.println("\nEnter details for car " + (i + 1) + ":");
            System.out.print("Model: ");
            String model = scanner.nextLine();
            System.out.print("Make: ");
            String make = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            carsCollection.addCar(new CarsAverage(model, make, price));
        }

        System.out.println("\n--- Car Details ---");
        carsCollection.displayAllCars();

        double averagePrice = carsCollection.calculateAveragePrice();
        System.out.println("\nAverage Price of Cars: RM" + averagePrice);

        scanner.close();
    }
}

class CarsCollection {
    private CarsAverage[] cars;
    private int count;

    public CarsCollection() {
        this.cars = new CarsAverage[100]; 
        this.count = 0;
    }

    public void addCar(CarsAverage car) {
        if (count < cars.length) {
            cars[count++] = car;
        } else {
            System.out.println("Car collection is full!");
        }
    }

    public void displayAllCars() {
        for (int i = 0; i < count; i++) {
            System.out.println("\nCar " + (i + 1) + ":");
            cars[i].displayDetails();
        }
    }

    public double calculateAveragePrice() {
        if (count == 0) return 0.0;

        double totalPrice = 0.0;
        for (int i = 0; i < count; i++) {
            totalPrice += cars[i].getPrice();
        }
        return totalPrice / count;
    }
}
