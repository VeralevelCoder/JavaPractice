import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringRotate {public static void main(String args[]){
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int k = sc.nextInt();
//
//    ArrayList<Integer> numbers = new ArrayList<>();
//
//    for(int i=0;i<n;i++){
//        numbers.add(sc.nextInt());
//    }
    ArrayList<Integer> numbers = new ArrayList<>();
    int[] a = new int[]{1,2,3,4,5,6,7};
    for (int i = 0;i<a.length;i++){
        numbers.add(a[i]);
    }
    ArrayList<Integer> ans = rotateArray(numbers,3);
    for(Integer x:ans){
        System.out.print(x+" ");
    }
}

    static ArrayList<Integer> rotateArray(ArrayList<Integer> numbers,int k){

        k = k%numbers.size();
        ArrayList<Integer> b = new ArrayList<>();
        Collections.sort(b);
        for(int j=numbers.size()-k;j<numbers.size();j++){
            b.add(numbers.get(j));
        }
        for(int i = 0;i<numbers.size()-k;i++){
            b.add(numbers.get(i));
        }
        return b;
    }
}
