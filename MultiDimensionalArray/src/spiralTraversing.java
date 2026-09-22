

public class spiralTraversing {
    static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9},{1, 1, 2}};
        print(arr);
      int firstRow = 0;
        int lastRow = arr.length - 1;
        int firstCol = 0;
        int lastCol = arr[0].length - 1;
        while (firstRow <= lastRow && firstCol <= lastCol) {
            for (int i = firstCol; i <= lastCol; i++) {
                System.out.print(arr[firstRow][i]);
                firstRow++;

            }
            for (int i = firstRow; i <= lastRow; i++) {
                System.out.print(arr[i][lastCol]);
                lastCol--;
            }
            for (int i = lastCol; i >= firstCol; i--) {
                System.out.print(arr[lastRow][i]);
                lastRow--;

            }
            for (int i = lastRow; i >= firstRow; i--) {
                System.out.print(arr[i][firstCol]);
                firstCol++;

            }
            
        }
    }

    private static void print(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}

class Solution {
    int majorityElement(int arr[]) {

        int tar = 0;
        int count = 0;

        // Find tar
        for(int num : arr) {
            if(count == 0) {
                tar = num;
                count = 1;
            }
            else if(num == tar) {
                count++;
            }
            else {
                count--;
            }
        }

        // Verify tar
        count = 0;
        for(int num : arr) {
            if(num == tar) {
                count++;
            }
        }

        if(count > arr.length / 2) {
            return tar;
        }

        return -1;
    }
}
