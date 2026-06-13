class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];

        // Use words: Sorted and non decreasing
        // We can use Binary search
        // 2 pointer technique

        int frontP = 0;
        int backP = numbers.length - 1;

        while(frontP < backP){
            if(numbers[frontP] + numbers[backP] > target){
                    backP--;
            } else if(numbers[frontP] + numbers[backP] < target){
                    frontP++;
            } else {
                ans[0] = frontP + 1;
                ans[1] = backP + 1;
                break;
            }
        }

      return ans;  
    }
}
