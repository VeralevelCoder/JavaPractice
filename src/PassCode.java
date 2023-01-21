import java.util.Scanner;

public class PassCode {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        System.out.println(passCode(A,B));

    }

    static String passCode(String A,String B){

        String output="";
        if(A.length()>B.length()){
            int j=0;
            for(int i=0;i<B.length();i++){
                output+=A.charAt(i);
                output+=B.charAt(i);
                j++;
            }while(j<A.length()){
                output+=(A.charAt(j));
                j++;
            }

        }else{
            int k=0;
            for(int i=0;i<A.length();i++){
                output+=A.charAt(i);
                output+=B.charAt(i);
                k++;
            }while(k<A.length()){
            output+=(A.charAt(k));
            k++;
        }
        }
            return output;

        }
}
