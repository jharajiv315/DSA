public class ifSortedOrNot {
    static void main(String[] args) {
        int[] arr = {1,3,5,6,15,22,55,76,86};
       boolean flag = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]) {
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("Sorted");
        else System.out.println("Not sorted");
    }
}
