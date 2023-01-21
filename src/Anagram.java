import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(anagramCheck("below ","elbow"));
    }
    public static boolean anagramCheck(String a, String b){

        Set<String> input = new HashSet<>() {};
        input.add(a);
        input.add(b);
        boolean status = false;
        Iterator it = input.iterator();
        while (it.hasNext()){
            String curt = (String) it.next();
            for(int i=0;i<b.length();i++){
                if(curt.contains(String.valueOf(b.charAt(i))))                {
                    status=true;
                }else{
                    return false;
                }
            }
        }return status;
    }
}
