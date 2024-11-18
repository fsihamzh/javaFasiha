public class Cars {
    private String model;
    private String make;
    private double price;

    public Cars(String model, String make, double price){
        this.model = model;
        this.make = make;
        this.price = price;
    }

    public void displayDetails() {
        String modelShow = "model: ";
        String makeShow = "make: ";
        String priceShow = "price: ";
        
        System.out.println("model: " + model);
        System.out.println("make: " + make);
        System.out.println("price: " + price);
    }

    public static void main(String[] args) {
        Cars c = new Cars("Bezza", "Perodua", 500000.00);
        c.displayDetails();
    }
}
