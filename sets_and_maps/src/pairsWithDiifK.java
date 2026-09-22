import java.util.HashSet;

public class pairsWithDiifK {
    static void main(String[] args) {
        int[] arr = {1,-2,6,7,5};
        System.out.println( countPairs(arr,5));
    }
    static int countPairs(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int j : arr) {
            set.add(j);
        }
        for (int j : arr) {
            if (set.contains(k - j)) {
                count++;
            }

        }
        return count;

    }

}
