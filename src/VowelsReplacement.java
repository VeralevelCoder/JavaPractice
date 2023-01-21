import java.util.HashMap;

public class VowelsReplacement {

    public static void main(String[] args) {

        System.out.println(replaceVowels("Photon Info Tech"));

    }
    public static String replaceVowels(String a){

        HashMap<Character,Integer> vowels = new HashMap<>();
        vowels.put('a',1);
        vowels.put('e',2);
        vowels.put('i',3);
        vowels.put('o',4);
        vowels.put('u',5);

        char[] arr = a.toCharArray();

        for(int i =0;i<arr.length;i++){
            if(vowels.containsKey(arr[i])){
                arr[i] = (char)(vowels.get(arr[i]) + '0');
            }
        }

        return new String(arr);
    }

}
//import java.util.HashMap;
//
//public class VowelsReplacement {
//
//    public static void main(String[] args) {
//        String a = "Photon Info Tech";
//        System.out.println(replaceVowels(a));
//
//    }
//    public static String replaceVowels(String a){
//
//        HashMap<Character, Integer> vowels = new HashMap<>();
//        vowels.put('a',1);
//        vowels.put('e',2);
//        vowels.put('i',3);
//        vowels.put('o',4);
//        vowels.put('u',5);
//
//        char[] arr = a.toCharArray();
//        for(int i =0; i<arr.length; i++){
//            if(vowels.containsKey(arr[i])){
//                arr[i] = (char)(vowels.get(arr[i]) + '0');
//            }
//        }
//        return new String(arr);
//    }
//
//}
