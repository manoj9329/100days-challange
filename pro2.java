public class pro2 {

    public boolean containsDuplicate(int[] nums) {

        for(int i=0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if (nums[i] == nums[j]) {
                    return true;
                    
                }
            }
        }

        }
        return false;
    }
    public static void main(String[] args) {
        pro2 obj = new pro2();
        int[] nums = {1, 2, 3, 1};

        System.out.println(obj.containsDuplicate(nums));
        
    }
    
}
