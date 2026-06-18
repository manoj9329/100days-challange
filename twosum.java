public class twosum {
    public static int[] twoSumII(int num[], int target){

        int n = num.length;
        int left = 0;
        int right = n-1;

        while(left < right){
            int sum = num[right] + num[left];
            if (sum == target) {
                return new int[]{left + 1, right + 1};

            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{};

    }
    public static void main(String[] args) {
        int num[] = {2, 7, 11, 15};
        int target = 9;
          int[] result = twoSumII(num, target);

        System.out.println(result[0] + " " + result[1]);

        
    }
    
}
