import java.util.Arrays;

public class CasesensitiveCount {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(upperAndLowerCaseCount("Character isUpperCase")));
        int[] output = upperAndLowerCaseCount("Character isUpperCase");
        System.out.println("Uppercase count :"+output[0]);
        System.out.println("Lowercase count :"+output[1]);

    }
    public static int[] upperAndLowerCaseCount(String a){

        a = a.replaceAll("\\s","");
        System.out.println(a);
        char[] b= a.toCharArray();
        int[] c = new int[2];
        for (int i=0;i<b.length;i++){
            if(Character.isUpperCase(b[i])){
                c[0]+=1;
            }else {
                c[1]+=1;
            }
        }
        return c;
    }
}
