import java.util.Scanner;

public class Algo9 {
    
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        char[] charText;
        String text;
        boolean flag = false;
        do {

            System.out.print("Enter a text: ");
            text = scanner.next();

            if (!scanner.nextLine().trim().isEmpty()) {
                flag = true;
                continue;
            }
            

        } while (flag);

        charText = text.toCharArray();
        
        int count = 0;
        
        for (int i = 0; i < charText.length/2; i++) {
            if (charText[i] == charText[charText.length - i -1]) {
                count++;
            }
            
        }

        if (count == charText.length/2){
            System.out.println("Palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }
}
