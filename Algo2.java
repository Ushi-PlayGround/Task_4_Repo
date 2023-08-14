public class Algo2 {
    
    public static void main(String[] args) {
        
        int[] nums = {-5,2,7,10,58,-7,8,23};
        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length-1; i++) {
            if (max <= nums[i]){
                max = nums[i];
            }
            if (min >= nums[i]){
                min = nums[i];
            }
            
        }
        System.out.println(max);
        System.out.println(min);

    }
}
