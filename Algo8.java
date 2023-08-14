public class Algo8 {
    
    public static void main(String[] args) {
        
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};

        
        System.out.print("numA \u2229 numB = { ");
        for (int i = 0; i < numA.length; i++) {
            for (int j = 0; j < numB.length; j++) {
                if (numA[i] == numB[j]){
                    System.out.print(numA[i] + ",");

                }
            }
            
        }

        System.out.println("\b }");
        System.out.println();



        System.out.print("numA \u222A numB = { ");
        for (int i = 0; i < numA.length; i++) {
            System.out.print(numA[i]+ ",");
        }
        for (int i = 0; i < numB.length; i++) {
            System.out.print(numB[i] + ",");
        }
        System.out.println("\b }");
        System.out.println();



        System.out.print("numA \\ numB = { ");
       
        boolean flag = false;
        for (int i = 0; i < numA.length; i++) {  
            for (int j = 0; j < numB.length; j++) {
               if (numA[i] == numB[j]){
                    flag = true;
                    break;
               }
            }
            if (!flag){
                System.out.print(numA[i] + ",");
            } else{
                flag = false;
            }
        }
        System.out.println("\b }");
        System.out.println();



        System.out.print("numA \u25B3 numB = { ");
        boolean flag2 = false;
        for (int i = 0; i < numA.length; i++) {  
            for (int j = 0; j < numB.length; j++) {
               if (numA[i] == numB[j]){
                    flag2 = true;
                    break;
               }
            }
            if (!flag2){
                System.out.print(numA[i] + ",");
            } else{
                flag2 = false;
            }
        }

        for (int i = 0; i < numB.length; i++) {  
            for (int j = 0; j < numA.length; j++) {
               if (numB[i] == numA[j]){
                    flag2 = true;
                    break;
               }
            }
            if (!flag2){
                System.out.print(numB[i] + ",");
            } else{
                flag2 = false;
            }
        }

        System.out.println("\b }");
        System.out.println();

        
    } 
}

