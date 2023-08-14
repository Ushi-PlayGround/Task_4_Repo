import java.util.Arrays;


public class Algo4 {

    public static void main(String[] args) {
        
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13};

        for (int i = 0 ; i < array.length/2; i++ ) {

            int k = array[i];
            array[i] = array[array.length -1-i];
            array[array.length-1-i] = k;
                    
        }
        System.out.println(Arrays.toString(array));

            
    }
}
