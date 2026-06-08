class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList();
        HashMap<String, ArrayList<String>> map = new HashMap();

        for (String s : strs) {
            String sortedString = getSortedString(s);
            if (map.containsKey(sortedString)) {
                ArrayList<String> tempArray = map.get(sortedString);
                tempArray.add(s);
            } else {
                ArrayList<String> tempArry = new ArrayList();
                tempArry.add(s);
                map.put(sortedString, tempArry);
            }
        }

        for (String i : map.keySet()) {
            ans.add(map.get(i));
        }

        return ans;
    }

    private String getSortedString(String s) {
        char[] sChar = s.toCharArray();
        Arrays.sort(sChar);
        return new String(sChar);
    }
}
