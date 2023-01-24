import java.util.Scanner;

class Tesla{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] diffs=new int[n];
        for(int i=0;i<n;i++)
        {
            diffs[i]=sc.nextInt();
        }
        int[] ans=tesla(n,diffs);
        System.out.println(ans[0]+" "+ans[1]);
    }

    static int[] tesla(int n, int[] diffs) {
        int highestSpeed = 1500;
        int finalSpeed = 1500;
        for (int i = 0; i < n; i++) {
            finalSpeed += diffs[i];
            highestSpeed = Math.max(highestSpeed, finalSpeed);
        }
        return new int[] {highestSpeed, finalSpeed};
    }

}