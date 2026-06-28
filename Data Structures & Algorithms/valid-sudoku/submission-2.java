class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        int rowCount = board.length;
        int colCount = board[0].length;
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                char current = board[i][j];
                if (current == '.') {
                    continue;
                }

                if ((!seen.add(current + " found in row " + i))
                    || (!seen.add(current + " found in column " + j))
                    || (!seen.add(current + " found in box " + i / 3 + "," + j / 3)))
                    return false;
            }
        }
        return true;
    }
}
