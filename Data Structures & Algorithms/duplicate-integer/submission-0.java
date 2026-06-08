class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean result = false;
        Set<Integer> set = new HashSet<>();
        for(int i: nums) {
            boolean valuePresent = set.add(i);
            if(!valuePresent) {
                //System.out.println("Value here: "+ i+ " and result: " +valuePresent);
                result = true;
            }
        }
    return result;
    }
}