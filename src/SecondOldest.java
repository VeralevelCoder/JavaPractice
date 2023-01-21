import java.util.Scanner;

public class SecondOldest {

    public static void main(String[] args) {

        int[] a = new int[]{1,2,34,5};
        int[] b = new int[]{};

        for(int i =0; i<a.length;i++) {
            b[i]=Math.max(a[i],a[i+1]);
        }
        int len= b.length;
        System.out.println(b[len-1]);

    }

}
