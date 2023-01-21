import java.util.Arrays;

public class FibonacciSeries {
    public static void main(String[] args) {
        fibonacciSeries(3);
    }
    public static void fibonacciSeries(int a){
        int[] b = new int[a];
        b[0]=0;
        b[1]=1;
        for(int i =2;i<a;i++) {
            b[i]=b[i-1]+b[i-2];
        }
        System.out.println(Arrays.toString(b));
    }
}
