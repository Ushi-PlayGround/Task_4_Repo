import java.util.Scanner;

public class Algo7 {

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
            }

            else {
                wordArray[wordArrayPosition] = word;
                word = "";
                wordArrayPosition +=1;
            }
            
        }
        wordArray[wordArrayPosition] = word;

        String longestWord = wordArray[0];
        String shortestWord = wordArray[0];
        // int countLetter = 0;

        for (int i = 0; i < wordArray.length; i++) {
            if (longestWord.toCharArray().length < wordArray[i].toCharArray().length) {
                longestWord = wordArray[i];
            } if (shortestWord.toCharArray().length > wordArray[i].toCharArray().length) {
                shortestWord = wordArray[i];
            }
            
        }
        System.out.println("Longest Word: " + longestWord + " & length of the word is " + longestWord.toCharArray().length);
        System.out.println("Shortest Word: "+ shortestWord + " & length of the word is " + shortestWord.toCharArray().length);

        // int[] lengthArray = new int[wordArray.length];

        // for (int i = 0; i < lengthArray.length; i++) {
        //     lengthArray[i] = wordArray[i].toCharArray().length;
        // }

        // int max = lengthArray[0];

        // for (int i = 0; i < lengthArray.length; i++) {
        //     if (max <= lengthArray[i]){
        //         max = lengthArray[i];
        //     }

        // }

        // for (int i = 0; i < lengthArray.length; i++) {
        //     if (max == lengthArray[i]){
        //         System.out.println(wordArray[i]);
        //     }
        // }
        
        

    }
}
