public class array_05 {
    static void main(String[] args) {
//        Q : Two Sum
        int target = 45;
        int[] arr = {42,4,5,-18,63,23};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (target == arr[i]+arr[j]) {
                    System.out.println("Donee...");
                }

            }

        }
    }
}
