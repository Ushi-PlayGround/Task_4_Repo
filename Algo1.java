import java.util.Scanner;

public class Algo1{

    private final static Scanner scanner = new Scanner (System.in);

    public static void main(String[] args) {

        int number;

        do {
            System.out.print("Enter a positive Integer: ");
            number = scanner.nextInt();
            scanner.nextLine();

            if (number < 0) System.out.println("Invalid Number. Enter a Positive Number");

        } while (number < 0);

        int x = 0;
        int y = 1;
        while (true){
            int z = x + y;
            if (z > number) {
                break;
            } else System.out.print(z + ",");
            x = y;
            y = z;
            
        }
        System.out.println("\b ");
            
    }
        
}
    
