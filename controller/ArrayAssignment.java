public class ArrayAssignment {
    public static void main(String[] args) {
        String[][] carsModel = new String[3][3];
        carsModel[0][0] = "City"; carsModel[0][1] = "Vios"; carsModel[0][2] = "Persona"; 
        carsModel[1][0] = "BMW"; carsModel[1][1] = "Myvi"; carsModel[1][2] = "X50"; 
        carsModel[2][0] = "Rondo"; carsModel[2][1] = "Mazda"; carsModel[2][2] = "Civic"; 

        int[][] carsPrice = {
            {75000, 25000, 35000},
            {85000, 10000, 6000},
            {65000, 70000, 58000}
        };

        System.out.println("Display cars model values above RM 50,000: ");
        for (int row=0; row<carsModel.length; row++) {
            for (int col=0; col<carsModel[row].length; col++) {
            int price = carsPrice[row][col]; 
            if (price > 50000) {
                System.out.println(carsModel[row][col] + " " + price);
            }
        }
        
    }
}
}