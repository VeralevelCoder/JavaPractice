public class largestOfN {

    public static void main(String[] args) {

        int[] a = new int[]{1,2,6,8,5};

        System.out.println(largestNumber(a));

    }
    public static int largestNumber(int[] b){

        for(int i=0; i<b.length && i!=b.length-1;i++){
            if(b[i]>b[i+1]){
                int temp = b[i];
                b[i]=b[i+1];
                b[i+1]=temp;
            }
        }
        return b[b.length-1];
    }

}
