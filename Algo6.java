import java.util.Scanner;

public class Algo6 {
    
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        
        String sentence;
        
        do{

        System.out.print("Enter a sentence: ");
        sentence = scanner.nextLine().strip();

        if (sentence.isBlank()){
            System.out.println("Invalid Sentence. Enter Again!");
        }

        
        } while (sentence.isBlank());

        char[] charSentence = sentence.toCharArray();
        int count = 0;
        String word = "";
        int wordArrayPosition = 0;

        for (int i = 0; i < charSentence.length; i++) {
            if (charSentence[i] == ' '){
                count += 1;
            }
        }


        String[] wordArray = new String[count+1];
        
        for (int i = 0; i < charSentence.length; i++) {
            if (charSentence[i] != ' '){
                word += charSentence[i];
                
            }else {
                wordArray[wordArrayPosition] = word;
                word = "";
                wordArrayPosition +=1;
            }
            
        }
        wordArray[wordArrayPosition] = word;

        for (int i = 0; i < wordArray.length/2; i++) {
            String k = wordArray[i];
            wordArray[i] = wordArray[wordArray.length - i -1];
            wordArray[wordArray.length - i -1] = k;
        }

        for (int i = 0; i < wordArray.length; i++) {
            System.out.print(wordArray[i]+ " ");
        }
        System.out.println();
    }
        
} 

