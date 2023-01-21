import java.util.Scanner;

public class ClassRepresentative {

    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] num=new int[n];
//        for(int i=0;i<n;i++)
//        {
//            num[i]=sc.nextInt();
//        }
        int[] num = new int[]{12, 65, 12, 72, 11, 72};
        System.out.println(classRepresentative(num, 6));
    }

    static String classRepresentative(int[] num, int n) {

        String status = null;
        for (int i = 0; i < n/2; i++) {
            if (num[i] < num[i+2]) {
                i++;
                status="Increasing";
            } else if(num[i]==num[i+2]) {
                i++;
                status="None";
            }else{
                return "Decreasing";
            }
        }
        return status;
    }
}
