import java.util.HashSet;

public class distinctEle {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n =  arr.length;
        HashSet<Integer> set = new HashSet<>();
        for (int j : arr) set.add(j);

        System.out.println(set.size());

    }
}
