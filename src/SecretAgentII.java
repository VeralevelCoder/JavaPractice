import java.util.Arrays;

public class SecretAgentII {
    public static void main(String[] args) {
        System.out.println(encryptedMessage("One Two three Four"));
    }
    public static String encryptedMessage(String s){

        //creating an array of string without any spaces
        String[] b = s.split("\\s");
        //iteratiting through the array
        for(int i=0;i<b.length;i++){
            StringBuilder sb = new StringBuilder();
            //finding  the odd lengthed string
            if(!(b[i].length()%2==0)){
                for(int j =b[i].length()-1;j>=0;j--){
                    //reversing the string
                    sb.append(b[i].charAt(j));
                    // adding the string
                }b[i]= sb.toString();
            }
        }
        StringBuilder sb2  = new StringBuilder();
        //iterating through the final array and adding spaces to produce the last output
        for (int k=0;k<b.length;k++){
            sb2.append(b[k]+" ");
        }
        return sb2.toString();
    }
}
