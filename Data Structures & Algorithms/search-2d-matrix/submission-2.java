class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int rowIndex = binarySearchN(0, m - 1, matrix, target);


        if (rowIndex < 0 || rowIndex >= m) {
            return false;
        }

        int colIndex = binarySearchM(rowIndex, 0, n - 1, matrix, target);

        return colIndex != -1;
    }

    public int binarySearchN(int top, int bottom, int[][] array, int target) {
        int mid = top + (bottom-top)/2;

        if (top > bottom) {
            return bottom;
        }

        if (array[mid][0] == target) {
            return mid;
        } else if (array[mid][0] > target) {
            return binarySearchN(top, mid - 1, array, target);
        } else {
            return binarySearchN(mid + 1, bottom, array, target);
        }
    }

    public int binarySearchM(int n, int left, int right, int[][] array, int target) {
        int mid = left + (right-left)/2;

        if (left > right) {
            return -1;
        }

        if (array[n][mid] == target) {
            return mid;
        } else if (array[n][mid] > target) {
            return binarySearchM(n, left, mid - 1, array, target);
        } else {
            return binarySearchM(n, mid + 1, right, array, target);
        }
    }


}
