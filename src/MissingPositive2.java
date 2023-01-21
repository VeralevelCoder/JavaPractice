import java.util.Arrays;

public class MissingPositive2 {
    public static void main(String[] args) {
        System.out.println(positiveInt(new  int[]{-10000,-1203,-123,-456,-100,-1,-654,-242,-10,-17}));
    }
    public static int positiveInt(int[] nums){
//        System.out.println(Arrays.toString(a));
        Arrays.sort(nums);
//        System.out.println(Arrays.toString(a));
        int firstPositive=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                firstPositive=i;
                break;
            }else if(i==nums.length-1){
                return 1;
            }
        }
//        if(firstPositive==0){
//            return 1;
//        }
//        System.out.println(firstPositive);

        for(int i=firstPositive;i<nums.length;i++) {
            int temp=0;
                if ( nums[i]<= nums.length && nums[i] != nums[nums[i]-1]) {
                    temp = nums[nums[i] - 1];
                    nums[nums[i] - 1] = nums[i];
                    nums[i] = temp;
                }
        }for(int j=0;j<nums.length;j++){
           if(nums[j]!=j+1){
               return j+1;
            }
        }
        return nums.length+1;
    }
}
