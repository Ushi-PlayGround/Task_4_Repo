
import java.util.Scanner;

public class Algo5 {

    private static final Scanner scanner = new Scanner (System.in);   
    
    public static void main(String[] args) {

        String text;

        do {
        System.out.print("Enter a text: ");
        text = scanner.nextLine().strip();

        if (text.isBlank()){
            System.out.println("Text is Empty. Enter a Text Again!");
        }
        
        
        } while (text.isBlank());

        char[] charText = text.toCharArray();
        
       
        for (int i = 0; i < charText.length/2; i++) {
            
            char letter = charText[i];
            charText[i] = charText[charText.length-1-i];
            charText[charText.length-1-i] = letter;
            
        }
        for (int i = 0; i < charText.length; i++) {
            System.out.print(charText[i]);
        }
        System.out.println();
        

    }
}
