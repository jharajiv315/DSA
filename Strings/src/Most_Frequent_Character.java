import java.util.HashMap;
import java.util.

public class Most_Frequent_Character {
//    '''Given a string s of lowercase alphabets. The task is to find the maximum occurring character in the string s. If more than one character occurs the maximum number of times then print the lexicographically smaller character.'''
public static char getMaxOccuringChar(String s) {
    // code here
    char arr[] = s.toCharArray();
    Arrays.sort(arr);
    int maxFreq = Integer.MIN_VALUE;
    char ans = arr[0];
    int i=0,j=0, n=arr.length;
    while(j<n){

        if(arr[i]==arr[j]){
            j++;
        }
        else{
            int freq = j-i;
            if(freq>maxFreq) ans = arr[i];
            maxFreq = Math.max(freq,maxFreq);
            i =j;


        }
    }
    int freq = j-i;
    if(freq>maxFreq) ans = arr[i];
    maxFreq = Math.max(freq,maxFreq);
    return ans;

}

}
