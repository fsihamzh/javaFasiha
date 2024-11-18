public class PrivateVariables {
    private String name;
    private int age;
    private boolean isAlive;
    private long networth; //long does have limit
    private double salary;

    public PrivateVariables(String name, int age, boolean isAlive, long networth, double salary){
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
        this.networth = networth;
        this.salary = salary; 
    }

    public void displayDetails(){
        String nameShow = "Name";
        String ageShow = "Age";
        String isAliveShow = "isAlive";
        String networthShow = "networth";
        String salaryShow = "salary";
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("isAlive: " + isAlive);
        System.out.println("networth: " + networth);
        System.out.println("salary: " + salary);
    }

    public static void main(String[] args) {
        PrivateVariables pv = new PrivateVariables("Fasiha", 23, true, 22222, 5000.0);
        pv.displayDetails();
    }
}
