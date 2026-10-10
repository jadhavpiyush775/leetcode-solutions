class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

    int top = 0;
    int bottom = matrix.length - 1;
    int left = 0;
    int right = matrix[0].length - 1;

    while (top <= bottom && left <= right) {

        // 1. Top row: left to right
        for (int j = left; j <= right; j++) {
            list.add(matrix[top][j]);
        }
        top++;

        // 2. Right column: top to bottom
        for (int i = top; i <= bottom; i++) {
            list.add(matrix[i][right]);
        }
        right--;

        // 3. Bottom row: right to left
        if (top <= bottom) {
            for (int j = right; j >= left; j--) {
                list.add(matrix[bottom][j]);
            }
            bottom--;
        }

        // 4. Left column: bottom to top
        if (left <= right) {
            for (int i = bottom; i >= top; i--) {
                list.add(matrix[i][left]);
            }
            left++;
        }
    }

    return list;

    }
}