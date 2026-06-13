class Solution {
    public boolean isPalindrome(String s) {
        boolean ans = true;

        char[] charArray = s.toLowerCase().toCharArray();
        int sizeOfArray = s.length();
        int frontP = 0;
        int backP = sizeOfArray - 1;

        while (frontP <= backP) {
            boolean ff = isAlphaNumericChar(charArray[frontP]);
            boolean bb = isAlphaNumericChar(charArray[backP]);

            if (!ff) {
                frontP++;
            }

            if (!bb) {
                backP--;
            }

            if (ff && bb) {
                if (charArray[frontP] == charArray[backP]) {
                    frontP++;
                    backP--;
                    continue;
                } else {
                    ans = false;
                    break;
                }
            }
        }

        return ans;
    }

    public boolean isAlphaNumericChar(char c) {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
            return true;
        } else {
            return false;
        }
    }
}
