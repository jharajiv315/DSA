public class mergeSort {
    static void main() {
        int[] arr = {32,44,45,85,89,24,54,79,69};

        int lo = 0, hi = arr.length - 1;
        mergesort(arr,lo,hi);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }

    private static void mergesort(int[] arr,int lo,int hi) {
        int mid = lo + (hi - lo)/2;
        int n = arr.length;
        if(lo>=hi) return;
        mergesort(arr,lo,mid);
        mergesort(arr,mid+1,hi);
        merge(lo,mid,hi,arr);
    }
    private static void merge(int lo,int mid,int hi,int[] arr) {
        int n  = arr.length;
        int[] sorted = new int[hi-lo+1];

        int i = lo, j = mid+1,k = 0;
        while (i <= mid && j <= hi) {
            if (arr[i] <= arr[j]) {
                sorted[k++] = arr[i++];
            } else  {
                sorted[k++] = arr[j++];
            }

        }
        while (i <= mid) {
            sorted[k++] = arr[i++];
        }
        while (j <= hi) {
            sorted[k++] = arr[j++];
        }
        for (int l = lo; l < hi ; l++) {
            arr[l] = sorted[l-lo];
        }

    }
}
