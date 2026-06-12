class Solution {

    public String encode(List<String> strs) {
        String encoded_string;
        StringBuffer sb = new StringBuffer();

        for(String ss: strs) {
            int tempCount = ss.length();
            char tempC = '#';
            sb.append(tempCount);
            sb.append(tempC);
            sb.append(ss);
        }

        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();

        int tempIndex = 0;

        while(tempIndex < str.length()) {
            int delimiterIndex = str.indexOf('#', tempIndex);
            int tempSize = Integer.parseInt(str.substring(tempIndex, delimiterIndex));
            
            String s = str.substring(delimiterIndex + 1, delimiterIndex + 1 + tempSize);
            decoded_strs.add(s);
            
            tempIndex = delimiterIndex + 1 + tempSize;

        }    






        return decoded_strs;

    }
}
