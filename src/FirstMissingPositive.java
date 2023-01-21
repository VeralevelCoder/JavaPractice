    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Collection;

    public class FirstMissingPositive {
        public static void main(String[] args) {

            System.out.println(missingPositiveNumber(new int[]{11,-19,7,1,-8,8,0,5,4,12,3,-14,-5,-15,-13,-17,18,15,16,-1,13,-4,19,10,-7,14,-11,-12,-20,2,-10,-2,-18,-9,9,-3,-16,20,6,17}));

        }public static int missingPositiveNumber(int[] a){
            ArrayList<Integer> b = new ArrayList<Integer>();
            for(int i =0;i<a.length;i++){
                if(a[i]>0){
                    b.add(a[i]);
                }

            }
            b.sort(null);
//            System.out.println(b);
            int first, last;
            first=b.get(0);
            last=b.get(b.size()-1);
            int[] c = new int[last];
            c[0]=first;
            c[c.length-1] = last;
            for(int j =first;j<last;j++){
                    c[j]=j+1;
            }
//            System.out.println(Arrays.toString(c));
            for(int i =0;i<b.size();i++){
                for(int j =i;j<c.length;j++){
                if(b.get(i)==c[j]){
                    c[j]=(c[j]*(-1));
                    }
                }
            }
            int postiveInt=0;
            for(int i =0;i< c.length;i++){
                if(c[i]>0&& i!=c.length-1){
                    postiveInt =c[i];
                    return postiveInt;
                }
                if(i==c.length-1){
                    int lastPositiveInt=c[c.length-1];
//                    System.out.println(lastPositiveInt);
                    postiveInt=(-(lastPositiveInt))+1;
                }
            }
            return postiveInt;
        }
    }
