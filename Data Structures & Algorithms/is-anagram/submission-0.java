class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sCHarArray = s.toCharArray();
        Arrays.sort(sCHarArray);
        String sString = new String(sCHarArray);

        char[] tCHarArray = t.toCharArray();
        Arrays.sort(tCHarArray);
        String tString = new String(tCHarArray);

        if(sString.equals(tString)){
            return true;
        } else{
            return false;
        }

    }
}
