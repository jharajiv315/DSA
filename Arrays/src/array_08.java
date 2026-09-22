public class array_08 {
    //    Q : Reverse array
    static void main(String[] args) {
    int[] arr = {36, 5, 63, 7, 8, 3, 39, 4};
    int n = arr.length;
    int i = 0;
    int j = n-1;
    int temp;
    for (int e : arr)
        System.out.print(e + " ");
    System.out.println();





    while (i<j){
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
    for (int ele : arr)
        System.out.print(ele + " ");



    }


}
