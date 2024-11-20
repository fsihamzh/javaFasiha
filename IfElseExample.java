public class IfElseExample {
    public static void main(String[] args) {

        int num =5;

        if (num >0){
            System.out.println("Number is positive");
        } if (num %2 == 0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is not positive");
        }

        String result = (num>0) ? "postive" : "not positive";
        System.out.println("Ternary result: " + result);
    }
}


/* Create a Switch which is going to obtain the car model from the 
terminal and give back the price, if the 
price is greater than 100,000 RM shows the buyer is VIP */