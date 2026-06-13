class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // product of prefix element:
        int[] prefixElement = new int[n];
        prefixElement[0] = 1;

        for (int i = 1; i < n; i++) {
            prefixElement[i] = nums[i - 1] * prefixElement[i - 1];
            //System.out.println("prefix Element: " + prefixElement[i]);
        }

        // product of suffix element:
        int[] suffixElement = new int[n];
        suffixElement[n - 1] = 1;

        for (int i = n - 2; i >= 0; i--) {
            suffixElement[i] = nums[i + 1] * suffixElement[i + 1];
            //System.out.println("Suffic Element: " + suffixElement[i]);
        }

        for (int i = 0; i < n; i++) {
            ans[i] = prefixElement[i] * suffixElement[i];
            //System.out.println("Final Product Element: " + ans[i]);
        }

        return ans;
    }
}
