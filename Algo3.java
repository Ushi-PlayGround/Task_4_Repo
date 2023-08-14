public class Algo3 {
    public static void main(String[] args) {
        
        int[] nums = {10,20,30,40,50};
        int[] oppociteNum = new int[nums.length];

        for (int i = 0, j = nums.length -1 ; i < nums.length; i++,j--) {

            oppociteNum[i] = nums[j];
            System.out.println(oppociteNum[i]);

        }
    }
        
}
