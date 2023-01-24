import java.util.Scanner;

class FizzBuzz {
    public static String[] fizzBuzz(int n) {
        String[] output =  new String[n];
//        output[0]=String.valueOf(1);
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                output[i-1]= "FizzBuzz";
//                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                output[i-1]= "Fizz";
//                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                output[i-1]= "Buzz";
//                System.out.println("Buzz");
            } else {
                output[i-1]= String.valueOf(i);
            }
        }
        return output;
    }
        public static void main(String[] args)
        {
//            Scanner sc=new Scanner(System.in);
//            int n=sc.nextInt();
            String [] ans=fizzBuzz(15);
            for(int i=0;i<ans.length;i++)
            {
                System.out.println(ans[i]);
            }
        }
}